package com.webapp.project.modules.customer.service;

import java.util.List;

import com.webapp.project.modules.customer.model.Customer;

public interface CustomerService {

	 public void addCustomer(Customer p);
	 
	 public void updateCustomer(Customer p);
	 
	 public List<Customer> listCustomers();
	 
	 public Customer getCustomerById(int id);
	 
	 public void removeCustomer(int id);	
}
