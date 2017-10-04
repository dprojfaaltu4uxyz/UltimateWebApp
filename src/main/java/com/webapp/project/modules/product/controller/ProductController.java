package com.webapp.project.modules.product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webapp.project.modules.product.model.ProductDetails;
import com.webapp.project.modules.product.service.ProductService;
import com.webapp.project.modules.teacher.model.Teacher;
import com.webapp.project.modules.teacher.model.modeleditor.TeacherEditor;

@Controller
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Teacher.class, new TeacherEditor());
    }

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/productlist" }, method = RequestMethod.GET)
	public@ResponseBody List<ProductDetails> productlist(ModelMap model) {

		List<ProductDetails> productDetailsList = productService.findAllProductDetails();		 
		model.addAttribute("productDetailsList", productDetailsList);
		model.addAttribute("loggedinuser", getPrincipal());		
		return productDetailsList;
	}
	@RequestMapping(value = {"/newProductDetails" }, method = RequestMethod.GET)
	public String newProductDetails(ModelMap model) {
		ProductDetails productDetails = new ProductDetails();
		model.addAttribute("productDetails", productDetails);
		return "product/productDetailsJSP";
	}
	
	@RequestMapping(value="/saveProductDetails", method = RequestMethod.POST)	
	public @ResponseBody Long saveProductDetails(@Valid  ProductDetails productDetails,BindingResult result,
			ModelMap model) {
		//System.out.println(data);
		model.addAttribute("productDetails", productDetails);
		productDetails.setPdtId(0);
		Long productDetailsId = productService.saveProductDetails(productDetails);
		return productDetailsId;
	}
	
	@RequestMapping(value = "/updateProductDetails")	
	public @ResponseBody String updateProductDetails(@RequestBody ProductDetails ProductDetails) {
		//System.out.println(data);
		productService.updateProductDetails(ProductDetails);
		return "Success";
	}
	
	@RequestMapping(value = "/deleteProductDetails")	
	public @ResponseBody String deleteProductDetails(@RequestBody ProductDetails[] ProductDetails) {
		//System.out.println(data);
		productService.deleteProductDetails(ProductDetails);
		return "success";
	}
	
	
	/**
	 * This method returns the principal[user-name] of logged-in user.
	 */
	private String getPrincipal(){
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails)principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}
	
}
