package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Currency;

public interface CurrencyDao {

	Currency findById(Long id);
	
	String save(Currency currency);
	
	String updateCurrency(Currency currency);
	
	List<Currency> findAllCurrencies();
	
	String deleteCurrency(Currency currency);
}
