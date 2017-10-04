package com.webapp.project.framework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.framework.dao.DropDownDao;
import com.webapp.project.framework.model.DropDownOption;

@Service("dropDownService")
@Transactional
public class DropDownServiceImpl implements DropDownService{

	@Autowired(required=true)
	private DropDownDao dropDonDao;
	
	public List<DropDownOption> getOptions(String entityName, String nameProp,
			String valueProp, String filter,String firstParam,String secondParam, String thirdParam) {
		return dropDonDao.getOptions(entityName, nameProp, valueProp, filter,firstParam,secondParam,thirdParam);
	}

}
