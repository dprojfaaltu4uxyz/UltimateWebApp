package com.webapp.project.modules.masters.dao;

import java.util.List;

import com.webapp.project.modules.masters.model.ContainerType;



public interface ContainerTypeDao {

	ContainerType findById(Long id);
	
	String save(ContainerType containerType);
	
	String updateContainerType(ContainerType containerType);
	
	List<ContainerType> findAllContainerTypes();
	
	String deleteContainerType(ContainerType containerType);
}
