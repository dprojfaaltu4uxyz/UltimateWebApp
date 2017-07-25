package com.webapp.project.modules.teacher.dao;

import java.util.List;

import com.webapp.project.modules.teacher.model.Teacher;


public interface TeacherDao {

	Teacher findById(int id);
	
	//Teacher findBySSO(String sso);
	
	void save(Teacher teacher);
	
	//void deleteBySSO(String sso);
	
	List<Teacher> findAllTeachers();

}

