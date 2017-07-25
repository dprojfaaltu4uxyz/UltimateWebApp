package com.webapp.project.framework.dao;

import java.util.List;

import com.webapp.project.framework.model.UserDocument;

public interface UserDocumentDao {

	List<UserDocument> findAll();
	
	UserDocument findById(Long id);
	
	void save(UserDocument document);
	
	List<UserDocument> findAllByUserId(Long userId);
	
	void deleteById(Long id);
}
