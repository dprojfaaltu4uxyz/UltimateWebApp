package com.webapp.project.framework.service;

import java.util.List;

import com.webapp.project.framework.model.UserDocument;

public interface UserDocumentService {

	UserDocument findById(Long id);

	List<UserDocument> findAll();
	
	List<UserDocument> findAllByUserId(Long id);
	
	void saveDocument(UserDocument document);
	
	void deleteById(Long id);
}
