package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Port;

@Repository("portDao")
public class PortDaoImpl  extends AbstractDao<Integer, Port> implements PortDao{

	public Port findById(Long id) {
		return getByKey(id);
	}

	public void save(Port port) {
		persist(port);
	}

	public List<Port> findAllPorts() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("portName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Port> ports = (List<Port>) criteria.list();
		return ports; 
	}

}
