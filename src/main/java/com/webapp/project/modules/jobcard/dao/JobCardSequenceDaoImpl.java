package com.webapp.project.modules.jobcard.dao;

import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.jobcard.model.JobcardSequence;

@Repository("jobCardSequenceDao")
public class JobCardSequenceDaoImpl  extends AbstractDao<Integer, JobcardSequence> implements JobCardSequenceDao{

	public JobcardSequence findById(Long id) {
		return findById(id);
	}

	public String save(JobcardSequence jobCardSequence) {
		return persistAndReturn(jobCardSequence);
	}

	public String updateJobCardSequence(JobcardSequence jobCardSequence) {
		return updateAndReturn(jobCardSequence);
	}

	public String deleteJobCardSequence(JobcardSequence jobCardSequence) {
		return deleteAndReturn(jobCardSequence);
	}

}
