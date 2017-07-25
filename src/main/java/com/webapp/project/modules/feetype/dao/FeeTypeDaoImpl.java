package com.webapp.project.modules.feetype.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.feetype.model.FeeType;

@Repository("feeTypeDao")
public class FeeTypeDaoImpl  extends AbstractDao<Integer, FeeType> implements FeeTypeDao{

	public FeeType findById(int id) {

		return null;
	}

	public void save(FeeType feeType) {
		persist(feeType);
	}

	public List<FeeType> findAllFeeType() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("feetypes"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<FeeType> feeTypes = (List<FeeType>) criteria.list();
		return feeTypes; 
	}


}
