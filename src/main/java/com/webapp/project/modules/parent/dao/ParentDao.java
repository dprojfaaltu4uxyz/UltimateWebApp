package com.webapp.project.modules.parent.dao;

import java.util.List;

import com.webapp.project.modules.parent.model.Parent;


public interface ParentDao {

	Parent findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Parent parent);
	
	//void deleteBySSO(String sso);
	
	List<Parent> findAllParents();

}

