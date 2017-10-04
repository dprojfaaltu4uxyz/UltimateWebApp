package com.webapp.project.modules.product.dao;

import java.util.List;

import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;
import com.webapp.project.modules.product.model.ProductDetails;



public interface ProductDao {

	ProductDetails findById(int id);
	
	//Teacher findBySSO(String sso);
	
	Long saveProductDetails(ProductDetails productDetails);
	void updateProductDetails(ProductDetails productDetails);
	void deleteProductDetails(ProductDetails[] productDetails);
	
	List<ProductDetails> findAllProductDetails();
}
