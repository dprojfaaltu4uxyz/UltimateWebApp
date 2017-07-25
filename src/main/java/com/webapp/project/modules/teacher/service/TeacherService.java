package com.webapp.project.modules.teacher.service;

import java.util.List;

import com.webapp.project.modules.teacher.model.Teacher;


public interface TeacherService {
	
	Teacher findById(int id);
	
	void saveTeacher(Teacher teacher);
	
	void updateTeacher(Teacher teacher);

	List<Teacher> findAllTeachers(); 
	
	boolean isUserSSOUnique(Integer id, String sso);

}