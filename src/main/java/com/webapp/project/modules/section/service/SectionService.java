package com.webapp.project.modules.section.service;

import java.util.List;

import com.webapp.project.modules.section.model.Section;

public interface SectionService {

	Section findById(int id);
	
	void saveSection(Section section);
	
	void updateSection(Section section);

	List<Section> findAllSection(); 
}


