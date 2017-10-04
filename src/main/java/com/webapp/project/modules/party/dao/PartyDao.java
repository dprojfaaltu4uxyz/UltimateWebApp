package com.webapp.project.modules.party.dao;

import java.util.List;

import com.webapp.project.modules.jobcard.model.Jobcard;
import com.webapp.project.modules.party.model.Party;



public interface PartyDao {

	Party findById(Long id);
	
	String save(Party party);
	
	List<Party> findAllParties();
	
	String updateParty(Party party);
	
	String deleteParty(Party party);
}
