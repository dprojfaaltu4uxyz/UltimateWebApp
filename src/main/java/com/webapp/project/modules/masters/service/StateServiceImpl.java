package com.webapp.project.modules.masters.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.masters.dao.StateDao;
import com.webapp.project.modules.masters.model.State;


@Service("stateService")
@Transactional
public class StateServiceImpl implements StateService{

	@Autowired
	private StateDao dao;
	
	public State findById(Long id) {
		return dao.findById(id);
	}

	public String save(State state) {
		return dao.save(state);
	}

	public List<State> findAllStates() {
		return dao.findAllStates();
	}

	public String updateState(State state) {
		return updateState(state);
	}

}
