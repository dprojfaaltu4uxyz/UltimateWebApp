package com.webapp.project.modules.customer.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.customer.dao.CustomerDao;
import com.webapp.project.modules.customer.model.Customer;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;
	 
    public void setCustomerDAO(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
 
    @Transactional
    public void addCustomer(Customer c) {
        this.customerDao.addCustomer(c);
    }
 
    @Transactional
    public void updateCustomer(Customer c) {
        this.customerDao.updateCustomer(c);
    }
 
    @Transactional
    public List<Customer> listCustomers() {
        return this.customerDao.listCustomers();
    }
 
    @Transactional
    public Customer getCustomerById(int id) {
        return this.customerDao.getCustomerById(id);
    }
 
    @Transactional
    public void removeCustomer(int id) {
        this.customerDao.removeCustomer(id);
    }
}
