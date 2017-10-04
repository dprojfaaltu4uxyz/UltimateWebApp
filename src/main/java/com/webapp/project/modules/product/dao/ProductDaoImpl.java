package com.webapp.project.modules.product.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.webapp.project.framework.dao.AbstractDao;
import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;
import com.webapp.project.modules.product.model.ProductDetails;

@Repository("productDao")
public class ProductDaoImpl  extends AbstractDao<Integer, ProductDetails> implements ProductDao{

	public ProductDetails findById(int id) {

		return null;
	}

	public Long saveProductDetails(ProductDetails productDetails) {
		ProductDetails pdtDetails = new ProductDetails();
		pdtDetails = productDetails;
	    Long id =saveAndReturn(pdtDetails);
	return id;
	}
	public void updateProductDetails(ProductDetails productDetails) {
		update(productDetails);
	}
	public void deleteProductDetails(ProductDetails[] productDetailslist) {
		for(ProductDetails productDetails:productDetailslist){
		delete(productDetails);
		}
	}

	public List<ProductDetails> findAllProductDetails() {

		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ProductDetails> sections = (List<ProductDetails>) criteria.list();
		return sections; 
	}
}
