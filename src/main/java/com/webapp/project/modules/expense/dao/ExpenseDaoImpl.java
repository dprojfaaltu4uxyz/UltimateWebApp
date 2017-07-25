package com.webapp.project.modules.expense.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.expense.model.Expense;

@Repository("expenseDao")
public class ExpenseDaoImpl  extends AbstractDao<Integer, Expense> implements ExpenseDao{

	public Expense findById(int id) {

		return null;
	}

	public void save(Expense expense) {
		persist(expense);
	}

	public List<Expense> findAllExpense() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("expense"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Expense> expenses = (List<Expense>) criteria.list();
		return expenses; 
	}

}
