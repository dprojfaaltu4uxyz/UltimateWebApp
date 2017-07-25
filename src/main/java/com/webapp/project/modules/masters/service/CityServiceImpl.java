package com.webapp.project.modules.masters.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.masters.dao.CityDao;
import com.webapp.project.modules.masters.model.City;


@Service("cityService")
@Transactional
public class CityServiceImpl implements CityService{

	@Autowired
	private CityDao dao;
	
	public City findById(Long id) {
		return dao.findById(id);
	}

	public String save(City city) {
		return dao.save(city);
	}

	

	public List<City> findAllCities() {
		return dao.findAllCities();
	}

	public String updateCity(City city) {
		return dao.updateCity(city);
	}

	@Override
	public String deleteCity(City city) {
		return dao.deleteCity(city);
	}

}
