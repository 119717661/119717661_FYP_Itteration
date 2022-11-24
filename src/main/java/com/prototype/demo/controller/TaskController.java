package com.prototype.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prototype.demo.dao.TaskRepo;
import com.prototype.demo.model.Task;
@Controller
public class TaskController {
        
    @Autowired
	TaskRepo repo;

	@RequestMapping("/task")
	public String process()
	{
		return "task.jsp";
	}

    @RequestMapping("/addTask")
	public String addTask(Task task)
	{
		repo.save(task);
		return "task.jsp";
	}

	@RequestMapping("/getTasks")
	public ModelAndView getEmployee(@RequestParam int proc_id)
	{
		ModelAndView mv = new ModelAndView("showTasks.jsp");
		Task tasks = repo.findById(proc_id).orElse(new Task());



		mv.addObject(tasks);
		return mv;

		
	}
}
