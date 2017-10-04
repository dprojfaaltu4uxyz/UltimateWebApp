package com.webapp.project.modules.party.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.jobcard.dao.JobCardDao;
import com.webapp.project.modules.jobcard.model.Jobcard;
import com.webapp.project.modules.party.dao.PartyDao;
import com.webapp.project.modules.party.model.Party;


@Service("partyService")
@Transactional
public class PartyServiceImpl implements PartyService {

	@Autowired
	private PartyDao dao;
	
	public Party findById(Long id) {
		 return dao.findById(id);
	}

	public String saveParty(Party party) {

		party.setCreateDate(new Date());
		party.setModifiedDate(new Date());
		return dao.save(party);
	}

	public String updateParty(Party party) {
		party.setCreateDate(new Date());
		party.setModifiedDate(new Date());
		return dao.updateParty(party);
	}

	public List<Party> findAllParties() {
		return dao.findAllParties();
	}

	public String deleteParty(Party party) {
		return dao.deleteParty(party);
	}

}
