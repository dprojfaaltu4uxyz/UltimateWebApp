package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Cha;



public interface CHADao {

	Cha findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Cha cha);
	
	//void deleteBySSO(String sso);
	
	List<Cha> findAllCha();
}
