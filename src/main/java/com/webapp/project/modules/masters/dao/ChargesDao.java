package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Charge;



public interface ChargesDao {

	Charge findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Charge charges);
	
	//void deleteBySSO(String sso);
	
	List<Charge> findAllCharges();
}
