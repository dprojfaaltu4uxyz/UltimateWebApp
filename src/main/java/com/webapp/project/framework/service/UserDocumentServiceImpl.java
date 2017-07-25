package com.webapp.project.framework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.framework.dao.UserDocumentDao;
import com.webapp.project.framework.model.UserDocument;

@Service("userDocumentService")
@Transactional
public class UserDocumentServiceImpl implements UserDocumentService{

	@Autowired
	UserDocumentDao dao;

	public UserDocument findById(Long id) {
		return dao.findById(id);
	}

	public List<UserDocument> findAll() {
		return dao.findAll();
	}

	public List<UserDocument> findAllByUserId(Long userId) {
		return dao.findAllByUserId(userId);
	}
	
	public void saveDocument(UserDocument document){
		dao.save(document);
	}

	public void deleteById(Long id){
		dao.deleteById(id);
	}
	
}
