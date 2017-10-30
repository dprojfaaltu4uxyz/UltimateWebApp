package com.webapp.project.modules.party.controller;

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

import com.webapp.project.modules.party.model.PartyLicense;
import com.webapp.project.modules.party.model.PartyLicenseDTO;
import com.webapp.project.modules.party.service.PartyLicenseService;

@Controller
public class PartyLicenseController {

	
	@Autowired
	PartyLicenseService partyLicenseService;
	

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/partyLicenselist" }, method = RequestMethod.GET)
	public String listPartyLicenses(ModelMap model) {

		List<PartyLicense> licenses = partyLicenseService.findAllLicenses();
		model.addAttribute("licenses", licenses);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/partyLicenseListJSP";
	}

	
	@RequestMapping(value = {"/newpartylicense" }, method = RequestMethod.GET)
	public String loadAgent(ModelMap model) {
		PartyLicense partyLicense = new PartyLicense();
		PartyLicenseDTO partyLicenseDTO = new PartyLicenseDTO();
		
		model.addAttribute("loggedinuser", getPrincipal());
		model.addAttribute("partyLicense",partyLicenseDTO);
		return "masters/partyLicenseJSP";
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
	
	@RequestMapping(value={"/newpartylicense"},method = RequestMethod.POST)
	public String SaveParty(@Valid PartyLicenseDTO partyLicenseDTO,BindingResult result,
			ModelMap model){
		
		PartyLicense partyLicense = new PartyLicense();
		if (result.hasErrors()) {
			
			model.addAttribute("partyLicense",partyLicenseDTO);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/partyDetailsJSP";	
		}
		setDTOToEntity(partyLicenseDTO,partyLicense);
		
		String status = partyLicenseService.savePartyLicense(partyLicense);
		
		
		if(status.equalsIgnoreCase("success")){
			partyLicenseDTO = new PartyLicenseDTO();
			model.addAttribute("party", partyLicenseDTO);
			model.addAttribute("success", "Party " + PartyLicenseDTO.partyLicenseType.valueOf(partyLicense.getPartyLicenseType())  + " of "+ partyLicense.getParty().getShortName() + " created successfully");
			partyLicenseDTO.setMessage("License " + PartyLicenseDTO.partyLicenseType.valueOf(partyLicense.getPartyLicenseType()) + " of "+ partyLicense.getParty().getShortName() + " created successfully");
		}else{
			partyLicenseDTO.setSelectedPartyLicenseTypeId(PartyLicenseDTO.partyLicenseType.valueOf(partyLicense.getPartyLicenseType()).getLicenseTypeId());
			return "masters/partyDetailsJSP";
		}
		
		
		model.addAttribute("partyLicense", partyLicenseDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/partyDetailsJSP";
	}
	
	/**
	 * This method will provide the medium to update an existing party.
	 */
	@RequestMapping(value = { "/edit-partylicense-{id}" }, method = RequestMethod.GET)
	public String editParty(@PathVariable Long id, ModelMap model) {
		PartyLicense partyLicense = partyLicenseService.findById(id);
		PartyLicenseDTO  partyLicenseDTO = new PartyLicenseDTO();
		setEntityToDTO(partyLicenseDTO, partyLicense); 
		partyLicenseDTO.setSelectedPartyLicenseTypeId(PartyLicenseDTO.partyLicenseType.valueOf(partyLicense.getPartyLicenseType()).getLicenseTypeId());
		
		
		
		model.addAttribute("partyLicesnse", partyLicenseDTO);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/partyLicenseJSP";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-partylicense-{id}" }, method = RequestMethod.POST)
	public String updateParty(@Valid PartyLicenseDTO partyLicenseDTO, BindingResult result,
			ModelMap model, @PathVariable Long id) {
		PartyLicense partyLicense = new PartyLicense();
		if (result.hasErrors()) {
			model.addAttribute("edit", true);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/partyDetailsJSP";
		}

		setDTOToEntity(partyLicenseDTO,partyLicense);
		String status = partyLicenseService.updatePartyLicense(partyLicense);
		
		if(status.equalsIgnoreCase("success")){
			partyLicenseDTO = new PartyLicenseDTO();
			model.addAttribute("partyLicense", partyLicenseDTO);
			model.addAttribute("success", "Party " + PartyLicenseDTO.partyLicenseType.valueOf(partyLicense.getPartyLicenseType())  + " of "+ partyLicense.getParty().getShortName() + " created successfully");
			partyLicenseDTO.setMessage("License " + PartyLicenseDTO.partyLicenseType.valueOf(partyLicense.getPartyLicenseType()) + " of "+ partyLicense.getParty().getShortName() + " created successfully");
		}else{
			//partyDTO = new AgentDTO(party);
			partyLicenseDTO.setSelectedPartyLicenseTypeId(PartyLicenseDTO.partyLicenseType.valueOf(partyLicense.getPartyLicenseType()).getLicenseTypeId());
			model.addAttribute("edit", true);
			return "masters/partyDetailsJSP";
		}
		
		model.addAttribute("partyLicense", partyLicenseDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/partyDetailsJSP";
	}
	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/delete-partylicense-{id}" }, method = RequestMethod.GET)
	public @ResponseBody String deleteUser(@PathVariable Long partyLicenseId) {
		PartyLicense partyLicense  = new PartyLicense();
		partyLicense.setPartyLicenseId(partyLicenseId);
		String status = partyLicenseService.deletePartyLicense(partyLicense);
		if(status.equalsIgnoreCase("success")){
			return "Party deleted successfully";
		}else{
			return "Error - Cannot delete Party";
		}
		
	}
	
	public void setDTOToEntity(PartyLicenseDTO partyLicenseDTO,PartyLicense partyLicense){
		partyLicense.setParty(partyLicenseDTO.getParty());
		partyLicense.setRegDate(partyLicenseDTO.getRegDate());
		partyLicense.setAppUser(partyLicenseDTO.getAppUser());
		partyLicense.setLicDate(partyLicenseDTO.getLicDate());
		partyLicense.setQty(partyLicenseDTO.getQty());
		partyLicense.setRegNo(partyLicenseDTO.getRegNo());
		partyLicense.setAppUser(partyLicenseDTO.getAppUser());
		partyLicense.setCreateDate(partyLicenseDTO.getCreateDate());
		partyLicense.setModifyDate(partyLicenseDTO.getModifyDate());
		partyLicense.setCreateUserId(partyLicenseDTO.getCreateUserId());
		partyLicense.setPartyLicenseId(partyLicenseDTO.getPartyLicenseId());
		partyLicense.setCreateUsername(partyLicenseDTO.getCreateUsername());
		partyLicense.setCreateUsertype(partyLicenseDTO.getCreateUsertype());
		
	}
	
	public void setEntityToDTO(PartyLicenseDTO partyLicenseDTO,PartyLicense partyLicense){
		partyLicenseDTO.setParty(partyLicense.getParty());
		partyLicenseDTO.setRegDate(partyLicense.getRegDate());
		partyLicenseDTO.setAppUser(partyLicense.getAppUser());
		partyLicenseDTO.setLicDate(partyLicense.getLicDate());
		partyLicenseDTO.setQty(partyLicense.getQty());
		partyLicenseDTO.setRegNo(partyLicense.getRegNo());
		partyLicenseDTO.setAppUser(partyLicense.getAppUser());
		partyLicenseDTO.setCreateDate(partyLicense.getCreateDate());
		partyLicenseDTO.setModifyDate(partyLicenseDTO.getModifyDate());
		partyLicenseDTO.setCreateUserId(partyLicense.getCreateUserId());
		partyLicenseDTO.setPartyLicenseId(partyLicense.getPartyLicenseId());
		partyLicenseDTO.setCreateUsername(partyLicense.getCreateUsername());
		partyLicenseDTO.setCreateUsertype(partyLicense.getCreateUsertype());

	}
	
	
	
}
