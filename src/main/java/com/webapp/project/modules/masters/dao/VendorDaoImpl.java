package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Vendor;

@Repository("vendorDao")
public class VendorDaoImpl  extends AbstractDao<Integer, Vendor> implements VendorDao{

	public Vendor findById(int id) {

		return null;
	}

	public void save(Vendor vendor) {
		persist(vendor);
	}

	public List<Vendor> findAllVendors() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("vendor"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Vendor> vendors = (List<Vendor>) criteria.list();
		return vendors; 
	}

}
