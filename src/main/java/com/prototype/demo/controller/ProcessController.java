package com.prototype.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.demo.model.Process;
import com.prototype.demo.service.ProcessService;

@Controller
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @RequestMapping("/process")
    public String home(Model model) {
      model.addAttribute("process");
      return "process";
    }

    @GetMapping("/processes")
    public String getAllProcesses(Model model) {
        List<Process> processes = processService.getAllProcesses();
        model.addAttribute("processes", processes);
        return "processes";
    }

	@GetMapping("/gemba")
public String getGembaPage(Model model) {
    List<Process> processes = processService.getAllProcesses();
    model.addAttribute("processes", processes);
    return "gemba";
}
}