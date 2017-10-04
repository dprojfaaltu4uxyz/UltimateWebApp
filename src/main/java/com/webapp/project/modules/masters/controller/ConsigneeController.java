package com.webapp.project.modules.masters.controller;

import java.util.ArrayList;
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
import com.webapp.project.modules.masters.model.City;
import com.webapp.project.modules.masters.model.Consignee;
import com.webapp.project.modules.masters.model.ConsigneeDTO;
import com.webapp.project.modules.masters.model.Country;
import com.webapp.project.modules.masters.service.CityService;
import com.webapp.project.modules.masters.service.ConsigneeService;
import com.webapp.project.modules.masters.service.CountryService;

@Controller
public class ConsigneeController {

	
	@Autowired
	ConsigneeService consigneeService;
	
	@Autowired
	CityService cityService;
	
	@Autowired
	CountryService countryService;
	
	/*@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(port.class, new portEditor());
    }*/

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/consigneelist" }, method = RequestMethod.GET)
	public String listConsignees(ModelMap model) {

		List<Consignee> consignees = consigneeService.findAllConsignees();
		model.addAttribute("consignees", consignees);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/consigneeListJSP";
	}

	
	@RequestMapping(value = {"/newconsignee" }, method = RequestMethod.GET)
	public String loadConsignee(ModelMap model) {
		Consignee consignee = new Consignee();
		ConsigneeDTO consigneeDTO = new ConsigneeDTO();
		List<Country> countryList = new ArrayList<>();
		countryList = countryService.findAllCountries();
		
		List<City> cityList = new ArrayList<>();
		cityList = cityService.findAllCities();

		model.addAttribute("consignee", consigneeDTO);
		model.addAttribute("countryList", countryList);
		model.addAttribute("cityList", cityList);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/consigneeJSP";
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
	
	@RequestMapping(value={"/newconsignee"},method = RequestMethod.POST)
	public String SaveConsignee(@Valid ConsigneeDTO consigneeDTO,BindingResult result,
			ModelMap model){
		
		Consignee consignee = new Consignee();
		if (result.hasErrors()) {
			
			List<Country> countryList = countryService.findAllCountries();
			model.addAttribute("loggedinuser", getPrincipal());
			List<City> cityList = new ArrayList<>();
			cityList = cityService.findAllCities();
			model.addAttribute("consignee", consigneeDTO);
	        model.addAttribute("countryList", countryList);
	        model.addAttribute("cityList", cityList);

			return "masters/consigneeJSP";
		}
		setDTOToEntity(consigneeDTO,consignee);
		//Teacher teacher = new Teacher();
		System.out.println(consignee.getCountry());
		consignee.setCountry(consignee.getCountry());
		
		String status = consigneeService.saveConsignee(consignee);
		
		
		if(status.equalsIgnoreCase("success")){
			consigneeDTO = new ConsigneeDTO();
			model.addAttribute("consignee", consigneeDTO);
			model.addAttribute("success", "Consignee " + consignee.getName() + " "+ consignee.getCode() + " updated successfully");
			consigneeDTO.setMessage("Consignee " + consignee.getName() + " "+ consignee.getCode() + " updated successfully");
		}else{
			consigneeDTO.setSelectedCountryId(consignee.getCountry().getCountryId());
			return "masters/consigneeJSP";
		}
		
		List<Country> countryList = countryService.findAllCountries();
		List<City> cityList = new ArrayList<>();
		cityList = cityService.findAllCities();
		model.addAttribute("countryList", countryList);
		model.addAttribute("cityList", cityList);
		model.addAttribute("consignee", consigneeDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/consigneeJSP";
	}
	
	/**
	 * This method will provide the medium to update an existing consignee.
	 */
	@RequestMapping(value = { "/edit-consignee-{id}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable Long id, ModelMap model) {
		Consignee consignee = consigneeService.findById(id);
		List<Country> countryList = countryService.findAllCountries();
		List<City> cityList = new ArrayList<>();
		cityList = cityService.findAllCities();
		ConsigneeDTO consigneeDTO = new ConsigneeDTO();
		setEntityToDTO(consigneeDTO, consignee); 
		consigneeDTO.setSelectedCountryId(consignee.getCountry().getCountryId());
		
		model.addAttribute("consignee", consigneeDTO);
		model.addAttribute("countryList", countryList);
		model.addAttribute("cityList", cityList);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/consigneeJSP";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-consignee-{id}" }, method = RequestMethod.POST)
	public String updateUser(@Valid ConsigneeDTO consigneeDTO, BindingResult result,
			ModelMap model, @PathVariable Long id) {
		Consignee consignee = new Consignee();
		if (result.hasErrors()) {
			//consignee = consigneeService.findById(id);
			List<Country> countryList = countryService.findAllCountries();
			List<City> cityList = new ArrayList<>();
			cityList = cityService.findAllCities();
			//consigneeDTO = new ConsigneeDTO(consignee);
			consigneeDTO.setSelectedCountryId(consignee.getCountry().getCountryId());
			
			model.addAttribute("consignee", consigneeDTO);
			model.addAttribute("countryList", countryList);
			model.addAttribute("cityList", cityList);
			model.addAttribute("edit", true);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/consigneeJSP";
		}

		/*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registrationJSP";
		}*/

		setDTOToEntity(consigneeDTO,consignee);
		String status = consigneeService.updateConsignee(consignee);
		
		if(status.equalsIgnoreCase("success")){
			consigneeDTO = new ConsigneeDTO();
			model.addAttribute("consignee", consigneeDTO);
			model.addAttribute("success", "Consignee " + consignee.getName() + " "+ consignee.getCode() + " updated successfully");
			consigneeDTO.setMessage("Consignee " + consignee.getName() + " "+ consignee.getCode() + " updated successfully");
		}else{
			//consigneeDTO = new ConsigneeDTO(consignee);
			consigneeDTO.setSelectedCountryId(consignee.getCountry().getCountryId());
			model.addAttribute("edit", true);
			return "masters/consigneeJSP";
		}
		
		List<Country> countryList = countryService.findAllCountries();
		List<City> cityList = new ArrayList<>();
		cityList = cityService.findAllCities();
		model.addAttribute("countryList", countryList);
		model.addAttribute("cityList", cityList);
		model.addAttribute("consignee", consigneeDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "masters/consigneeJSP";
	}
	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/delete-consignee-{id}" }, method = RequestMethod.GET)
	public @ResponseBody String deleteUser(@PathVariable Long id) {
		Consignee consignee  = new Consignee();
		consignee.setConsigneeId(id);
		String status = consigneeService.deleteConsignee(consignee);
		if(status.equalsIgnoreCase("success")){
			return "Consignee deleted successfully";
		}else{
			return "Error - Cannot delete Consignee";
		}
		
	}
	
	//Imcountryant links - https://stackoverflow.com/questions/1667854/copy-all-values-from-fields-in-one-class-to-another-through-reflection
	
	public void setDTOToEntity(ConsigneeDTO consigneeDTO,Consignee consignee){
		consignee.setConsigneeId(consigneeDTO.getConsigneeId());
		consignee.setAppUser(consigneeDTO.getAppUser()); 
		consignee.setCountry(consigneeDTO.getCountry());
		consignee.setName(consigneeDTO.getName()); 
		consignee.setAddressOne(consigneeDTO.getAddressOne());
		consignee.setAddressTwo(consigneeDTO.getAddressTwo());
		consignee.setAddressThree(consigneeDTO.getAddressThree());
		consignee.setCode(consigneeDTO.getCode()); 
		//consigneeDTO.setEmail(consignee.getEmail()); 
		consignee.setActive(consigneeDTO.getActive());
		consignee.setCreateDate(consigneeDTO.getCreateDate()); 
		consignee.setModifyDate(consigneeDTO.getModifyDate()); 
		consignee.setCreateUserId(consigneeDTO.getCreateUserId()); 
		consignee.setCreateUsername(consigneeDTO.getCreateUsername());
		consignee.setCreateUsertype(consigneeDTO.getCreateUsertype());
		
	}
	
	public void setEntityToDTO(ConsigneeDTO consigneeDTO,Consignee consignee){
		consigneeDTO.setConsigneeId(consignee.getConsigneeId());
		consigneeDTO.setAppUser(consignee.getAppUser()); 
		consigneeDTO.setCountry(consignee.getCountry());
		consigneeDTO.setName(consignee.getName()); 
		consigneeDTO.setAddressOne(consignee.getAddressOne());
		consigneeDTO.setAddressTwo(consignee.getAddressTwo());
		consigneeDTO.setAddressThree(consignee.getAddressThree());
		consigneeDTO.setCode(consignee.getCode()); 
		//consigneeDTO.setEmail(consignee.getEmail()); 
		consigneeDTO.setActive(consignee.getActive());
		consigneeDTO.setCreateDate(consignee.getCreateDate()); 
		consigneeDTO.setModifyDate(consignee.getModifyDate()); 
		consigneeDTO.setCreateUserId(consignee.getCreateUserId()); 
		consigneeDTO.setCreateUsername(consignee.getCreateUsername());
		consigneeDTO.setCreateUsertype(consignee.getCreateUsertype());
		
	}
	
	public void setDTOToEntityUsingGson(ConsigneeDTO consigneeDTO, Consignee consignee){
		Gson gson= new Gson();
		String tmp = gson.toJson(consigneeDTO);
		consignee = gson.fromJson(tmp,Consignee.class);
	}
	
	public void setEntityToDTOUsingGson(ConsigneeDTO consigneeDTO, Consignee consignee){
		Gson gson= new Gson();
		String tmp = gson.toJson(consignee);
		consigneeDTO = gson.fromJson(tmp,ConsigneeDTO.class);
	}
	
	
}
