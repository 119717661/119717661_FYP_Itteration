package com.prototype.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class GembaController
{

	@RequestMapping("/gemba")
	public String home()
	{
		return "gemba.jsp";
	}

}

