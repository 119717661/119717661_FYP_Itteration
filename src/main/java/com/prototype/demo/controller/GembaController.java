package com.prototype.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.demo.model.Gemba;
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

    @PostMapping("/gemba")
    public String saveGembaInformation(Gemba gemba) {
        gembaService.saveGembaInformation(gemba);
        return "redirect:/gemba";
    }
}
