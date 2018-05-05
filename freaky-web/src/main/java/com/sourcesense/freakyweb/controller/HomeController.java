package com.sourcesense.freakyweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/c1")
	public String home() {
		return "home";
	}
	
}
