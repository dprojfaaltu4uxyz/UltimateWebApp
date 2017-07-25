package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.Jobcard;



public interface JobCardDao {

	Jobcard findById(Long id);
	
	String save(Jobcard jobCard);
	
	List<Jobcard> findAllJobCards();
	
	String updateJobCard(Jobcard jobCard);
	
	String deleteJobCard(Jobcard jobCard);
}
