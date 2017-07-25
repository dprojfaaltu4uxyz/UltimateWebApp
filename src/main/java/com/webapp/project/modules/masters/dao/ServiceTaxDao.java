package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Tax;



public interface ServiceTaxDao {

	Tax findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Tax serviceTax);
	
	//void deleteBySSO(String sso);
	
	List<Tax> findAllServiceTaxs();
}
