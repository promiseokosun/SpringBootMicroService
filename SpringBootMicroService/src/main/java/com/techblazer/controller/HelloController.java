package com.techblazer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/welcome")
	public String welcomePage() {
		return "index";
	}
	
	@RequestMapping("/")
	public String defaultPage() {
		return "redirect:/welcome";
	}

}
