package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Location;

@Repository("locationDao")
public class LocationDaoImpl  extends AbstractDao<Integer, Location> implements LocationDao{

	public Location findById(int id) {

		return null;
	}

	public void save(Location location) {
		persist(location);
	}

	public List<Location> findAllLocations() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("location"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Location> locations = (List<Location>) criteria.list();
		return locations; 
	}

}
