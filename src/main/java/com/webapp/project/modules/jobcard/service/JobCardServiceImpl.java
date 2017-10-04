package com.webapp.project.modules.jobcard.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.jobcard.dao.JobCardDao;
import com.webapp.project.modules.jobcard.model.Jobcard;


@Service("jobCardService")
@Transactional
public class JobCardServiceImpl implements JobCardService {

	@Autowired
	private JobCardDao dao;
	
	public Jobcard findById(Long id) {
		 return dao.findById(id);
	}

	public String saveJobcard(Jobcard jobcard) {

		jobcard.setCreateDate(new Date());
		jobcard.setModifiedDate(new Date());
		return dao.save(jobcard);
	}

	public String updateJobcard(Jobcard jobcard) {
		jobcard.setCreateDate(new Date());
		jobcard.setModifiedDate(new Date());
		return dao.updateJobCard(jobcard);
	}

	public List<Jobcard> findAllJobcards() {
		return dao.findAllJobCards();
	}

	public String deleteJobcard(Jobcard jobcard) {
		return dao.deleteJobCard(jobcard);
	}

}
