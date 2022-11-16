package com.mini_project.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini_project.app.entity.Expense;
import com.mini_project.app.repository.ExpenseRepository;

@Service
public class ExpenseServiceImplementation implements ExpenseService {
 
	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

}
