package com.webapp.project.modules.invoice.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;

@Repository("invoiceDao")
public class InvoiceDaoImpl  extends AbstractDao<Integer, InvoiceVoucher> implements InvoiceDao{

	public Invoice findById(int id) {

		return null;
	}

	public Long save(InvoiceVoucher invoice) {
		InvoiceVoucher inv = new InvoiceVoucher();
		inv = invoice;
	    Long id =saveAndReturn(inv);
	return id;
	}
	public void updateInv(InvoiceVoucher invoice) {
		update(invoice);
	}
	public void deleteInv(InvoiceVoucher[] invoicelist) {
		for(InvoiceVoucher invoice:invoicelist){
		delete(invoice);
		}
	}

	public List<InvoiceVoucher> findAllInvoice() {

		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<InvoiceVoucher> sections = (List<InvoiceVoucher>) criteria.list();
		return sections; 
	}

}
