package com.webapp.project.framework.service;

import java.util.List;

import com.webapp.project.framework.model.AppUser;


public interface UserService {
	
	AppUser findById(Long id);
	
	AppUser findBySSO(String sso);
	
	void saveUser(AppUser appUser);
	
	String saveTeacher(AppUser appUser);
	
	String saveStudent(AppUser appUser);
	
	String saveParent(AppUser appUser);
	
	void updateUser(AppUser appUser);
	
	void deleteUserBySSO(String sso);

	List<AppUser> findAllUsers(); 
	
	boolean isUserSSOUnique(Integer id, String sso);

}