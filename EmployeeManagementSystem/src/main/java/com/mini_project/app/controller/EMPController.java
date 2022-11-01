package com.mini_project.app.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class EMPController {

	@GetMapping(value="/")
	public String home() {
		return "index";
	}
	
}
