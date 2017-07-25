package com.webapp.project.modules.expense.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.expense.dao.ExpenseDao;
import com.webapp.project.modules.expense.model.Expense;


@Service("expenseService")
@Transactional
public class ExpenseServiceImpl implements ExpenseService{

	@Autowired
	private ExpenseDao dao;
	
	public Expense findById(int id) {
		return dao.findById(id);
	}

	public void saveSection(Expense expense) {
		expense.setCreateDate(new Date());
		expense.setModifyDate(new Date());
		dao.save(expense);
	}

	

	public List<Expense> findAllExpense() {
		return dao.findAllExpense();
	}

	public void updateExpense(Expense expense) {
		// TODO Auto-generated method stub
		
	}

	public void saveExpense(Expense expense) {
		// TODO Auto-generated method stub
		
	}

	
}
