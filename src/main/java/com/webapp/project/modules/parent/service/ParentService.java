package com.webapp.project.modules.parent.service;

import java.util.List;

import com.webapp.project.modules.parent.model.Parent;


public interface ParentService {
	
	Parent findById(int id);
	
	void saveParent(Parent parent);
	
	void updateParent(Parent teacher);

	List<Parent> findAllParents(); 
	
	boolean isUserSSOUnique(Integer id, String sso);

}