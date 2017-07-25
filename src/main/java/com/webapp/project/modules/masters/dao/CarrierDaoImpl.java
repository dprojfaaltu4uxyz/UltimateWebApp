package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Carrier;

@Repository("carrierDao")
public class CarrierDaoImpl  extends AbstractDao<Integer, Carrier> implements CarrierDao{

	public Carrier findById(int id) {

		return null;
	}

	public void save(Carrier carrier) {
		persist(carrier);
	}

	public List<Carrier> findAllCarriers() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("carrier"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Carrier> carriers = (List<Carrier>) criteria.list();
		return carriers; 
	}

}
