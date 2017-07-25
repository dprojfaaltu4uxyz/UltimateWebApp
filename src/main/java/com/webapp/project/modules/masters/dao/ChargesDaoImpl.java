package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Charge;

@Repository("chargesDao")
public class ChargesDaoImpl  extends AbstractDao<Integer, Charge> implements ChargesDao{

	public Charge findById(int id) {

		return null;
	}

	public void save(Charge charges) {
		persist(charges);
	}

	public List<Charge> findAllCharges() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("charges"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Charge> charges = (List<Charge>) criteria.list();
		return charges; 
	}

}
