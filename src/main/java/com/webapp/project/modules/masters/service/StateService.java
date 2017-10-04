package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.State;

public interface StateService {

	State findById(Long id);
	
	String save(State state);
	
	String updateState(State state);

	List<State> findAllStates(); 
	
	String deleteState(State state);
}


