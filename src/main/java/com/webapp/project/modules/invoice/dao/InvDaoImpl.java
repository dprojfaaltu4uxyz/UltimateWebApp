package com.webapp.project.modules.invoice.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;

@Repository("invDao")
public class InvDaoImpl  extends AbstractDao<Integer, InvoiceVoucher> implements InvDao{

	public InvoiceVoucher findById(int id) {

		return null;
	}

	public void save(InvoiceVoucher invoice) {
		persist(invoice);
	}

	public List<InvoiceVoucher> findAllInvoice() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("invoice"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<InvoiceVoucher> sections = (List<InvoiceVoucher>) criteria.list();
		return sections; 
	}

}
