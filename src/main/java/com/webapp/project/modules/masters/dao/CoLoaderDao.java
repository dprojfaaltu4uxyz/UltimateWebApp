package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.CoLoader;



public interface CoLoaderDao {

	CoLoader findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(CoLoader coLoader);
	
	//void deleteBySSO(String sso);
	
	List<CoLoader> findAllCoLoaders();
}
