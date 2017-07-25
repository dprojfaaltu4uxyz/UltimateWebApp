package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.Currency;

@Repository("currencyDao")
public class CurrencyDaoImpl  extends AbstractDao<Integer, Currency> implements CurrencyDao{

	public Currency findById(Long id) {
		Currency currency = getByKey(id);
		return currency;
	}

	public String save(Currency currency) {
		String status = persistAndReturn(currency);
		return status;
	}

	public List<Currency> findAllCurrencies() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Currency> currencies = (List<Currency>) criteria.list();
		return currencies; 
	}

	public String updateCurrency(Currency currency) {
		return updateAndReturn(currency);
	}

	public String deleteCurrency(Currency currency) {
		return deleteAndReturn(currency);
	}

}
