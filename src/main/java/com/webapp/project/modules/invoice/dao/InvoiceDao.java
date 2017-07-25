package com.webapp.project.modules.invoice.dao;

import java.util.List;

import com.webapp.project.modules.invoice.model.Invoice;



public interface InvoiceDao {

	Invoice findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Invoice invoice);
	
	//void deleteBySSO(String sso);
	
	List<Invoice> findAllInvoice();
}
