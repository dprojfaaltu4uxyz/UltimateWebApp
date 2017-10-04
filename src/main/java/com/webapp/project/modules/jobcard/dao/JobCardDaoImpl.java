package com.webapp.project.modules.jobcard.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.jobcard.model.Jobcard;

@Repository("jobCardDao")
public class JobCardDaoImpl  extends AbstractDao<Integer, Jobcard> implements JobCardDao{

	public Jobcard findById(Long id) {
		return findById(id);
	}

	public String save(Jobcard jobCard) {
		return persistAndReturn(jobCard);
	}

	public List<Jobcard> findAllJobCards() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("jobCode"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Jobcard> jobCards = (List<Jobcard>) criteria.list();
		return jobCards; 
	}

	public String updateJobCard(Jobcard jobCard) {
		return updateAndReturn(jobCard);
	}

	public String deleteJobCard(Jobcard jobCard) {
		return deleteAndReturn(jobCard);
	}


}
