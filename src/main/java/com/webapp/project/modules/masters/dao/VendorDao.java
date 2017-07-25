package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Vendor;



public interface VendorDao {

	Vendor findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Vendor vendor);
	
	//void deleteBySSO(String sso);
	
	List<Vendor> findAllVendors();
}
