package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.framework.model.AppUser;
import com.webapp.project.modules.masters.model.Agent;

@Repository("agentDao")
public class AgentDaoImpl  extends AbstractDao<Integer, Agent> implements AgentDao{

	public Agent findById(Long id) {
		Agent agent = getByKey(id);
		if(agent!=null){
			Hibernate.initialize(agent.getPort());
		}
		return agent;
	}

	public String save(Agent agent) {
		String status = persistAndReturn(agent);
		return status;
	}

	public List<Agent> findAllAgents() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("agentName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Agent> agents = (List<Agent>) criteria.list();
		return agents; 
	}

	public String updateAgent(Agent agent) {
		return updateAndReturn(agent);
	}

	public String deleteAgent(Agent agent) {
		return deleteAndReturn(agent);
	}

}
