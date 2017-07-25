package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.Consignee;

@Repository("consigneeDao")
public class ConsigneeDaoImpl  extends AbstractDao<Integer, Consignee> implements ConsigneeDao{

	public Consignee findById(Long id) {
		Consignee consignee = getByKey(id);
		/*if(consignee!=null){
			Hibernate.initialize(consignee.getPort());
		}*/
		return consignee;
	}

	public String save(Consignee consignee) {
		String status = persistAndReturn(consignee);
		return status;
	}

	public List<Consignee> findAllConsignees() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Consignee> consignees = (List<Consignee>) criteria.list();
		return consignees; 
	}

	public String updateConsignee(Consignee consignee) {
		return updateAndReturn(consignee);
	}

	public String deleteConsignee(Consignee consignee) {
		return deleteAndReturn(consignee);
	}

}
