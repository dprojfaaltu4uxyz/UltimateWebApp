package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.Currency;

public interface CurrencyService {

	Currency findById(Long id);
	
	String saveCurrency(Currency currency);
	
	String updateCurrency(Currency currency);

	List<Currency> findAllCurrencies(); 
	
	String deleteCurrency(Currency currency);
}


