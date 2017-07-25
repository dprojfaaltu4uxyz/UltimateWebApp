package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Location;



public interface LocationDao {

	Location findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Location location);
	
	//void deleteBySSO(String sso);
	
	List<Location> findAllLocations();
}
