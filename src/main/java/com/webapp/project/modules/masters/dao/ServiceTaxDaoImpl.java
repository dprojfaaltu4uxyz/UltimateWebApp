package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Tax;

@Repository("serviceTaxDao")
public class ServiceTaxDaoImpl  extends AbstractDao<Integer, Tax> implements ServiceTaxDao{

	public Tax findById(int id) {

		return null;
	}

	public void save(Tax serviceTax) {
		persist(serviceTax);
	}

	public List<Tax> findAllServiceTaxs() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("serviceTax"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Tax> serviceTaxs = (List<Tax>) criteria.list();
		return serviceTaxs; 
	}

}
