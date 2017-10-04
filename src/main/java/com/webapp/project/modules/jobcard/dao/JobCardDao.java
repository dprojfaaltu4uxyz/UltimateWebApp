package com.webapp.project.modules.jobcard.dao;

import java.util.List;

import com.webapp.project.modules.jobcard.model.Jobcard;



public interface JobCardDao {

	Jobcard findById(Long id);
	
	String save(Jobcard jobCard);
	
	List<Jobcard> findAllJobCards();
	
	String updateJobCard(Jobcard jobCard);
	
	String deleteJobCard(Jobcard jobCard);
}
