package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.Consignee;


public interface ConsigneeDao {

	Consignee findById(Long id);
	
	String save(Consignee consignee);
	
	String updateConsignee(Consignee consignee);
	
	List<Consignee> findAllConsignees();
	
	String deleteConsignee(Consignee consignee);
}
