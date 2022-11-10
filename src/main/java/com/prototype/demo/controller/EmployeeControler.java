package com.prototype.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.demo.dao.EmployeeRepo;
import com.prototype.demo.model.Employee;

@Controller
public class EmployeeControler
{
	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee)
	{
		repo.save(employee);
		return "home.jsp";
	}
}
