package com.webapp.project.modules.feetype.service;

import java.util.List;

import com.webapp.project.modules.feetype.model.FeeType;

public interface FeeTypeService {

	FeeType findById(int id);
	
	void saveFeeType(FeeType feetype);
	
	void updateFeeType(FeeType feetype);

	List<FeeType> findAllFeeType(); 
}


