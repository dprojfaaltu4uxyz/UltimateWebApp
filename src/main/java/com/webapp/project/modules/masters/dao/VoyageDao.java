package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Voyage;



public interface VoyageDao {

	Voyage findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Voyage voyage);
	
	//void deleteBySSO(String sso);
	
	List<Voyage> findAllVoyages();
}
