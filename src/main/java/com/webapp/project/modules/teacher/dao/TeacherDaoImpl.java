package com.webapp.project.modules.teacher.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.framework.dao.UserDaoImpl;
import com.webapp.project.modules.teacher.model.Teacher;



@Repository("teacherDao")
public class TeacherDaoImpl extends AbstractDao<Integer, Teacher> implements TeacherDao {

	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	public Teacher findById(int id) {
		Teacher teacher = getByKey(id);
		return teacher;
	}

	@SuppressWarnings("unchecked")
	public List<Teacher> findAllTeachers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Teacher> teachers = (List<Teacher>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
		return teachers;
	}


	public void save(Teacher teacher) {
		// TODO Auto-generated method stub
		persist(teacher);
	}


}
