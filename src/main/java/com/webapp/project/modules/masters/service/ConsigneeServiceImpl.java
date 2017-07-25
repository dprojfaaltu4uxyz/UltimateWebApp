package com.webapp.project.modules.masters.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.masters.dao.ConsigneeDao;
import com.webapp.project.modules.masters.model.Consignee;


@Service("consigneeService")
@Transactional
public class ConsigneeServiceImpl implements ConsigneeService{

	@Autowired
	private ConsigneeDao dao;
	
	public Consignee findById(Long id) {
		return dao.findById(id);
	}

	public String saveConsignee(Consignee consignee) {
		consignee.setCreateDate(new Date());
		consignee.setModifyDate(new Date());
		
		return dao.save(consignee);
	}

	

	public List<Consignee> findAllConsignees() {
		return dao.findAllConsignees();
	}

	public String updateConsignee(Consignee consignee) {
		consignee.setCreateDate(new Date());
		consignee.setModifyDate(new Date());
		return dao.updateConsignee(consignee);
	}

	public String deleteConsignee(Consignee consignee) {
		return dao.deleteConsignee(consignee);
	}

}
