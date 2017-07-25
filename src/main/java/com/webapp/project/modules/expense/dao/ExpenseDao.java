package com.webapp.project.modules.expense.dao;

import java.util.List;

import com.webapp.project.modules.expense.model.Expense;

public interface ExpenseDao {

	Expense findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Expense expense);
	
	//void deleteBySSO(String sso);
	
	List<Expense> findAllExpense();
}
