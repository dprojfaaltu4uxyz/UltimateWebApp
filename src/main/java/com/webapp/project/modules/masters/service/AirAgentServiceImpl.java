package com.webapp.project.modules.masters.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.masters.dao.AirAgentDao;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.AirAgent;


@Service("airAgentService")
@Transactional
public class AirAgentServiceImpl implements AirAgentService{

	@Autowired
	private AirAgentDao dao;
	
	public AirAgent findById(Long id) {
		return dao.findById(id);
	}

	public String saveAirAgent(AirAgent airAgent) {
		airAgent.setCreateDate(new Date());
		airAgent.setModifiedDate(new Date());
		return dao.save(airAgent);
	}

	

	public List<AirAgent> findAllAirAgent() {
		return dao.findAllAirAgents();
	}

	public String updateAirAgent(AirAgent airAgent) {
		airAgent.setCreateDate(new Date());
		airAgent.setModifiedDate(new Date());
		return dao.updateAirAgent(airAgent);
	}

	@Override
	public String deleteAirAgent(AirAgent airAgent) {
		return dao.deleteAirAgent(airAgent);
	}
}
