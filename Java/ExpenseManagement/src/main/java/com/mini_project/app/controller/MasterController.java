package com.mini_project.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mini_project.app.entity.Expense;
import com.mini_project.app.service.ExpenseService;

@Controller
public class MasterController {

	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "list of expenses");
		List<Expense> expenses = expenseService.findAll();
		System.out.println(expenses);
		return mav;
	}
}
