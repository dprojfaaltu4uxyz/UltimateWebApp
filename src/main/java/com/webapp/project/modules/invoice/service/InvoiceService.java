package com.webapp.project.modules.invoice.service;

import java.util.List;

import com.webapp.project.modules.invoice.model.Invoice;

public interface InvoiceService {

	Invoice findById(int id);
	
	void saveInvoice(Invoice invoice);
	
	void updateInvoice(Invoice invoice);

	List<Invoice> findAllInvoice(); 
}


