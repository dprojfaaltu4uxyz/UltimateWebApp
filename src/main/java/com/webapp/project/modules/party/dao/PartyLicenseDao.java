package com.webapp.project.modules.party.dao;

import java.util.List;

import com.webapp.project.modules.party.model.PartyLicense;



public interface PartyLicenseDao {

	PartyLicense findById(Long id);
	
	String save(PartyLicense partyLicense);
	
	List<PartyLicense> findAllLicenses();
	
	String updatePartyLicense(PartyLicense partyLicense);
	
	String deletePartyLicense(PartyLicense partyLicense);
}
