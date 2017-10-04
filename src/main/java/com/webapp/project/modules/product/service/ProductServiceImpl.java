package com.webapp.project.modules.product.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.project.modules.invoice.dao.InvoiceDao;
import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;
import com.webapp.project.modules.product.dao.ProductDao;
import com.webapp.project.modules.product.model.ProductDetails;


@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;
	
	public ProductDetails findById(int id) {
		return dao.findById(id);
	}

	public Long saveProductDetails(ProductDetails productDetails) {
		productDetails.setCreateDate(new Date());
		productDetails.setModifyDate(new Date());				
		return dao.saveProductDetails(productDetails);
	}

	

	public List<ProductDetails> findAllProductDetails() {
		return dao.findAllProductDetails();
	}

	public void updateProductDetails(ProductDetails productDetails) {		 
		productDetails.setModifyDate(new Date());
		dao.updateProductDetails(productDetails);
	}
	public void deleteProductDetails(ProductDetails[] productDetails) {
		dao.deleteProductDetails(productDetails);
	}
	
}
