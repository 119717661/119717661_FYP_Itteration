package com.prototype.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.demo.dao.TaskRepo;

@Controller
public class TaskController {
        
    @Autowired
	TaskRepo repo;

	@RequestMapping("/task")
    public String home(Model model) {
      model.addAttribute("task");
      return "task";
    }


}
