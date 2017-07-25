package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.masters.model.Agent;



public interface AgentDao {

	Agent findById(Long id);
	
	String save(Agent agent);
	
	String updateAgent(Agent agent);
	
	List<Agent> findAllAgents();
	
	String deleteAgent(Agent agent);
}
