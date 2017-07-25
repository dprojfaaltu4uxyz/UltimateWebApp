package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Carrier;



public interface CarrierDao {

	Carrier findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Carrier carrier);
	
	//void deleteBySSO(String sso);
	
	List<Carrier> findAllCarriers();
}
