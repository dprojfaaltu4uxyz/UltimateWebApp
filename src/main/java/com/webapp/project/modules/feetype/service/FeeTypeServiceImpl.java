package com.webapp.project.modules.feetype.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.feetype.dao.FeeTypeDao;
import com.webapp.project.modules.feetype.model.FeeType;


@Service("feeTypeService")
@Transactional
public class FeeTypeServiceImpl implements FeeTypeService{

	@Autowired
	private FeeTypeDao dao;
	
	public FeeType findById(int id) {
		return dao.findById(id);
	}

	public void saveFeeType(FeeType feeType) {
		dao.save(feeType);
	}

	

	public List<FeeType> findAllFeeType() {
		return dao.findAllFeeType();
	}

	public void updateFeeType(FeeType feetype) {
		// TODO Auto-generated method stub
		
	}

	
	

	
}
