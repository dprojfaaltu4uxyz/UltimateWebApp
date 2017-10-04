package com.webapp.project.modules.product.service;

import java.util.List;

import com.webapp.project.modules.product.model.ProductDetails;

public interface ProductService {

	ProductDetails findById(int id);
	
	Long saveProductDetails(ProductDetails productDetails);
	
	void updateProductDetails(ProductDetails productDetails);
	void deleteProductDetails(ProductDetails[] productDetails);
	List<ProductDetails> findAllProductDetails(); 
}


