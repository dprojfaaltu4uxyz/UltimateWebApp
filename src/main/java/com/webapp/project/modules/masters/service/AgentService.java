package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.Agent;

public interface AgentService {

	Agent findById(Long id);
	
	String saveAgent(Agent agent);
	
	String updateAgent(Agent agent);

	List<Agent> findAllAgent(); 
	
	String deleteAgent(Agent agent);
}


