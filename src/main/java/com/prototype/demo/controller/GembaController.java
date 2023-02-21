package com.prototype.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prototype.demo.dao.GembaListRepo;
import com.prototype.demo.dao.GembaRepo;
import com.prototype.demo.model.Gemba;
import com.prototype.demo.model.GembaList;
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
@Autowired
GembaListRepo gembaListRepository;
    

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


    @GetMapping("/viewGemba")
    public String viewGemba(Model model) {
        model.addAttribute("gembaLists", gembaListRepository.findAll());
        model.addAttribute("gemba", gembaRepository.findAll());
        return "viewGemba";
    }
    



  @PostMapping("/saveGembaData")
  public String saveSchedule(@RequestParam("weekNumber") String weekNumber, @RequestParam("taskid") List<String> taskIds,
      @RequestParam("taskname") List<String> taskNames, @RequestParam("processName") List<String> processNames, 
      @RequestParam("timeOfTask") List<String> timesOfTask, @RequestParam("date") List<String> dates) {
      
      // Create a new GembaList and save it
      GembaList gembaList = new GembaList();
      gembaList.setListNumber(weekNumber);
      gembaListRepository.save(gembaList);
    
      // Create a Gemba record for each task and save it
      for (int i = 0; i < taskIds.size(); i++) {
          Gemba gemba = new Gemba();
          gemba.setTaskID(taskIds.get(i));
          gemba.setTaskname(taskNames.get(i));
          gemba.setProcessName(processNames.get(i));
          gemba.setTimeOfTask(timesOfTask.get(i));
          gemba.setDate(dates.get(i));
          gemba.setGembaList(gembaList); // set the GembaList for each Gemba record
          gembaRepository.save(gemba);
      }
      
      return "redirect:/viewGemba";
  }
  



    
}