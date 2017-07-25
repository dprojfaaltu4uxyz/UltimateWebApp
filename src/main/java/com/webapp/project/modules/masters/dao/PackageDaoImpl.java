package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.invoice.model.Invoice;

@Repository("packageDao")
public class PackageDaoImpl  extends AbstractDao<Integer, Package> implements PackageDao{

	public Package findById(int id) {

		return null;
	}

	public void save(Package packages) {
		persist(packages);
	}

	public List<Package> findAllPackages() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("package"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Package> packages = (List<Package>) criteria.list();
		return packages; 
	}

}
