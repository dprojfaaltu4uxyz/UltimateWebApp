package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.AirAgent;

public interface AirAgentService {

	AirAgent findById(Long id);
	
	String saveAirAgent(AirAgent airAgent);
	
	String updateAirAgent(AirAgent airAgent);

	List<AirAgent> findAllAirAgent(); 
	
	String deleteAirAgent(AirAgent airAgent);
}


