package com.webapp.project.modules.party.service;

import java.util.List;

import com.webapp.project.modules.jobcard.model.Jobcard;
import com.webapp.project.modules.party.model.Party;


public interface PartyService {

	Party findById(Long id);
	
	String saveParty(Party party);
	
	String updateParty(Party party);

	List<Party> findAllParties(); 
	
	String deleteParty(Party party);
}
