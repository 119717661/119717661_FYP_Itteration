package com.prototype.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.demo.dao.ProcessRepo;
import com.prototype.demo.model.Process;

@Controller
public class ProcessController {
    
    @Autowired
	ProcessRepo repo;

	@RequestMapping("/process")
	public String process()
	{
		return "process.jsp";
	}

    @RequestMapping("/addProcess")
	public String addProcess(Process process)
	{
		repo.save(process);
		return "process.jsp";
	}
	
}
