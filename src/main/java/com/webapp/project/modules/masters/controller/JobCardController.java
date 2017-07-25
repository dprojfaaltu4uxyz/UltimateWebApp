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
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.AgentDTO;
import com.webapp.project.modules.masters.model.Jobcard;
import com.webapp.project.modules.masters.model.JobcardDTO;
import com.webapp.project.modules.masters.model.Port;
import com.webapp.project.modules.masters.service.CargoTypeService;
import com.webapp.project.modules.masters.service.ConsigneeService;
import com.webapp.project.modules.masters.service.ContainerTypeService;
import com.webapp.project.modules.masters.service.CurrencyService;
import com.webapp.project.modules.masters.service.CustomerService;
import com.webapp.project.modules.masters.service.JobCardService;
import com.webapp.project.modules.masters.service.PortService;

@Controller
public class JobCardController {

	
	@Autowired
	JobCardService jobCardService;
	
	@Autowired
	PortService portService;
	
	@Autowired
	ConsigneeService consigneeService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	ContainerTypeService containerTypeService;
	
	@Autowired
	CurrencyService currencyService;
	
	@Autowired
	CargoTypeService cargoTypeService;
	

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/jobCardlist" }, method = RequestMethod.GET)
	public String listAgents(ModelMap model) {

		List<Jobcard> jobCards = jobCardService.findAllJobcards();
		model.addAttribute("jobCards", jobCards);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/jobcardListJSP";
	}

	
	@RequestMapping(value = {"/newjobcard" }, method = RequestMethod.GET)
	public String loadAgent(ModelMap model) {
		Jobcard jobCard = new Jobcard();
		JobcardDTO jobcardDTO = new JobcardDTO();
		List<Port> portList = new ArrayList<>();
		portList = portService.findAllPorts();
		model.addAttribute("jobcard", jobcardDTO);
		model.addAttribute("portList", portList);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/jobcardJSP";
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
	
	@RequestMapping(value={"/newjobcard"},method = RequestMethod.POST)
	public String SaveAgent(@Valid JobcardDTO jobcardDTO,BindingResult result,
			ModelMap model){
		
		Jobcard jobcard = new Jobcard();
		if (result.hasErrors()) {
			
			List<Port> portList = portService.findAllPorts();
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("jobcard", jobcardDTO);
	        model.addAttribute("portList", portList);
			return "masters/jobcardJSP";
		}
		setDTOToEntity(jobcardDTO,jobcard);
		//Teacher teacher = new Teacher();
		System.out.println(jobcard.getPortmasterByPortDischargeId());
		jobcard.setPortmasterByPortDischargeId(jobcard.getPortmasterByPortDischargeId());
		
		String status = jobCardService.saveJobcard(jobcard);
		
		
		if(status.equalsIgnoreCase("success")){
			jobcardDTO = new JobcardDTO();
			model.addAttribute("jobcard", jobcardDTO);
			model.addAttribute("success", "Job " + jobcard.getJobNo() + " "+ jobcard.getJobCode() + " created successfully");
			jobcardDTO.setMessage("Job " + jobcard.getJobNo() + " "+ jobcard.getJobCode() + " created successfully");
		}else{
			jobcardDTO.setSelectedPortId(jobcard.getPortmasterByPortDischargeId().getPortId());
			return "masters/jobcardJSP";
		}
		
		List<Port> portList = portService.findAllPorts();
		model.addAttribute("portList", portList);
		model.addAttribute("jobcard", jobcardDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/jobcardJSP";
	}
	
	/**
	 * This method will provide the medium to update an existing jobcard.
	 */
	@RequestMapping(value = { "/edit-jobcard-{id}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable Long id, ModelMap model) {
		Jobcard jobcard = jobCardService.findById(id);
		List<Port> portList = portService.findAllPorts();
		JobcardDTO  jobcardDTO = new JobcardDTO();
		setEntityToDTO(jobcardDTO, jobcard); 
		jobcardDTO.setSelectedPortId(jobcard.getPortmasterByPortDischargeId().getPortId());
		
		model.addAttribute("jobcard", jobcardDTO);
		model.addAttribute("portList", portList);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/jobcardJSP";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-jobcard-{id}" }, method = RequestMethod.POST)
	public String updateUser(@Valid JobcardDTO jobcardDTO, BindingResult result,
			ModelMap model, @PathVariable Long id) {
		Jobcard jobcard = new Jobcard();
		if (result.hasErrors()) {
			//jobcard = jobcardService.findById(id);
			List<Port> portList = portService.findAllPorts();
			//jobcardDTO = new AgentDTO(jobcard);
			jobcardDTO.setSelectedPortId(jobcard.getPortmasterByPortDischargeId().getPortId());
			
			model.addAttribute("jobcard", jobcardDTO);
			model.addAttribute("portList", portList);
			model.addAttribute("edit", true);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/jobcardJSP";
		}

		/*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registrationJSP";
		}*/

		setDTOToEntity(jobcardDTO,jobcard);
		String status = jobCardService.updateJobcard(jobcard);
		
		if(status.equalsIgnoreCase("success")){
			jobcardDTO = new JobcardDTO();
			model.addAttribute("jobcard", jobcardDTO);
			model.addAttribute("success", "Job " + jobcard.getJobNo() + " "+ jobcard.getJobCode() + " created successfully");
			jobcardDTO.setMessage("Job " + jobcard.getJobNo() + " "+ jobcard.getJobCode() + " created successfully");
		}else{
			//jobcardDTO = new AgentDTO(jobcard);
			jobcardDTO.setSelectedPortId(jobcard.getPortmasterByPortDischargeId().getPortId());
			model.addAttribute("edit", true);
			return "masters/jobcardJSP";
		}
		
		List<Port> portList = portService.findAllPorts();
		model.addAttribute("portList", portList);
		model.addAttribute("jobcard", jobcardDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "masters/jobcardJSP";
	}
	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/delete-jobcard-{id}" }, method = RequestMethod.GET)
	public @ResponseBody String deleteUser(@PathVariable Long jobId) {
		Jobcard jobcard  = new Jobcard();
		jobcard.setJobId(jobId);
		String status = jobCardService.deleteJobcard(jobcard);
		if(status.equalsIgnoreCase("success")){
			return "Job deleted successfully";
		}else{
			return "Error - Cannot delete Job";
		}
		
	}
	
	//Important links - https://stackoverflow.com/questions/1667854/copy-all-values-from-fields-in-one-class-to-another-through-reflection
	
	public void setDTOToEntity(JobcardDTO jobcardDTO,Jobcard jobcard){
		jobcard.setJobCode(jobcardDTO.getJobCode());
		jobcard.setJobDetails(jobcardDTO.getJobDetails()); 
		jobcard.setACDCutOffDate(jobcardDTO.getACDCutOffDate());
		jobcard.setAppUser(jobcardDTO.getAppUser()); 
		jobcard.setBookingDate(jobcardDTO.getBookingDate());
		jobcard.setBookingId(jobcardDTO.getBookingId()); 
		jobcard.setBookingParty(jobcardDTO.getBookingParty()); 
		jobcard.setBroker(jobcardDTO.getBroker()); 
		jobcard.setCargoReady(jobcardDTO.getCargoReady());
		jobcard.setCargoType(jobcardDTO.getCargoType()); 
		jobcard.setConsignee(jobcardDTO.getConsignee()); 
		jobcard.setContainerPickupDate(jobcardDTO.getContainerPickupDate());
		jobcard.setContainerPickupPoint(jobcardDTO.getContainerPickupPoint()); 
		jobcard.setContainerType(jobcardDTO.getContainerType()); 
		jobcard.setCurrency(jobcardDTO.getCurrency()); 
		jobcard.setCustomer(jobcardDTO.getCustomer());
		jobcard.setDocsCutOffDate(jobcardDTO.getDocsCutOffDate());
		jobcard.setEmptyContainerLocation(jobcardDTO.getEmptyContainerLocation());
		jobcard.setEtd(jobcardDTO.getEtd());
		jobcard.setExpectedShipmentDate(jobcardDTO.getExpectedShipmentDate());
		jobcard.setFreightTerms(jobcardDTO.getFreightTerms());
		jobcard.setFinalPlaceOfDelivery(jobcardDTO.getFinalPlaceOfDelivery());
		jobcard.setInvoiceValue(jobcardDTO.getInvoiceValue());
		jobcard.setJobId(jobcardDTO.getJobId());
		jobcard.setJobNo(jobcardDTO.getJobNo());
		jobcard.setPortmasterByPortDischargeId(jobcardDTO.getPortmasterByPortDischargeId());
		jobcard.setPortmasterByPortLoadingId(jobcardDTO.getPortmasterByPortLoadingId());
		jobcard.setPortOfOriginId(jobcardDTO.getPortOfOriginId());
		jobcard.setQuantity(jobcardDTO.getQuantity());
		jobcard.setQuantityType(jobcardDTO.getQuantityType());
		jobcard.setSalesPerson(jobcardDTO.getSalesPerson());
		jobcard.setShipper(jobcardDTO.getShipper());
		jobcard.setCreateDate(jobcardDTO.getCreateDate()); 
		jobcard.setModifiedDate(jobcardDTO.getModifiedDate()); 
		jobcard.setCreateUserId(jobcardDTO.getCreateUserId()); 
		jobcard.setCreateUsername(jobcardDTO.getCreateUsername());
		jobcard.setCreateUsertype(jobcardDTO.getCreateUsertype());
		
	}
	
	public void setEntityToDTO(JobcardDTO jobcardDTO,Jobcard jobcard){
		jobcardDTO.setJobCode(jobcard.getJobCode());
		jobcardDTO.setJobDetails(jobcard.getJobDetails()); 
		jobcardDTO.setACDCutOffDate(jobcard.getACDCutOffDate());
		jobcardDTO.setAppUser(jobcard.getAppUser()); 
		jobcardDTO.setBookingDate(jobcard.getBookingDate());
		jobcardDTO.setBookingId(jobcard.getBookingId()); 
		jobcardDTO.setBookingParty(jobcard.getBookingParty()); 
		jobcardDTO.setBroker(jobcard.getBroker()); 
		jobcardDTO.setCargoReady(jobcard.getCargoReady());
		jobcardDTO.setCargoType(jobcard.getCargoType()); 
		jobcardDTO.setConsignee(jobcard.getConsignee()); 
		jobcardDTO.setContainerPickupDate(jobcard.getContainerPickupDate());
		jobcardDTO.setContainerPickupPoint(jobcard.getContainerPickupPoint()); 
		jobcardDTO.setContainerType(jobcard.getContainerType()); 
		jobcardDTO.setCurrency(jobcard.getCurrency()); 
		jobcardDTO.setCustomer(jobcard.getCustomer());
		jobcardDTO.setDocsCutOffDate(jobcard.getDocsCutOffDate());
		jobcardDTO.setEmptyContainerLocation(jobcard.getEmptyContainerLocation());
		jobcardDTO.setEtd(jobcard.getEtd());
		jobcardDTO.setExpectedShipmentDate(jobcard.getExpectedShipmentDate());
		jobcardDTO.setFreightTerms(jobcard.getFreightTerms());
		jobcardDTO.setFinalPlaceOfDelivery(jobcard.getFinalPlaceOfDelivery());
		jobcardDTO.setInvoiceValue(jobcard.getInvoiceValue());
		jobcardDTO.setJobId(jobcard.getJobId());
		jobcardDTO.setJobNo(jobcard.getJobNo());
		jobcardDTO.setPortmasterByPortDischargeId(jobcard.getPortmasterByPortDischargeId());
		jobcardDTO.setPortmasterByPortLoadingId(jobcard.getPortmasterByPortLoadingId());
		jobcardDTO.setPortOfOriginId(jobcard.getPortOfOriginId());
		jobcardDTO.setQuantity(jobcard.getQuantity());
		jobcardDTO.setQuantityType(jobcard.getQuantityType());
		jobcardDTO.setSalesPerson(jobcard.getSalesPerson());
		jobcardDTO.setShipper(jobcard.getShipper());
		jobcardDTO.setCreateDate(jobcard.getCreateDate()); 
		jobcardDTO.setModifiedDate(jobcard.getModifiedDate()); 
		jobcardDTO.setCreateUserId(jobcard.getCreateUserId()); 
		jobcardDTO.setCreateUsername(jobcard.getCreateUsername());
		jobcardDTO.setCreateUsertype(jobcard.getCreateUsertype());
		
	}
	
	public void setDTOToEntityUsingGson(AgentDTO jobcardDTO, Agent jobcard){
		Gson gson= new Gson();
		String tmp = gson.toJson(jobcardDTO);
		jobcard = gson.fromJson(tmp,Agent.class);
	}
	
	public void setEntityToDTOUsingGson(AgentDTO jobcardDTO, Agent jobcard){
		Gson gson= new Gson();
		String tmp = gson.toJson(jobcard);
		jobcardDTO = gson.fromJson(tmp,AgentDTO.class);
	}
	
}
