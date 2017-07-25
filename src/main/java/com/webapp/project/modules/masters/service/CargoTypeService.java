package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.CargoType;

public interface CargoTypeService {

	CargoType findById(Long id);
	
	String saveCargoType(CargoType cargoType);
	
	String updateCargoType(CargoType cargoType);

	List<CargoType> findAllCargoTypes(); 
	
	String deleteCargoType(CargoType cargoType);
}


