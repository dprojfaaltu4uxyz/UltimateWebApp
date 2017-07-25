package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.AirAgent;

@Repository("airAgentDao")
public class AirAgentDaoImpl  extends AbstractDao<Integer, AirAgent> implements AirAgentDao{

	public AirAgent findById(Long id) {

		return null;
	}

	public String save(AirAgent airAgent) {
		return persistAndReturn(airAgent);
	}

	public List<AirAgent> findAllAirAgents() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("airAgent"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<AirAgent> airAgents = (List<AirAgent>) criteria.list();
		return airAgents; 
	}

	public String deleteAirAgent(AirAgent airAgent) {
		return deleteAirAgent(airAgent);
	}

	public String updateAirAgent(AirAgent airAgent) {

		return updateAirAgent(airAgent);
	}
}
