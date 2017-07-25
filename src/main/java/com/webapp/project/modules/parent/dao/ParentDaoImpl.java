package com.webapp.project.modules.parent.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.framework.dao.UserDaoImpl;
import com.webapp.project.modules.parent.model.Parent;



@Repository("parentDao")
public class ParentDaoImpl extends AbstractDao<Integer, Parent> implements ParentDao {

	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	public Parent findById(int id) {
		Parent parent = getByKey(id);
		return parent;
	}

	@SuppressWarnings("unchecked")
	public List<Parent> findAllParents() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Parent> parents = (List<Parent>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
		return parents;
	}


	public void save(Parent parent) {
		// TODO Auto-generated method stub
		persist(parent);
	}


}
