package com.webapp.project.modules.classes.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.classes.model.Classes;

@Repository("classesDao")
public class ClassesDaoImpl  extends AbstractDao<Integer, Classes> implements ClassesDao{

	public Classes findById(int id) {

		return null;
	}

	public void save(Classes classes) {
		persist(classes);
	}

	public List<Classes> findAllClasses() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("classes"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Classes> classes = (List<Classes>) criteria.list();
		return classes; 
	}

}
