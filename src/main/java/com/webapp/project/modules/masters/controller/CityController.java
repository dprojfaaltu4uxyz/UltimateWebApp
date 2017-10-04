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

import com.webapp.project.modules.masters.model.City;
import com.webapp.project.modules.masters.model.CityDTO;
import com.webapp.project.modules.masters.model.Country;
import com.webapp.project.modules.masters.model.Port;
import com.webapp.project.modules.masters.model.State;
import com.webapp.project.modules.masters.model.StateDTO;
import com.webapp.project.modules.masters.service.CityService;
import com.webapp.project.modules.masters.service.StateService;

@Controller
public class CityController {

	
	@Autowired
	CityService cityService;
	

	@Autowired
	StateService stateService;

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/citylist" }, method = RequestMethod.GET)
	public String listCities(ModelMap model) {

		List<City> cities = cityService.findAllCities();
		model.addAttribute("cities", cities);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/cityListJSP";
	}

	
	@RequestMapping(value = {"/newcity" }, method = RequestMethod.GET)
	public String loadCity(ModelMap model) {
		CityDTO cityDTO = new CityDTO();
		List<State> stateList = new ArrayList<>();
		stateList = stateService.findAllStates();
		model.addAttribute("loggedinuser", getPrincipal());
		model.addAttribute("city", cityDTO);
		model.addAttribute("stateList", stateList);
		return "masters/stateJSP";
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
	
	
	@RequestMapping(value={"/newcity"},method = RequestMethod.POST)
	public String SaveAgent(@Valid CityDTO cityDTO,BindingResult result,
			ModelMap model){
		
		City city = new City();
		if (result.hasErrors()) {
			
			List<State> stateList = stateService.findAllStates();
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("city", cityDTO);
	        model.addAttribute("stateList", stateList);
			return "masters/agentJSP";
		}
		setDTOToEntity(cityDTO,city);
		city.setState(city.getState());
		String status = cityService.save(city);
		
		
		if(status.equalsIgnoreCase("success")){
			cityDTO = new CityDTO();
			model.addAttribute("city", cityDTO);
			model.addAttribute("success", "City " + city.getCityName() + " "+ city.getCityCode() + " created successfully");
			cityDTO.setMessage("City " + city.getCityName() + " "+ city.getCityCode() + " created successfully");
		}else{
			cityDTO.setSelectedStateId(city.getState().getStateId());
			return "masters/agentJSP";
		}
		
		List<State> stateList = stateService.findAllStates();
		model.addAttribute("stateList", stateList);
		model.addAttribute("city", cityDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/agentJSP";
	}
	
	/**
	 * This method will provide the medium to update an existing city.
	 */
	@RequestMapping(value = { "/edit-city-{id}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable Long id, ModelMap model) {
		City city = cityService.findById(id);
		List<State> stateList = stateService.findAllStates();
		CityDTO cityDTO = new CityDTO();
		setDTOToEntity(cityDTO, city); 
		cityDTO.setSelectedStateId(city.getState().getStateId());
		
		model.addAttribute("city", cityDTO);
		model.addAttribute("stateList", stateList);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/agentJSP";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-city-{id}" }, method = RequestMethod.POST)
	public String updateUser(@Valid CityDTO cityDTO, BindingResult result,
			ModelMap model, @PathVariable Long id) {
		City city = new City();
		if (result.hasErrors()) {
			//city = agentService.findById(id);
			List<State> stateList = stateService.findAllStates();
			//cityDTO = new CityDTO(city);
			cityDTO.setSelectedStateId(city.getState().getStateId());
			
			model.addAttribute("city", cityDTO);
			model.addAttribute("stateList", stateList);
			model.addAttribute("edit", true);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/agentJSP";
		}

		/*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registrationJSP";
		}*/

		setDTOToEntity(cityDTO,city);
		String status = cityService.updateCity(city);
		
		if(status.equalsIgnoreCase("success")){
			cityDTO = new CityDTO();
			model.addAttribute("city", cityDTO);
			model.addAttribute("success", "City " + city.getCityName() + " "+ city.getCityCode() + " created successfully");
			cityDTO.setMessage("City " + city.getCityName() + " "+ city.getCityCode() + " created successfully");
		}else{
			//cityDTO = new CityDTO(city);
			cityDTO.setSelectedStateId(city.getState().getStateId());
			model.addAttribute("edit", true);
			return "masters/agentJSP";
		}
		
		List<State> stateList = stateService.findAllStates();
		model.addAttribute("stateList", stateList);
		model.addAttribute("city", cityDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "masters/agentJSP";
	}
	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/delete-city-{id}" }, method = RequestMethod.GET)
	public @ResponseBody String deleteCity(@PathVariable Long id) {
		City city  = new City();
		city.setCityId(id);
		String status = cityService.deleteCity(city);
		if(status.equalsIgnoreCase("success")){
			return "City deleted successfully";
		}else{
			return "Error - Cannot delete City";
		}
		
	}
	
	public void setDTOToEntity(CityDTO cityDTO,City city){
		city.setCityId(cityDTO.getCityId());
		city.setAppUser(cityDTO.getAppUser()); 
		city.setState(cityDTO.getState()); 
		city.setCityName(cityDTO.getCityName()); 
		city.setCityCode(cityDTO.getCityCode()); 
		city.setAirAgents(cityDTO.getAirAgents());
		city.setVendors(cityDTO.getVendors());
		city.setCustomers(cityDTO.getCustomers());
		city.setCreateDate(cityDTO.getCreateDate()); 
		city.setModifiedDate(cityDTO.getModifiedDate()); 
		city.setCreateUserId(cityDTO.getCreateUserId()); 
		city.setCreateUsername(cityDTO.getCreateUsername());
		city.setCreateUsertype(cityDTO.getCreateUsertype());
		
	}
	
	public void setEntityToDTO(CityDTO cityDTO,City city){
		cityDTO.setCityId(city.getCityId());
		cityDTO.setAppUser(city.getAppUser()); 
		cityDTO.setState(city.getState()); 
		cityDTO.setCityName(city.getCityName()); 
		cityDTO.setCityCode(city.getCityCode()); 
		cityDTO.setAirAgents(city.getAirAgents());
		cityDTO.setVendors(city.getVendors());
		cityDTO.setCustomers(city.getCustomers());
		cityDTO.setCreateDate(city.getCreateDate()); 
		cityDTO.setModifiedDate(city.getModifiedDate()); 
		cityDTO.setCreateUserId(city.getCreateUserId()); 
		cityDTO.setCreateUsername(city.getCreateUsername());
		cityDTO.setCreateUsertype(city.getCreateUsertype());
		
	}
	
	
}
