package com.webapp.project.modules.invoice.dao;

import java.util.List;

import com.webapp.project.modules.invoice.model.InvoiceVoucher;



public interface InvDao {

	InvoiceVoucher findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(InvoiceVoucher invoice);
	
	//void deleteBySSO(String sso);
	
	List<InvoiceVoucher> findAllInvoice();
}
