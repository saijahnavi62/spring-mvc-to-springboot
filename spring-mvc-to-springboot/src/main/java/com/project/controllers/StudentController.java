package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	StudentController(){
		System.out.println("Im here");	}
	
	@ResponseBody
	@GetMapping("/home")
	public String show() {
		return "Hellooo welcome home page";
	}

}
