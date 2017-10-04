package com.webapp.project.modules.invoice.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.invoice.dao.InvoiceDao;
import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;


@Service("invoiceService")
@Transactional
public class InvoiceServiceImpl implements InvoiceService{

	@Autowired
	private InvoiceDao dao;
	
	public Invoice findById(int id) {
		return dao.findById(id);
	}

	public Long saveInvoice(InvoiceVoucher invoice) {
		invoice.setCreateDate(new Date());
		invoice.setModifyDate(new Date());				
		return dao.save(invoice);
	}

	

	public List<InvoiceVoucher> findAllInvoice() {
		return dao.findAllInvoice();
	}

	public void updateInvoice(InvoiceVoucher invoice) {
		dao.updateInv(invoice);
	}
	public void deleteInv(InvoiceVoucher[] invoice) {
		dao.deleteInv(invoice);
	}
	
}
