package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Country;

@Repository("countryDao")
public class CountryDaoImpl extends AbstractDao<Integer, Country>  implements CountryDao{

	public Country findById(Long id) {
		return findById(id);
	}

	public String save(Country country) {
		return persistAndReturn(country);
	}

	public List<Country> findAllCountries() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("city"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Country> countries = (List<Country>) criteria.list();
		return countries; 
	}

	public String deleteCountry(Country country) {
		return deleteAndReturn(country);
	}

	public String updateCountry(Country country) {
		return updateAndReturn(country);
	}

}
