package com.sakha.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {

	
	@GetMapping("/add")
	public String add(@RequestParam("t1")int a,@RequestParam("t2")int b,Model m) {
		int sum = a+b;
		m.addAttribute("sum",sum);
		return "show";
	}
	
	@GetMapping("/")
		public String Default() {
		return "index";
	}

	
}
