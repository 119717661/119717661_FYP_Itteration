package com.prototype.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.demo.dao.TaskRepo;
import com.prototype.demo.model.Task;

@Controller
public class TaskController {
        
    @Autowired
	TaskRepo repo;

	@RequestMapping("/task")
    public String home(Model model) {
      model.addAttribute("task");
      return "task";
    }

    @GetMapping("/showAllTasks")
    public String getAllTasks(Model model) {
        List<Task> tasks = repo.findAll();
        model.addAttribute("tasks", tasks);
        return "showAllTasks";
    }

}
