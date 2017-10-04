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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.AgentDTO;
import com.webapp.project.modules.masters.model.Country;
import com.webapp.project.modules.masters.model.CountryDTO;
import com.webapp.project.modules.masters.model.Port;
import com.webapp.project.modules.masters.service.AgentService;
import com.webapp.project.modules.masters.service.PortService;

@Controller
public class AgentController {

	
	@Autowired
	AgentService agentService;
	
	@Autowired
	PortService portService;
	
	/*@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Port.class, new PortEditor());
    }*/

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/agentlist" }, method = RequestMethod.GET)
	public String listAgents(ModelMap model) {

		List<Agent> agents = agentService.findAllAgent();
		model.addAttribute("agents", agents);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/agentListJSP";
	}

	
	@RequestMapping(value = {"/newagent" }, method = RequestMethod.GET)
	public String loadAgent(ModelMap model) {
		Agent agent = new Agent();
		AgentDTO agentDTO = new AgentDTO();
		List<Port> portList = new ArrayList<>();
		portList = portService.findAllPorts();
		model.addAttribute("agent", agentDTO);
		model.addAttribute("portList", portList);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/agentJSP";
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
	
	@RequestMapping(value={"/newagent"},method = RequestMethod.POST)
	public String SaveAgent(@Valid AgentDTO agentDTO,BindingResult result,
			ModelMap model){
		
		Agent agent = new Agent();
		if (result.hasErrors()) {
			
			List<Port> portList = portService.findAllPorts();
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("agent", agentDTO);
	        model.addAttribute("portList", portList);
			return "masters/agentJSP";
		}
		setDTOToEntity(agentDTO,agent);
		//Teacher teacher = new Teacher();
		System.out.println(agent.getPort());
		agent.setPort(agent.getPort());
		
		String status = agentService.saveAgent(agent);
		
		
		if(status.equalsIgnoreCase("success")){
			agentDTO = new AgentDTO();
			model.addAttribute("agent", agentDTO);
			model.addAttribute("success", "Agent " + agent.getAgentName() + " "+ agent.getAgentCode() + " created successfully");
			agentDTO.setMessage("Agent " + agent.getAgentName() + " "+ agent.getAgentCode() + " created successfully");
		}else{
			agentDTO.setSelectedPortId(agent.getPort().getPortId());
			return "masters/agentJSP";
		}
		
		List<Port> portList = portService.findAllPorts();
		model.addAttribute("portList", portList);
		model.addAttribute("agent", agentDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/agentJSP";
	}
	
	/**
	 * This method will provide the medium to update an existing agent.
	 */
	@RequestMapping(value = { "/edit-agent-{id}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable Long id, ModelMap model) {
		Agent agent = agentService.findById(id);
		List<Port> portList = portService.findAllPorts();
		AgentDTO agentDTO = new AgentDTO();
		setEntityToDTO(agentDTO, agent); 
		agentDTO.setSelectedPortId(agent.getPort().getPortId());
		
		model.addAttribute("agent", agentDTO);
		model.addAttribute("portList", portList);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/agentJSP";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-agent-{id}" }, method = RequestMethod.POST)
	public String updateUser(@Valid AgentDTO agentDTO, BindingResult result,
			ModelMap model, @PathVariable Long id) {
		Agent agent = new Agent();
		if (result.hasErrors()) {
			//agent = agentService.findById(id);
			List<Port> portList = portService.findAllPorts();
			//agentDTO = new AgentDTO(agent);
			agentDTO.setSelectedPortId(agent.getPort().getPortId());
			
			model.addAttribute("agent", agentDTO);
			model.addAttribute("portList", portList);
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

		setDTOToEntity(agentDTO,agent);
		String status = agentService.updateAgent(agent);
		
		if(status.equalsIgnoreCase("success")){
			agentDTO = new AgentDTO();
			model.addAttribute("agent", agentDTO);
			model.addAttribute("success", "Agent " + agent.getAgentName() + " "+ agent.getAgentCode() + " updated successfully");
			agentDTO.setMessage("Agent " + agent.getAgentName() + " "+ agent.getAgentCode() + " updated successfully");
		}else{
			//agentDTO = new AgentDTO(agent);
			agentDTO.setSelectedPortId(agent.getPort().getPortId());
			model.addAttribute("edit", true);
			return "masters/agentJSP";
		}
		
		List<Port> portList = portService.findAllPorts();
		model.addAttribute("portList", portList);
		model.addAttribute("agent", agentDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "masters/agentJSP";
	}
	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/delete-agent-{id}" }, method = RequestMethod.GET)
	public @ResponseBody String deleteUser(@PathVariable Long id) {
		Agent agent  = new Agent();
		agent.setAgentId(id);
		String status = agentService.deleteAgent(agent);
		if(status.equalsIgnoreCase("success")){
			return "Agent deleted successfully";
		}else{
			return "Error - Cannot delete Agent";
		}
		
	}
	
	//Important links - https://stackoverflow.com/questions/1667854/copy-all-values-from-fields-in-one-class-to-another-through-reflection
	
	public void setDTOToEntity(AgentDTO agentDTO,Agent agent){
		agent.setAgentId(agentDTO.getAgentId());
		agent.setAppUser(agentDTO.getAppUser()); 
		agent.setPort(agentDTO.getPort());
		agent.setAgentName(agentDTO.getAgentName()); 
		agent.setAddress(agentDTO.getAddress());
		agent.setAgentCode(agentDTO.getAgentCode()); 
		agent.setEmail(agentDTO.getEmail()); 
		agent.setTelephone(agentDTO.getTelephone()); 
		agent.setFax(agentDTO.getFax());
		agent.setContactPerson(agentDTO.getContactPerson()); 
		agent.setContactNumber(agentDTO.getContactNumber()); 
		agent.setActive(agentDTO.getActive());
		agent.setAgentType(agentDTO.getAgentType()); 
		agent.setCreateDate(agentDTO.getCreateDate()); 
		agent.setModifiedDate(agentDTO.getModifiedDate()); 
		agent.setCreateUserId(agentDTO.getCreateUserId()); 
		agent.setCreateUsername(agentDTO.getCreateUsername());
		agent.setCreateUsertype(agentDTO.getCreateUsertype());
		
	}
	
	public void setEntityToDTO(AgentDTO agentDTO,Agent agent){
		agentDTO.setAgentId(agent.getAgentId());
		agentDTO.setAppUser(agent.getAppUser()); 
		agentDTO.setPort(agent.getPort());
		agentDTO.setAgentName(agent.getAgentName()); 
		agentDTO.setAddress(agent.getAddress());
		agentDTO.setAgentCode(agent.getAgentCode()); 
		agentDTO.setEmail(agent.getEmail()); 
		agentDTO.setTelephone(agent.getTelephone()); 
		agentDTO.setFax(agent.getFax());
		agentDTO.setContactPerson(agent.getContactPerson()); 
		agentDTO.setContactNumber(agent.getContactNumber()); 
		agentDTO.setActive(agent.getActive());
		agentDTO.setAgentType(agent.getAgentType()); 
		agentDTO.setCreateDate(agent.getCreateDate()); 
		agentDTO.setModifiedDate(agent.getModifiedDate()); 
		agentDTO.setCreateUserId(agent.getCreateUserId()); 
		agentDTO.setCreateUsername(agent.getCreateUsername());
		agentDTO.setCreateUsertype(agent.getCreateUsertype());
		
	}
	
	public void setDTOToEntityUsingGson(AgentDTO agentDTO, Agent agent){
		Gson gson= new Gson();
		String tmp = gson.toJson(agentDTO);
		agent = gson.fromJson(tmp,Agent.class);
	}
	
	public void setEntityToDTOUsingGson(AgentDTO agentDTO, Agent agent){
		Gson gson= new Gson();
		String tmp = gson.toJson(agent);
		agentDTO = gson.fromJson(tmp,AgentDTO.class);
	}
	
	
}
