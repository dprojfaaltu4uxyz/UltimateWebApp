package com.webapp.project.modules.masters.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.masters.dao.CountryDao;
import com.webapp.project.modules.masters.model.Country;
import com.webapp.project.modules.masters.model.Port;


@Service("countryService")
@Transactional
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDao dao;
	
	public Country findById(Long id) {
		return dao.findById(id);
	}

	public String save(Country country) {
		return dao.save(country);
	}
	

	public List<Country> findAllCountries() {
		return dao.findAllCountries();
	}

	public String updateCountry(Country country) {
		return updateCountry(country);
	}

	@Override
	public String deleteCountry(Country country) {
		return dao.deleteCountry(country);
	}

}
