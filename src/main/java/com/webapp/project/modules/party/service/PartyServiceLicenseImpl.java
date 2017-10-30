package com.webapp.project.modules.party.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.party.dao.PartyLicenseDao;
import com.webapp.project.modules.party.model.PartyLicense;


@Service("partyLicenseService")
@Transactional
public class PartyServiceLicenseImpl implements PartyLicenseService {

	@Autowired
	private PartyLicenseDao dao;
	
	public PartyLicense findById(Long id) {
		 return dao.findById(id);
	}

	public String savePartyLicense(PartyLicense partyLicense){

		partyLicense.setCreateDate(new Date());
		partyLicense.setModifyDate(new Date());
		return dao.save(partyLicense);
	}

	public String updatePartyLicense(PartyLicense partyLicense) {
		partyLicense.setCreateDate(new Date());
		partyLicense.setModifyDate(new Date());
		return dao.updatePartyLicense(partyLicense);
	}

	public List<PartyLicense> findAllLicenses() {
		return dao.findAllLicenses();
	}

	public String deletePartyLicense(PartyLicense partyLicense) {
		return dao.deletePartyLicense(partyLicense);
	}

}
