package com.mini_project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mini_project.app.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
