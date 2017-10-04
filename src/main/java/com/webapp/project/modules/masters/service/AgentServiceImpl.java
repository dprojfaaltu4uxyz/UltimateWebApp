package com.webapp.project.modules.masters.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.masters.dao.AgentDao;
import com.webapp.project.modules.masters.model.Agent;


@Service("agentService")
@Transactional
public class AgentServiceImpl implements AgentService{

	@Autowired
	private AgentDao dao;
	
	public Agent findById(Long id) {
		return dao.findById(id);
	}

	public String saveAgent(Agent agent) {
		agent.setCreateDate(new Date());
		agent.setModifiedDate(new Date());
		
		return dao.save(agent);
	}

	public List<Agent> findAllAgent() {
		return dao.findAllAgents();
	}

	public String updateAgent(Agent agent) {
		agent.setCreateDate(new Date());
		agent.setModifiedDate(new Date());
		return dao.updateAgent(agent);
	}

	@Override
	public String deleteAgent(Agent agent) {
		return dao.deleteAgent(agent);
	}
}
