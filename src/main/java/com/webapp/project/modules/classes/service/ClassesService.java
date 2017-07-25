package com.webapp.project.modules.classes.service;

import java.util.List;

import com.webapp.project.modules.classes.model.Classes;

public interface ClassesService {

	Classes findById(int id);
	
	void saveClasses(Classes classes);
	
	void updateClasses(Classes classes);

	List<Classes> findAllClasses(); 
}


