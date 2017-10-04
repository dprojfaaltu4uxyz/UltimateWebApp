package com.webapp.project.framework.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.webapp.project.framework.model.DropDownOption;

@Repository("dropDownDao")
public class DropDownDaoImpl implements DropDownDao{

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<DropDownOption> getOptions(String entityName, String nameProp,
			String valueProp, String filter,String firstParam,String secondParam,String thirdParam) {
		String where = StringUtils.isEmpty(filter) ? "":" "+ filter;
		final String hql = "SELECT " + valueProp + "," + nameProp  + " FROM " + entityName + where;
		
		//List<DropDownOption> options = getHibernateTemplate().fin

		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		
		
		if(!StringUtils.isEmpty(firstParam)){
			query.setParameter("firstParam", "%"+firstParam+"%");
		}
		if(!StringUtils.isEmpty(secondParam)){
			query.setParameter("secondParam", secondParam);
		}
		if(!StringUtils.isEmpty(thirdParam)){
			query.setParameter("thirdParam", thirdParam);
		}
		
		List<DropDownOption> options = new ArrayList<>();
		List<Object[]> rows = query.list();
		for(Object[] row : rows){
			DropDownOption dropDownOption = new DropDownOption();
			dropDownOption.setKey(String.valueOf(row[1]));
			dropDownOption.setValue(row[0].toString());
			options.add(dropDownOption);
		}

		return options;
	}
}

