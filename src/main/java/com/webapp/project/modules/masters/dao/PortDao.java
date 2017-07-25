package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Port;



public interface PortDao {

	Port findById(Long id);
	
	//Teacher findBySSO(String sso);
	
	void save(Port port);
	
	//void deleteBySSO(String sso);
	
	List<Port> findAllPorts();
}
