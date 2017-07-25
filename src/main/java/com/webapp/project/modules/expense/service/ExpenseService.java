package com.webapp.project.modules.expense.service;

import java.util.List;

import com.webapp.project.modules.expense.model.Expense;

public interface ExpenseService {

	Expense findById(int id);
	
	void saveExpense(Expense expense);
	
	void updateExpense(Expense expense);

	List<Expense> findAllExpense(); 
}


