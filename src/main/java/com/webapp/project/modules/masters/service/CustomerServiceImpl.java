package com.webapp.project.modules.masters.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.masters.dao.AgentDao;
import com.webapp.project.modules.masters.dao.CustomerDao;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.Customer;


@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao dao;
	
	public Customer findById(Long id) {
		return dao.findById(id);
	}

	public String saveCustomer(Customer customer) {
		customer.setCreateDate(new Date());
		customer.setModifiedDate(new Date());
		return dao.saveCustomer(customer);
	}

	public List<Customer> findAllCustomers() {
		return dao.findAllCustomers();
	}

	public String updateCustomer(Customer customer) {
		customer.setCreateDate(new Date());
		customer.setModifiedDate(new Date());
		return dao.updateCustomer(customer);
	}

	public String deleteCustomer(Customer customer) {
		return dao.deleteCustomer(customer);
	}
}
