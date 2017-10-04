package com.webapp.project.modules.jobcard.dao;

import com.webapp.project.modules.jobcard.model.JobcardSequence;

public interface JobCardSequenceDao {

	JobcardSequence findById(Long id);
	
	String save(JobcardSequence jobcardSequence);
	
	String updateJobCardSequence(JobcardSequence jobcardSequence);
	
	String deleteJobCardSequence(JobcardSequence jobcardSequence);
}
