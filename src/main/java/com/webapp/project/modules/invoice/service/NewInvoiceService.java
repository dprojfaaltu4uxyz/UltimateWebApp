package com.webapp.project.modules.invoice.service;

import java.util.ArrayList;

import com.webapp.project.modules.invoice.model.InvoiceVoucher;

public interface NewInvoiceService {
	
	void saveInvoice(ArrayList<InvoiceVoucher> data);		
}


