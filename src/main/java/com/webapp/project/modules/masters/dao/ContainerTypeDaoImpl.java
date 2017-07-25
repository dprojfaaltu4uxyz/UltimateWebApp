package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.ContainerType;

@Repository("containerTypeDao")
public class ContainerTypeDaoImpl  extends AbstractDao<Integer, ContainerType> implements ContainerTypeDao{

	public ContainerType findById(Long id) {
		ContainerType containerType = getByKey(id);
		return containerType;
	}

	public String save(ContainerType containerType) {
		String status = persistAndReturn(containerType);
		return status;
	}

	public List<ContainerType> findAllContainerTypes() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("containerTypeName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ContainerType> containerTypes = (List<ContainerType>) criteria.list();
		return containerTypes; 
	}

	public String updateContainerType(ContainerType containerType) {
		return updateAndReturn(containerType);
	}

	public String deleteContainerType(ContainerType containerType) {
		return deleteAndReturn(containerType);
	}

}
