package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.CargoType;



public interface CargoTypeDao {

	CargoType findById(Long id);
	
	String save(CargoType cargoType);
	
	String updateCargoType(CargoType cargoType);
	
	List<CargoType> findAllCargoTypes();
	
	String deleteCargoType(CargoType cargoType);
}
