package com.example.demo.sample.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.sample.Form.DateForm;

@Controller
public class DateController {
	
	@GetMapping("/")
	public String index() {
		return "input";//input.htmlの表示
	}
	
	@PostMapping("/output")
	public String confirm(@ModelAttribute DateForm dateForm)
	{
		
		return "output";
	}
		

}
