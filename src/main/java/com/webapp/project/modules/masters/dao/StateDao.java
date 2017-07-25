package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.City;
import com.webapp.project.modules.masters.model.State;



public interface StateDao {

	State findById(Long id);
	
	//Teacher findBySSO(String sso);
	
	String save(State state);
	
	String updateState(State state);
	
	String deleteState(State state);
	
	List<State> findAllStates();
}
