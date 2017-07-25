package com.webapp.project.framework.dao;

import java.util.List;

import com.webapp.project.framework.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(Long id);
}
