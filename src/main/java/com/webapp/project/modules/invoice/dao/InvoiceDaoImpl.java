package com.webapp.project.modules.invoice.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.invoice.model.Invoice;

@Repository("invoiceDao")
public class InvoiceDaoImpl  extends AbstractDao<Integer, Invoice> implements InvoiceDao{

	public Invoice findById(int id) {

		return null;
	}

	public void save(Invoice invoice) {
		persist(invoice);
	}

	public List<Invoice> findAllInvoice() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("invoice"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Invoice> sections = (List<Invoice>) criteria.list();
		return sections; 
	}

}
