package com.webapp.project.modules.classes.dao;

import java.util.List;

import com.webapp.project.modules.classes.model.Classes;

public interface ClassesDao {

	Classes findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Classes classes);
	
	//void deleteBySSO(String sso);
	
	List<Classes> findAllClasses();
}
