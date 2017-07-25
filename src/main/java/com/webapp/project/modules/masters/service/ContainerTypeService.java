package com.webapp.project.modules.masters.service;

import java.util.List;

import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.ContainerType;

public interface ContainerTypeService {

	ContainerType findById(Long id);
	
	String saveContainerType(ContainerType containerType);
	
	String updateContainerType(ContainerType containerType);

	List<ContainerType> findAllContainerTypes(); 
	
	String deleteContainerType(ContainerType containerType);
}


