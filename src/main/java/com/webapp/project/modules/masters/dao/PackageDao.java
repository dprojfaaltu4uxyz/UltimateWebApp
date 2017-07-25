package com.webapp.project.modules.masters.dao;

import java.util.List;



public interface PackageDao {

	Package findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Package packages);
	
	//void deleteBySSO(String sso);
	
	List<Package> findAllPackages();
}
