package com.webapp.project.modules.jobcard.service;

import java.util.List;

import com.webapp.project.modules.jobcard.model.Jobcard;
import com.webapp.project.modules.jobcard.model.JobcardSequence;


public interface JobCardSequenceService {

	JobcardSequence findById(Long id);
	
	String save(JobcardSequence jobcardSequence);
	
	String updateJobCardSequence(JobcardSequence jobcardSequence);
	
	String deleteJobCardSequence(JobcardSequence jobcardSequence);
	
}
