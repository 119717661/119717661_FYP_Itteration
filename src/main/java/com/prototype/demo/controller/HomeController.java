package com.prototype.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.demo.dao.EmployeeRepo;

@Controller
public class HomeController
{

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}

}

