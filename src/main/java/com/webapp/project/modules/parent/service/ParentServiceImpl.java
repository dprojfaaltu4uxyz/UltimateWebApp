package com.webapp.project.modules.parent.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.parent.dao.ParentDao;
import com.webapp.project.modules.parent.model.Parent;


@Service("parentService")
@Transactional
public class ParentServiceImpl implements ParentService{

	@Autowired
	private ParentDao dao;

	@Autowired
    private PasswordEncoder passwordEncoder;
	
	public Parent findById(int id) {
		return dao.findById(id);
	}

	public void saveParent(Parent parent) {
		//teacher.setPassword(passwordEncoder.encode(teacher.getPassword()));
		parent.setParentactive(1);
		parent.setCreateUsertype("Parent");
		parent.setCreateDate(new Date());
		parent.setModifyDate(new Date());
		dao.save(parent);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateUser(Parent parent) {
		Parent entity = dao.findById(parent.getParentId().intValue());
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

	public void updateTeacher(Parent parent) {
		// TODO Auto-generated method stub
		
	}

	public List<Parent> findAllParents() {
		return dao.findAllParents();
	}

	public boolean isUserSSOUnique(Integer id, String sso) {
		// TODO Auto-generated method stub
		return false;
	}

	public void updateParent(Parent teacher) {
		// TODO Auto-generated method stub
		
	}
	
	
}
