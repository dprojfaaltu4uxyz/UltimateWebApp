package com.webapp.project.modules.masters.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.masters.dao.PortDao;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.Port;


@Service("portService")
@Transactional
public class PortServiceImpl implements PortService{

	@Autowired
	private PortDao dao;
	
	public Port findById(Long id) {
		return dao.findById(id);
	}

	public void savePort(Port port) {
		dao.save(port);
	}

	

	public List<Port> findAllPorts() {
		return dao.findAllPorts();
	}

	public void updatePort(Port port) {
		
	}

}
