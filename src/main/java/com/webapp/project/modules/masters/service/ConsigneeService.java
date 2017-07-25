package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.Consignee;

public interface ConsigneeService {

	Consignee findById(Long id);
	
	String saveConsignee(Consignee consignee);
	
	String updateConsignee(Consignee consignee);

	List<Consignee> findAllConsignees(); 
	
	String deleteConsignee(Consignee consignee);
}


