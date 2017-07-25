package com.webapp.project.modules.section.dao;

import java.util.List;

import com.webapp.project.modules.section.model.Section;

public interface SectionDao {

	Section findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Section section);
	
	//void deleteBySSO(String sso);
	
	List<Section> findAllSection();
}
