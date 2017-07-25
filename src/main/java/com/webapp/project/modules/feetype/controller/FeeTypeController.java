package com.webapp.project.modules.feetype.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webapp.project.modules.feetype.model.FeeType;
import com.webapp.project.modules.feetype.service.FeeTypeService;

@Controller
public class FeeTypeController {

	
	@Autowired
	FeeTypeService feeTypeService; 
	

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/feeTypelist" }, method = RequestMethod.GET)
	public String listFeetypes(ModelMap model) {

		List<FeeType> feeTypes = feeTypeService.findAllFeeType();
		model.addAttribute("feeTypes", feeTypes);
		model.addAttribute("loggedinuser", getPrincipal());
		return "feetype/feeTypesListJSP";
	}

	
	@RequestMapping(value = {"/newfeetypes" }, method = RequestMethod.GET)
	public String loadDashBoard(ModelMap model) {
		FeeType feeType = new FeeType();

		model.addAttribute("loggedinuser", getPrincipal());
		return "feetype/feeTypeJSP";
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
	
	@RequestMapping(value={"/newfeetypes"},method = RequestMethod.POST)
	public String SaveClass(@Valid FeeType feeType,BindingResult result,
			ModelMap model){
		
		if (result.hasErrors()) {
			
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("feeType", feeType);
			return "feetype/feeType/JSP";
		}
		
		feeTypeService.saveFeeType(feeType);
		
		model.addAttribute("success", "Fee Type " + feeType.getFeetypes() + " added successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "registrationsuccessJSP";
	}
	
}
