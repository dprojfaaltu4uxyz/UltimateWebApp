package com.webapp.project.modules.party.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.party.model.Party;

@Repository("partyDao")
public class PartyDaoImpl  extends AbstractDao<Integer, Party> implements PartyDao{

	public Party findById(Long id) {
		return findById(id);
	}

	public String save(Party party) {
		return persistAndReturn(party);
	}

	public List<Party> findAllParties() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("shortName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Party> parties = (List<Party>) criteria.list();
		return parties; 
	}

	public String updateParty(Party party) {
		return updateAndReturn(party);
	}

	public String deleteParty(Party party) {
		return deleteAndReturn(party);
	}


}
