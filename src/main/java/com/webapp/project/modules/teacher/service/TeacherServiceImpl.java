package com.webapp.project.modules.teacher.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.teacher.dao.TeacherDao;
import com.webapp.project.modules.teacher.model.Teacher;


@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherDao dao;

	@Autowired
    private PasswordEncoder passwordEncoder;
	
	public Teacher findById(int id) {
		return dao.findById(id);
	}

	public void saveTeacher(Teacher teacher) {
		//teacher.setPassword(passwordEncoder.encode(teacher.getPassword()));
		teacher.setTeacheractive(1);
		teacher.setCreateUsertype("Teacher");
		teacher.setCreateDate(new Date());
		teacher.setModifyDate(new Date());
		dao.save(teacher);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateUser(Teacher teacher) {
		Teacher entity = dao.findById(teacher.getTeacherId().intValue());
		/*if(entity!=null){
			entity.setSsoId(teacher.getSsoId());
			if(!user.getPassword().equals(entity.getPassword())){
				entity.setPassword(passwordEncoder.encode(user.getPassword()));
			}
			entity.setFirstName(teacher.getFirstName());
			entity.setLastName(teacher.getLastName());
			entity.setEmail(teacher.getEmail());
			entity.setUserProfiles(teacher.getUserProfiles());
		}*/
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	public List<Teacher> findAllTeachers() {
		return dao.findAllTeachers();
	}

	public boolean isUserSSOUnique(Integer id, String sso) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
