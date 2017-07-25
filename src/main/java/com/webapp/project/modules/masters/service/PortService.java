package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.Port;

public interface PortService {

	Port findById(Long id);
	
	void savePort(Port port);
	
	void updatePort(Port port);

	List<Port> findAllPorts(); 
}


