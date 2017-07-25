package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.masters.model.Cha;

@Repository("chaDao")
public class CHADaoImpl  extends AbstractDao<Integer, Cha> implements CHADao{

	public Cha findById(int id) {

		return null;
	}

	public void save(Cha cha) {
		persist(cha);
	}

	public List<Cha> findAllCha() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("cha"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Cha> chas = (List<Cha>) criteria.list();
		return chas; 
	}

}
