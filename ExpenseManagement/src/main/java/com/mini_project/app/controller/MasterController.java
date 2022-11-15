package com.mini_project.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasterController {

	@RequestMapping(value="/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "list of expenses");
		return mav;
	}
}
