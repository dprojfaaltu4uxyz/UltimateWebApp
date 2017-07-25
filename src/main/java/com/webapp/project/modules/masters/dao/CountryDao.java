package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.City;
import com.webapp.project.modules.masters.model.Country;



public interface CountryDao {

	Country findById(Long id);
	
	String save(Country country);
	
	String updateCountry(Country country);
	
	String deleteCountry(Country country);
	
	List<Country> findAllCountries();
}
