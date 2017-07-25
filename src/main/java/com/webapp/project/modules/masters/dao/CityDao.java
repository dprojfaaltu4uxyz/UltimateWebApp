package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.City;



public interface CityDao {

	City findById(Long id);
	
	String save(City city);
	
	String deleteCity(City city);
	
	String updateCity(City city);
	
	List<City> findAllCities();
}
