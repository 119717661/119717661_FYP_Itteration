package com.prototype.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/addTask")
    public String addTask(@RequestParam("process-select") Long procID, @RequestParam("taskName") List<String> taskNames) {
        Process process = processService.getProcessById(procID);
    
        for (String taskName : taskNames) {
            Task task = new Task();
            task.setTaskname(taskName);
            task.setProcess(process);
            taskService.save(task);
        }
    
        return "redirect:/showAllTasks";
    }

@GetMapping("/editTask/{id}")
public String editTaskForm(@PathVariable("id") Long id, Model model) {
    Task task = taskService.getTaskById(id);
    List<Process> processes = processService.getAllProcesses();
    model.addAttribute("task", task);
    model.addAttribute("processes", processes);
    return "editTaskModal";
}


@PostMapping("/editTask")
public String editTask(@ModelAttribute("task") Task task) {
    taskService.updateTask(task);
    return "redirect:/showAllTasks";
}

@GetMapping("/deleteTask/{id}")
public String deleteTask(@PathVariable("id") Long id) {
    taskService.deleteTaskById(id);
    return "redirect:/showAllTasks";
}
    
}
