package com.webapp.project.modules.jobcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.jobcard.dao.JobCardSequenceDao;
import com.webapp.project.modules.jobcard.model.JobcardSequence;

@Service("jobCardSequenceService")
@Transactional
public class JobCardSequenceServiceImpl implements JobCardSequenceService {

	@Autowired
	private JobCardSequenceDao dao;
	
	public JobcardSequence findById(Long id) {
		 return dao.findById(id);
	}

	public String save(JobcardSequence jobcardSequence) {
		return dao.save(jobcardSequence);
	}

	public String updateJobCardSequence(JobcardSequence jobcardSequence) {
		return dao.updateJobCardSequence(jobcardSequence);
	}

	public String deleteJobCardSequence(JobcardSequence jobcardSequence) {
		return dao.deleteJobCardSequence(jobcardSequence);
	}

}
