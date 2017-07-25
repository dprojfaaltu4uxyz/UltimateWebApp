package com.webapp.project.modules.masters.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.AgentDTO;
import com.webapp.project.modules.masters.model.Country;
import com.webapp.project.modules.masters.model.CountryDTO;
import com.webapp.project.modules.masters.model.Port;
import com.webapp.project.modules.masters.service.CountryService;

@Controller
public class CountryController {

	
	@Autowired
	CountryService countryService;
	
	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/countrylist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

		List<Country> countries = countryService.findAllCountries();
		model.addAttribute("countries", countries);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/countryListJSP";
	}

	
	@RequestMapping(value = {"/newcountry" }, method = RequestMethod.GET)
	public String loadCountry(ModelMap model) {
		CountryDTO countryDTO = new CountryDTO();
		model.addAttribute("country", countryDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/countryJSP";
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
	
	@RequestMapping(value={"/newcountry"},method = RequestMethod.POST)
	public String SaveCountry(@Valid CountryDTO countryDTO,BindingResult result,
			ModelMap model){
		
		if (result.hasErrors()) {
			model.addAttribute("country", countryDTO);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/countryJSP";
		}
		
		Country country = new Country();
		setDTOToEntity(countryDTO, country);
		country.setCreateUsername(getPrincipal());
		
		String status = countryService.save(country);
		
		if(status.equalsIgnoreCase("success")){
			countryDTO = new CountryDTO();
			model.addAttribute("country", countryDTO);
			model.addAttribute("success", "Country " + country.getCountryName() + " "+ country.getCountryCode() + " created successfully");
			countryDTO.setMessage("Country " + country.getCountryName() + " "+ country.getCountryCode() + " created successfully");
		}else{
			return "masters/countryJSP";
		}
		
		model.addAttribute("country", countryDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/countryJSP";
	}
	
	/**
	 * This method will provide the medium to update an existing agent.
	 */
	@RequestMapping(value = { "/edit-country-{id}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable Long id, ModelMap model) {
		Country country = countryService.findById(id);
		CountryDTO countryDTO = new CountryDTO();
		setDTOToEntity(countryDTO, country);
		model.addAttribute("country", countryDTO);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/agentJSP";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-country-{id}" }, method = RequestMethod.POST)
	public String updateUser(@Valid CountryDTO countryDTO, BindingResult result,
			ModelMap model, @PathVariable Long id) {
		Country country = new Country();
		if (result.hasErrors()) {
			model.addAttribute("country", countryDTO);
			model.addAttribute("edit", true);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/agentJSP";
		}

		setDTOToEntity(countryDTO,country);
		String status = countryService.updateCountry(country);
		
		if(status.equalsIgnoreCase("success")){
			countryDTO = new CountryDTO();
			model.addAttribute("agent", countryDTO);
			model.addAttribute("success", "Country " + country.getCountryName() + " "+ country.getCountryCode() + " created successfully");
			countryDTO.setMessage("Country " + country.getCountryName() + " "+ country.getCountryCode() + " created successfully");
		}else{
			model.addAttribute("edit", true);
			return "masters/agentJSP";
		}
		
		model.addAttribute("country", countryDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/agentJSP";
	}
	
	/**
	 * This method will delete an user by it's CountryID value.
	 */
	@RequestMapping(value = { "/delete-country-{id}" }, method = RequestMethod.GET)
	public @ResponseBody String deleteUser(@PathVariable Long id) {
		Country country  = new Country();
		country.setCountryId(id);
		String status = countryService.deleteCountry(country);
		if(status.equalsIgnoreCase("success")){
			return "Agent deleted successfully";
		}else{
			return "Error - Cannot delete Agent";
		}
		
	}
	
	
	public void setDTOToEntityUsingGson(CountryDTO countryDTO, Country country){
		Gson gson= new Gson();
		String tmp = gson.toJson(countryDTO);
		country = gson.fromJson(tmp,Country.class);
	}
	
	public void setEntityToDTOUsingGson(CountryDTO countryDTO, Country country){
		Gson gson= new Gson();
		String tmp = gson.toJson(country);
		countryDTO = gson.fromJson(tmp,CountryDTO.class);
	}
	
	public void setDTOToEntity(CountryDTO countryDTO, Country country) {
		countryDTO.setCountryId(country.getCountryId());
		countryDTO.setCountryName(country.getCountryName()); 
		countryDTO.setCountryCode(country.getCountryCode()); 
		countryDTO.setCreateDate(country.getCreateDate()); 
		countryDTO.setModifiedDate(country.getModifiedDate());
		countryDTO.setCreateUserId(country.getCreateUserId());
		countryDTO.setCreateUsername(country.getCreateUsername());
		countryDTO.setCreateUsertype(country.getCreateUsertype());
		countryDTO.setCustomers(country.getCustomers());
		countryDTO.setStates(country.getStates());
		countryDTO.setAppUser(country.getAppUser());
	}
	
}
