package com.webapp.project.modules.party.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.party.model.Party;
import com.webapp.project.modules.party.model.PartyLicense;

@Repository("partyLicenseDao")
public class PartyLicenseDaoImpl  extends AbstractDao<Integer, PartyLicense> implements PartyLicenseDao{

	public PartyLicense findById(Long id) {
		return getByKey(id);
	}

	public String save(PartyLicense partyLicense) {
		return persistAndReturn(partyLicense);
	}

	public List<PartyLicense> findAllLicenses() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("shortName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<PartyLicense> licenses = (List<PartyLicense>) criteria.list();
		return licenses; 
	}

	public String updatePartyLicense(PartyLicense partyLicense) {
		return updateAndReturn(partyLicense);
	}

	public String deletePartyLicense(PartyLicense partyLicense) {
		return deleteAndReturn(partyLicense);
	}

	


}
