package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Customer;


public interface CustomerDao {

	String saveCustomer(Customer customer);
	 
	 String updateCustomer(Customer customer);
	 
	 List<Customer> findAllCustomers();
	 
	 Customer findById(Long id);
	 
	 String deleteCustomer(Customer customer);
	
}
