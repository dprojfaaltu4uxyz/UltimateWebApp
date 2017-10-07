package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.dao.CityDao;
import com.webapp.project.modules.masters.model.City;

@Repository("cityDao")
public class CityDaoImpl  extends AbstractDao<Integer, City> implements CityDao{

	public City findById(Long id) {

		return getByKey(id);
	}

	public String save(City city) {
		return persistAndReturn(city);
	}

	public List<City> findAllCities() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("cityName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<City> cities = (List<City>) criteria.list();
		return cities; 
	}

	public String deleteCity(City city) {
		return deleteAndReturn(city);
	}

	public String updateCity(City city) {
		return updateAndReturn(city);
	}

}
