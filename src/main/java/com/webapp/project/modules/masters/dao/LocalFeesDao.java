package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.LocalFees;



public interface LocalFeesDao {

	LocalFees findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(LocalFees localFees);
	
	//void deleteBySSO(String sso);
	
	List<LocalFees> findAllLocalFees();
}
