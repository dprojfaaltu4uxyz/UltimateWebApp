package com.webapp.project.framework.service;

import java.util.List;

import com.webapp.project.framework.model.DropDownOption;

public interface DropDownService {
	List<DropDownOption> getOptions(String entityName, String nameProp, String valueProp, String filter,String firstParam,String secondParam, String thirdParam);

}
