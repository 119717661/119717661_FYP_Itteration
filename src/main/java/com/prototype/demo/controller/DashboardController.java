package com.prototype.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class DashboardController
{

	@RequestMapping("/dashboard")
	public String home(Model model) {
	  model.addAttribute("dashboard");
	  return "dashboard";
	}

}

