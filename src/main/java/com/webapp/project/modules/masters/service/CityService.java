package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.City;

public interface CityService {

	City findById(Long id);
	
	String save(City port);
	
	String updateCity(City city);
	
	String deleteCity(City city);

	List<City> findAllCities(); 
}


