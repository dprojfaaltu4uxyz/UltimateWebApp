package com.webapp.project.modules.party.service;

import java.util.List;

import com.webapp.project.modules.party.model.PartyLicense;


public interface PartyLicenseService {

	PartyLicense findById(Long id);
	
	String savePartyLicense(PartyLicense partyLicense);
	
	String updatePartyLicense(PartyLicense partyLicense);

	List<PartyLicense> findAllLicenses(); 
	
	String deletePartyLicense(PartyLicense partyLicense);
}
