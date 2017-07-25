package com.webapp.project.modules.masters.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.masters.dao.ContainerTypeDao;
import com.webapp.project.modules.masters.model.ContainerType;


@Service("containerTypeService")
@Transactional
public class ContainerTypeServiceImpl implements ContainerTypeService{

	@Autowired
	private ContainerTypeDao dao;
	
	public ContainerType findById(Long id) {
		return dao.findById(id);
	}

	public String saveContainerType(ContainerType containerType) {
		containerType.setCreateDate(new Date());
		containerType.setModifyDate(new Date());
		return dao.save(containerType);
	}

	

	public List<ContainerType> findAllContainerTypes() {
		return dao.findAllContainerTypes();
	}

	public String updateContainerType(ContainerType containerType) {
		containerType.setCreateDate(new Date());
		containerType.setModifyDate(new Date());
		return dao.updateContainerType(containerType);
	}

	public String deleteContainerType(ContainerType containerType) {
		return dao.deleteContainerType(containerType);
	}

	
}
