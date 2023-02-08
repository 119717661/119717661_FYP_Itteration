package com.prototype.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prototype.demo.dao.GembaRepo;
import com.prototype.demo.model.Gemba;
import com.prototype.demo.model.Task;
import com.prototype.demo.service.GembaService;
import com.prototype.demo.service.ProcessService;
import com.prototype.demo.service.TaskService;

@Controller
public class GembaController {

    @Autowired
    ProcessService processService;
    @Autowired
    TaskService taskService;
    @Autowired
    GembaService gembaService;
    @Autowired
    GembaRepo gembaRepository;

    

    @RequestMapping("/gemba")
    public String home(Model model) {
        model.addAttribute("gemba", new Gemba());
        return "gemba";
    }

    @GetMapping("/gemba")
    public String gemba(Model model) {
        model.addAttribute("processes", processService.getAllProcesses());
        model.addAttribute("tasks", taskService.getAllTasks());
        return "gemba";
    }

    
    @PostMapping("/saveGemba")
public ModelAndView saveGemba(Gemba gemba, HttpServletRequest request) {
Integer maxGembaId = gembaRepository.findMaxGembaID();
if (maxGembaId == null) {
maxGembaId = 0;
}
for (Task task : taskService.getAllTasks()) {
Gemba newGemba = new Gemba();
newGemba.setGembaID(maxGembaId + 1);
newGemba.setTaskID(task.getTaskid());
newGemba.setTaskName(task.getTaskname());
newGemba.setProcessName(task.getProcess().getProcName());
newGemba.setTimeOfTask(request.getParameter("time-of-task-" + task.getTaskid()));
gembaService.saveGemba(newGemba);
maxGembaId++;
}
return new ModelAndView("redirect:/viewgemba");
}
    
    @GetMapping("/viewgemba")
    public String viewGemba(Model model) {
        model.addAttribute("gembas", gembaService.getAllGembas());
        return "viewgemba";
    }
    
    }