package com.webapp.project.framework.dao;

import java.util.List;

import org.springframework.security.core.userdetails.User;

import com.webapp.project.framework.model.AppUser;


public interface UserDao {

	//AppUser findById(int id);
	
	AppUser findById(Long id);
	
	AppUser findBySSO(String sso);
	
	void save(AppUser user);
	
	String saveTeacher(AppUser user);
	
	String saveStudent(AppUser user);
	
	String saveParent(AppUser user);
	
	void deleteBySSO(String sso);
	
	List<AppUser> findAllUsers();

}

