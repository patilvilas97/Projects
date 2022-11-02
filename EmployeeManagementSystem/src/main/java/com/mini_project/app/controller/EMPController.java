package com.mini_project.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EMPController {

	@GetMapping(value="/")
	public String home() {
		return "homepage";
	}
	
}
