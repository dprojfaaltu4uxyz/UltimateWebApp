package com.webapp.project.modules.masters.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.masters.dao.CurrencyDao;
import com.webapp.project.modules.masters.model.Currency;


@Service("currencyService")
@Transactional
public class CurrencyServiceImpl implements CurrencyService{

	@Autowired
	private CurrencyDao dao;
	
	public Currency findById(Long id) {
		return dao.findById(id);
	}

	public String saveCurrency(Currency currency) {
		currency.setCreateDate(new Date());
		currency.setModifyDate(new Date());
		
		return dao.save(currency);
	}

	

	public List<Currency> findAllCurrencies() {
		return dao.findAllCurrencies();
	}

	public String updateCurrency(Currency currency) {
		currency.setCreateDate(new Date());
		currency.setModifyDate(new Date());
		return dao.updateCurrency(currency);
	}

	@Override
	public String deleteCurrency(Currency currency) {
		return dao.deleteCurrency(currency);
	}

}
