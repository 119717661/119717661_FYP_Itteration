package com.prototype.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScheduleController {
    

    @RequestMapping("/schedule")
	public String home(Model model) {
	  model.addAttribute("schedule");
	  return "schedule";
	}

}