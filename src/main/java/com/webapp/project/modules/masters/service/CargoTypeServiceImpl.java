package com.webapp.project.modules.masters.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.masters.dao.CargoTypeDao;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.CargoType;


@Service("cargoTypeService")
@Transactional
public class CargoTypeServiceImpl implements CargoTypeService{

	@Autowired
	private CargoTypeDao dao;
	
	public CargoType findById(Long id) {
		return dao.findById(id);
	}

	public String saveCargoType(CargoType cargoType) {
		return dao.save(cargoType);
	}

	public List<CargoType> findAllCargoTypes() {
		return dao.findAllCargoTypes();
	}

	public String updateCargoType(CargoType cargoType) {
		return dao.updateCargoType(cargoType);
	}

	public String deleteCargoType(CargoType cargoType) {
		return dao.deleteCargoType(cargoType);
	}
 
}
