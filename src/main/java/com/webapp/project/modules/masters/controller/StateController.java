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
import com.webapp.project.modules.masters.model.Country;
import com.webapp.project.modules.masters.model.State;
import com.webapp.project.modules.masters.model.StateDTO;
import com.webapp.project.modules.masters.service.CountryService;
import com.webapp.project.modules.masters.service.StateService;

@Controller
public class StateController {

	
	@Autowired
	StateService stateService;
	
	@Autowired
	CountryService countryService;
	
	/*@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Port.class, new PortEditor());
    }*/

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/statelist" }, method = RequestMethod.GET)
	public String listAgents(ModelMap model) {

		List<State> states = stateService.findAllStates();
		model.addAttribute("state", states);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/stateListJSP";
	}

	
	@RequestMapping(value = {"/newstate" }, method = RequestMethod.GET)
	public String loadState(ModelMap model) {
		State state = new State();
		StateDTO stateDTO = new StateDTO();
		List<Country> countryList = new ArrayList<>();
		countryList = countryService.findAllCountries();
		model.addAttribute("state", stateDTO);
		model.addAttribute("countryList", countryList);
		model.addAttribute("loggedinuser", getPrincipal());
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
	
	@RequestMapping(value={"/newstate"},method = RequestMethod.POST)
	public String saveState(@Valid StateDTO stateDTO,BindingResult result,
			ModelMap model){
		
		State state = new State();
		if (result.hasErrors()) {
			
			List<State> stateList = stateService.findAllStates();
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("state", stateDTO);
	        model.addAttribute("stateList", stateList);
			return "masters/stateJSP";
		}
		setDTOToEntity(stateDTO,state);
		//Teacher teacher = new Teacher();
		state.setCountry(state.getCountry());
		
		String status = stateService.save(state);
		
		
		if(status.equalsIgnoreCase("success")){
			stateDTO = new StateDTO();
			model.addAttribute("state", stateDTO);
			model.addAttribute("success", "State " + state.getStateName() + " "+ state.getStateCode() + " created successfully");
			stateDTO.setMessage("State " + state.getStateName() + " "+ state.getStateCode() + " created successfully");
		}else{
			stateDTO.setSelectedCountryId(state.getCountry().getCountryId());
			return "masters/stateJSP";
		}
		
		List<Country> countryList = countryService.findAllCountries();
		model.addAttribute("countryList", countryList);
		model.addAttribute("state", stateDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/stateJSP";
	}
	
	/**
	 * This method will provide the medium to update an existing agent.
	 */
	@RequestMapping(value = { "/edit-state-{id}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable Long id, ModelMap model) {
		State state = stateService.findById(id);
		List<Country> countryList = countryService.findAllCountries();
		
		StateDTO stateDTO = new StateDTO();
		setEntityToDTO(stateDTO, state); 
		stateDTO.setSelectedCountryId(state.getCountry().getCountryId());
		
		model.addAttribute("state", stateDTO);
		model.addAttribute("countryList", countryList);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/stateJSP";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-state-{id}" }, method = RequestMethod.POST)
	public String updateUser(@Valid StateDTO stateDTO, BindingResult result,
			ModelMap model, @PathVariable Long id) {
		State state = new State();
		if (result.hasErrors()) {
			//agent = agentService.findById(id);
			List<Country> countryList = countryService.findAllCountries();
			//agentDTO = new AgentDTO(agent);
			stateDTO.setSelectedCountryId(state.getCountry().getCountryId());
			
			model.addAttribute("state", stateDTO);
			model.addAttribute("countryList", countryList);
			model.addAttribute("edit", true);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/stateJSP";
		}

		/*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registrationJSP";
		}*/

		setDTOToEntity(stateDTO,state);
		String status = stateService.updateState(state);
		
		if(status.equalsIgnoreCase("success")){
			stateDTO = new StateDTO();
			model.addAttribute("state", stateDTO);
			model.addAttribute("success", "Agent " + state.getStateName() + " "+ state.getStateCode() + " created successfully");
			stateDTO.setMessage("Agent " + state.getStateName() + " "+ state.getStateCode() + " created successfully");
		}else{
			//agentDTO = new AgentDTO(agent);
			stateDTO.setSelectedCountryId(state.getCountry().getCountryId());
			model.addAttribute("edit", true);
			return "masters/stateJSP";
		}
		
		List<Country> countryList = countryService.findAllCountries();
		model.addAttribute("countryList", countryList);
		model.addAttribute("state", stateDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "masters/agentJSP";
	}
	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/delete-state-{id}" }, method = RequestMethod.GET)
	public @ResponseBody String deleteUser(@PathVariable Long id) {
		State state = new State();
		state.setStateId(id);
		String status = stateService.deleteState(state);
		if(status.equalsIgnoreCase("success")){
			return "State deleted successfully";
		}else{
			return "Error - Cannot delete Agent";
		}
		
	}
	
	//Important links - https://stackoverflow.com/questions/1667854/copy-all-values-from-fields-in-one-class-to-another-through-reflection
	
	public void setDTOToEntity(StateDTO stateDTO,State state){
		state.setCountry(stateDTO.getCountry());
		state.setCities(stateDTO.getCities());
		state.setStateCode(stateDTO.getStateCode());
		state.setStateId(stateDTO.getStateId());
		state.setStateName(stateDTO.getStateName());
		state.setActive(stateDTO.getActive());
		state.setCreateDate(stateDTO.getCreateDate()); 
		state.setModifiedDate(stateDTO.getModifiedDate()); 
		state.setCreateUserId(stateDTO.getCreateUserId()); 
		state.setCreateUsername(stateDTO.getCreateUsername());
		state.setCreateUsertype(stateDTO.getCreateUsertype());
	}
	
	public void setEntityToDTO(StateDTO stateDTO,State state){
		stateDTO.setCountry(state.getCountry());
		stateDTO.setCities(state.getCities());
		stateDTO.setStateCode(state.getStateCode());
		stateDTO.setStateId(state.getStateId());
		stateDTO.setStateName(state.getStateName()); 
		stateDTO.setActive(state.getActive());
		stateDTO.setCreateDate(state.getCreateDate()); 
		stateDTO.setModifiedDate(state.getModifiedDate()); 
		stateDTO.setCreateUserId(state.getCreateUserId()); 
		stateDTO.setCreateUsername(state.getCreateUsername());
		stateDTO.setCreateUsertype(state.getCreateUsertype());
		
	}
	
	public void setDTOToEntityUsingGson(StateDTO stateDTO, State state){
		Gson gson= new Gson();
		String tmp = gson.toJson(stateDTO);
		state = gson.fromJson(tmp,State.class);
	}
	
	public void setEntityToDTOUsingGson(StateDTO stateDTO, State state){
		Gson gson= new Gson();
		String tmp = gson.toJson(state);
		stateDTO = gson.fromJson(tmp,StateDTO.class);
	}
	
	
}
