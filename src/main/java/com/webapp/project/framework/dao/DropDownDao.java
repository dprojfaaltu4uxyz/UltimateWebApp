package com.webapp.project.framework.dao;

import java.util.List;

import com.webapp.project.framework.model.DropDownOption;

public interface DropDownDao {

	List<DropDownOption> getOptions(String entityName, String nameProp, String valueProp, String filter,String firstParam,String secondParam, String thirdParam);
}
