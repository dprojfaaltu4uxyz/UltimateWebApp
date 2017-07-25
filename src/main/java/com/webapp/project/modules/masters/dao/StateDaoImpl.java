package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.State;

@Repository("stateDao")
public class StateDaoImpl  extends AbstractDao<Integer, State> implements StateDao{

	public State findById(Long id) {
		return findById(id);
	}

	public String save(State state) {
		return persistAndReturn(state);
	}

	public List<State> findAllStates() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("stateName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<State> states = (List<State>) criteria.list();
		return states; 
	}

	public String deleteState(State state) {
		return deleteAndReturn(state);
	}

	@Override
	public String updateState(State state) {
		return updateAndReturn(state);
	}

}
