package com.mini_project.app.service;

import java.util.List;

import com.mini_project.app.entity.Expense;

public interface ExpenseService {

	List<Expense> findAll();
}
