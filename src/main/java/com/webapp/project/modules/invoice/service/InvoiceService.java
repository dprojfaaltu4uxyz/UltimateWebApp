package com.webapp.project.modules.invoice.service;

import java.util.List;

import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;

public interface InvoiceService {

	Invoice findById(int id);
	
	Long saveInvoice(InvoiceVoucher invoice);
	
	void updateInvoice(InvoiceVoucher invoice);
	void deleteInv(InvoiceVoucher[] invoice);
	List<InvoiceVoucher> findAllInvoice(); 
}


