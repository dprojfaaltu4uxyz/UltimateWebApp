package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.Country;

public interface CountryService {

	Country findById(Long id);
	
	String save(Country country);
	
	String updateCountry(Country country);
	
	String deleteCountry(Country country);

	List<Country> findAllCountries(); 
}


