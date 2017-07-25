package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.CargoType;
import com.webapp.project.modules.masters.service.CargoTypeService;

@Repository("cargoTypeDao")
public class CargoTypeDaoImpl  extends AbstractDao<Integer, CargoType> implements CargoTypeDao{

	public CargoType findById(Long id) {
		CargoType cargoType = getByKey(id);
		return cargoType;
	}

	public String save(CargoType cargoType) {
		String status = persistAndReturn(cargoType);
		return status;
	}

	public List<CargoType> findAllCargoTypes() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("cargoTypeName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<CargoType> cargoTypes = (List<CargoType>) criteria.list();
		return cargoTypes; 
	}

	public String updateCargoType(CargoType cargoType) {
		return updateAndReturn(cargoType);
	}

	public String deleteCargoType(CargoType cargoType) {
		return deleteAndReturn(cargoType);
	}

}
