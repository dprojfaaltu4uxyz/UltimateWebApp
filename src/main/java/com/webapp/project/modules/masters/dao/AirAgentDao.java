package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.AirAgent;



public interface AirAgentDao {

	AirAgent findById(Long id);
	
	String save(AirAgent airAgent);
	
	String updateAirAgent(AirAgent airAgent);
	
	String deleteAirAgent(AirAgent airAgent);
	
	List<AirAgent> findAllAirAgents();
}
