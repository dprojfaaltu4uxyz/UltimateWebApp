package com.webapp.project.modules.section.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.section.dao.SectionDao;
import com.webapp.project.modules.section.model.Section;


@Service("sectionService")
@Transactional
public class SectionServiceImpl implements SectionService{

	@Autowired
	private SectionDao dao;
	
	public Section findById(int id) {
		return dao.findById(id);
	}

	public void saveSection(Section section) {
		section.setCreateDate(new Date());
		section.setModifyDate(new Date());
		dao.save(section);
	}

	

	public List<Section> findAllSection() {
		return dao.findAllSection();
	}

	@Override
	public void updateSection(Section section) {
		// TODO Auto-generated method stub
		
	}

	
}
