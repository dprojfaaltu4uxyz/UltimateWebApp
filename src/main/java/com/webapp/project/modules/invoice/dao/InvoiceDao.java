package com.webapp.project.modules.invoice.dao;

import java.util.List;

import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;



public interface InvoiceDao {

	Invoice findById(int id);
	
	//Teacher findBySSO(String sso);
	
	Long save(InvoiceVoucher invoice);
	void updateInv(InvoiceVoucher invoice);
	void deleteInv(InvoiceVoucher[] invoice);
	
	List<InvoiceVoucher> findAllInvoice();
}
