package com.prototype.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prototype.demo.dao.EmployeeRepo;
import com.prototype.demo.model.Employee;

@Controller
public class EmployeeController

{
	@Autowired
	private EmployeeRepo repo;
	@Autowired
	public void setRepo(EmployeeRepo repo) {
		this.repo = repo;
	}
	@RequestMapping("/employee")
	public String employee()
	{
		return "employee.jsp";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee)
	{
		repo.save(employee);
		return "employee.jsp";
	}
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam int eID)
	{
		ModelAndView mv = new ModelAndView("showEmployee.jsp");
		Employee employee = repo.findById(eID).orElse(new Employee());

	

		mv.addObject(employee);
		return mv;

		
	}
	

	@RequestMapping("/showAllEmployees")
	public ModelAndView showAllEmployees()
	{
		ModelAndView mv = new ModelAndView("showAllEmployees.jsp");
		
		List<Employee> employees = new ArrayList<>();
        
       	

		mv.addObject(employees);
		return mv;

		
	}



}

