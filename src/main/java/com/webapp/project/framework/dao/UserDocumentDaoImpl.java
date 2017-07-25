package com.webapp.project.framework.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.model.UserDocument;

@Repository("userDocumentDao")
public class UserDocumentDaoImpl extends AbstractDao<Integer, UserDocument> implements UserDocumentDao{

	@SuppressWarnings("unchecked")
	public List<UserDocument> findAll() {
		Criteria crit = createEntityCriteria();
		return (List<UserDocument>)crit.list();
	}

	public void save(UserDocument document) {
		persist(document);
	}

	
	public UserDocument findById(Long id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	public List<UserDocument> findAllByUserId(Long userId){
		Criteria crit = createEntityCriteria();
		Criteria userCriteria = crit.createCriteria("user");
		userCriteria.add(Restrictions.eq("id", userId));
		return (List<UserDocument>)crit.list();
	}

	
	public void deleteById(Long id) {
		UserDocument document =  getByKey(id);
		delete(document);
	}

}
