package com.prototype.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.prototype.demo.service.ProcessService;
import com.prototype.demo.service.TaskService;

@Controller
public class GembaController {

@Autowired
ProcessService processService;
@Autowired
TaskService taskService;



@RequestMapping("/gemba")
public String home(Model model) {
model.addAttribute("gemba");
return "gemba";
}

@GetMapping("/gemba")
public String gemba(Model model) {
model.addAttribute("processes", processService.getAllProcesses());
model.addAttribute("tasks", taskService.getAllTasks());
return "gemba";
}



}