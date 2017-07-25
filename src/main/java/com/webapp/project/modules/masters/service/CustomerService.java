package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.Customer;

public interface CustomerService {

	Customer findById(Long id);
	
	String saveCustomer(Customer customer);
	
	String updateCustomer(Customer customer);

	List<Customer> findAllCustomers(); 
	
	String deleteCustomer(Customer customer);
}


