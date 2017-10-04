package com.webapp.project.modules.masters.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.masters.model.Customer;

@Repository("customerDao")
public class CustomerDaoImpl extends AbstractDao<Integer, Customer> implements CustomerDao{

	private static final Logger logger = LoggerFactory.getLogger(CustomerDaoImpl.class);

	public String saveCustomer(Customer customer) {
		return persistAndReturn(customer);
	}

	public String updateCustomer(Customer customer) {
		return updateAndReturn(customer);
	}

	public List<Customer> findAllCustomers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("customerName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Customer> customers = (List<Customer>) criteria.list();
		return customers;
	}

	public Customer findById(Long id) {
		return getByKey(id);
	}

	public String deleteCustomer(Customer customer) {
		return deleteAndReturn(customer);
	}

	 
   /* private SessionFactory sessionFactory;
 
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
 
    public void saveCustomer(Customer p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Customer saved successfully, Customer Details=" + p);
    }
 
    public void updateCustomer(Customer p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
        logger.info("Customer updated successfully, Person Details=" + p);
    }
 
    @SuppressWarnings("unchecked")
    public List<Customer> listCustomers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Customer> customersList = session.createQuery("from Customer").list();
        for (Customer c : customersList) {
            logger.info("Customer List::" + c);
        }
        return customersList;
    }
 
    public Customer getCustomerById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Customer c = (Customer) session.load(Customer.class, new Integer(id));
        logger.info("Customer loaded successfully, Customer details=" + c);
        return c;
    }
 
    public void deleteCustomer(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Customer c = (Customer) session.load(Customer.class, new Integer(id));
        if (null != c) {
            session.delete(c);
        }
        logger.info("Customer deleted successfully, Customer details=" + c);
    }*/

}
