package com.webapp.project.modules.customer.dao;

import java.util.List;

import com.webapp.project.modules.customer.model.Customer;

public interface CustomerDao {

	 public void addCustomer(Customer p);
	 
	 public void updateCustomer(Customer p);
	 
	 public List<Customer> listCustomers();
	 
	 public Customer getCustomerById(int id);
	 
	 public void removeCustomer(int id);
	
}
