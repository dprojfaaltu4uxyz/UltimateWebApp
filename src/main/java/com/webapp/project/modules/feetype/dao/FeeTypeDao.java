package com.webapp.project.modules.feetype.dao;

import java.util.List;

import com.webapp.project.modules.feetype.model.FeeType;

public interface FeeTypeDao {

	FeeType findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(FeeType feeType);
	
	//void deleteBySSO(String sso);
	
	List<FeeType> findAllFeeType();
}
