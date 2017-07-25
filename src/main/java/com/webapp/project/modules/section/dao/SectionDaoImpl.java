package com.webapp.project.modules.section.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.section.model.Section;

@Repository("sectionDao")
public class SectionDaoImpl  extends AbstractDao<Integer, Section> implements SectionDao{

	public Section findById(int id) {

		return null;
	}

	public void save(Section section) {
		persist(section);
	}

	public List<Section> findAllSection() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("classes"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Section> sections = (List<Section>) criteria.list();
		return sections; 
	}

}
