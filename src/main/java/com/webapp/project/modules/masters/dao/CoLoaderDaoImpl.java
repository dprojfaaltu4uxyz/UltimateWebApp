package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.CoLoader;

@Repository("coLoaderDao")
public class CoLoaderDaoImpl  extends AbstractDao<Integer, CoLoader> implements CoLoaderDao{

	public CoLoader findById(int id) {

		return null;
	}

	public void save(CoLoader coLoader) {
		persist(coLoader);
	}

	public List<CoLoader> findAllCoLoaders() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("invoice"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<CoLoader> coLoaders = (List<CoLoader>) criteria.list();
		return coLoaders; 
	}

}
