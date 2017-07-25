package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.LocalFees;

@Repository("localFeesDao")
public class LocalFeesDaoImpl  extends AbstractDao<Integer, LocalFees> implements LocalFeesDao{

	public LocalFees findById(int id) {

		return null;
	}

	public void save(LocalFees localFees) {
		persist(localFees);
	}

	public List<LocalFees> findAllLocalFees() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("localFees"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<LocalFees> localFees = (List<LocalFees>) criteria.list();
		return localFees; 
	}

}
