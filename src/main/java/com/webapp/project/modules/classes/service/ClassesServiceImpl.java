package com.webapp.project.modules.classes.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.classes.dao.ClassesDao;
import com.webapp.project.modules.classes.model.Classes;


@Service("classesService")
@Transactional
public class ClassesServiceImpl implements ClassesService{

	@Autowired
	private ClassesDao dao;
	
	public Classes findById(int id) {
		return dao.findById(id);
	}

	public void saveClasses(Classes classes) {
		classes.setCreateDate(new Date());
		classes.setModifyDate(new Date());
		dao.save(classes);
	}

	public void updateClasses(Classes classes) {
		
	}

	public List<Classes> findAllClasses() {
		return dao.findAllClasses();
	}

	
}
