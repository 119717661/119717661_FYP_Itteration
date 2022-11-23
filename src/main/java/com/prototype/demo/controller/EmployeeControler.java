package com.prototype.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam int eID)
	{
		ModelAndView mv = new ModelAndView("showEmployee.jsp");
		Employee employee = repo.findById(eID).orElse(new Employee());

		System.out.println(repo.findByeType("Manager"));

		mv.addObject(employee);
		return mv;

		
	}
}

