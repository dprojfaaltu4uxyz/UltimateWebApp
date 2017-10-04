package com.webapp.project.modules.jobcard.service;

import java.util.List;

import com.webapp.project.modules.jobcard.model.Jobcard;


public interface JobCardService {

	Jobcard findById(Long id);
	
	String saveJobcard(Jobcard agent);
	
	String updateJobcard(Jobcard jobcard);

	List<Jobcard> findAllJobcards(); 
	
	String deleteJobcard(Jobcard jobcard);
}
