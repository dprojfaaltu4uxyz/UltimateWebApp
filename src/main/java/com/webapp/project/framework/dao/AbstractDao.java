package com.webapp.project.framework.dao;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}
	
	@SuppressWarnings("unchecked")
	public T getByKey(Long key) {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}
	
	public String persistAndReturn(T entity) {
		getSession().persist(entity);
		return "SUCCESS";
	}

	public String updateAndReturn(T entity) {
		getSession().saveOrUpdate(entity);
		return "SUCCESS";
	}

	public String deleteAndReturn(T entity) {
		getSession().delete(entity);
		return "SUCCESS";
	}
	
	
	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(persistentClass);
	}

}
