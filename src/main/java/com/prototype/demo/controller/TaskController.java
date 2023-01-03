package com.prototype.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prototype.demo.dao.ProcessRepo;
import com.prototype.demo.model.Task;
import com.prototype.demo.model.Process;
import com.prototype.demo.service.ProcessService;
import com.prototype.demo.service.TaskService;
@Controller
public class TaskController {
        

    @Autowired
    TaskService taskService;

    @Autowired
    ProcessService processService;

	@RequestMapping("/task")
    public String home(Model model) {
      model.addAttribute("task");
      return "task";
    }

    @GetMapping("/showAllTasks")
    public String getAllTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "showAllTasks";
    }

    @GetMapping("/addTask")
    public String addTaskForm(Model model) {
        model.addAttribute("task", new Task());
        model.addAttribute("processes", processService.getAllProcesses());
        return "addTask";
    }


}
