package com.webapp.project.framework.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.model.AppUser;



@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, AppUser> implements UserDao {

	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	public AppUser findById(Long id) {
		AppUser user = getByKey(id);
		if(user!=null){
			Hibernate.initialize(user.getUserProfiles());
		}
		return user;
	}

	public AppUser findBySSO(String sso) {
		logger.info("SSO : {}", sso);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("ssoId", sso));
		AppUser user = (AppUser)crit.uniqueResult();
		if(user!=null){
			Hibernate.initialize(user.getUserProfiles());
		}
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<AppUser> findAllUsers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<AppUser> users = (List<AppUser>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
		return users;
	}

	public void save(AppUser user) {
		persist(user);
	}
	
	public String saveTeacher(AppUser user) {
		String status = persistAndReturn(user);
		return status;
	}
	
	public String saveStudent(AppUser user) {
		String status = persistAndReturn(user);
		return status;
	}
	
	public String saveParent(AppUser user) {
		String status = persistAndReturn(user);
		return status;
	}
	

	public void deleteBySSO(String sso) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("ssoId", sso));
		AppUser user = (AppUser)crit.uniqueResult();
		delete(user);
	}

}
