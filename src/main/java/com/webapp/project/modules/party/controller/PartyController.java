package com.webapp.project.modules.party.controller;

import java.util.HashMap;
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
import com.webapp.project.framework.util.ImportIECDataUtil;
import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.AgentDTO;
import com.webapp.project.modules.masters.model.City;
import com.webapp.project.modules.masters.model.State;
import com.webapp.project.modules.masters.service.CityService;
import com.webapp.project.modules.masters.service.StateService;
import com.webapp.project.modules.party.model.Party;
import com.webapp.project.modules.party.model.PartyDTO;
import com.webapp.project.modules.party.service.PartyService;

@Controller
public class PartyController {

	
	@Autowired
	PartyService partyService;
	
	@Autowired
	CityService cityService;
	
	@Autowired
	StateService stateService;
	
	private static final String USER_AGENT = "Mozilla/5.0";

	private static final String GET_URL = "http://localhost:9090/SpringMVCExample";

	private static final String POST_URL = "http://164.100.128.144:8100/dgft/IecPrint";

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/partylist" }, method = RequestMethod.GET)
	public String listParties(ModelMap model) {

		List<Party> parties = partyService.findAllParties();
		model.addAttribute("parties", parties);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/partyListJSP";
	}

	
	@RequestMapping(value = {"/newparty" }, method = RequestMethod.GET)
	public String loadAgent(ModelMap model) {
		Party party = new Party();
		PartyDTO partyDTO = new PartyDTO();
		
		List<City> cityList = cityService.findAllCities();
		
		List<State> stateList = stateService.findAllStates();
		
		model.addAttribute("stateList", stateList);
		model.addAttribute("cityList", cityList);
		model.addAttribute("loggedinuser", getPrincipal());
		model.addAttribute("party",partyDTO);
		return "masters/partyDetailsJSP";
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
	
	@RequestMapping(value={"/newparty"},method = RequestMethod.POST)
	public String SaveJobCard(@Valid PartyDTO partyDTO,BindingResult result,
			ModelMap model){
		
		Party party = new Party();
		if (result.hasErrors()) {
			
			List<City> cityList = cityService.findAllCities();
			
			List<State> stateList = stateService.findAllStates();
			
			model.addAttribute("stateList", stateList);
			model.addAttribute("cityList", cityList);
			model.addAttribute("party",partyDTO);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/partyDetailsJSP";
		}
		setDTOToEntity(partyDTO,party);
		//Teacher teacher = new Teacher();
		//System.out.println(party.getPortmasterByPortDischargeId());
		
		String status = partyService.saveParty(party);
		
		
		if(status.equalsIgnoreCase("success")){
			partyDTO = new PartyDTO();
			model.addAttribute("party", partyDTO);
			model.addAttribute("success", "Job " + party.getShortName() + " "+ party.getShortName() + " created successfully");
			partyDTO.setMessage("Job " + party.getShortName() + " "+ party.getShortName() + " created successfully");
		}else{
			partyDTO.setSelectedCityId(party.getCity().getCityId());
			partyDTO.setSelectedStateId(party.getState().getStateId());
			return "masters/partyDetailsJSP";
		}
		
		List<City> cityList = cityService.findAllCities();
		
		List<State> stateList = stateService.findAllStates();
		
		model.addAttribute("stateList", stateList);
		model.addAttribute("cityList", cityList);
		model.addAttribute("party", partyDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/partyDetailsJSP";
	}
	
	/**
	 * This method will provide the medium to update an existing party.
	 */
	@RequestMapping(value = { "/edit-party-{id}" }, method = RequestMethod.GET)
	public String editJobCard(@PathVariable Long id, ModelMap model) {
		Party party = partyService.findById(id);
		PartyDTO  partyDTO = new PartyDTO();
		setEntityToDTO(partyDTO, party); 
		partyDTO.setSelectedCityId(party.getCity().getCityId());
		partyDTO.setSelectedStateId(party.getState().getStateId());
		
		
		List<City> cityList = cityService.findAllCities();
		
		List<State> stateList = stateService.findAllStates();
		
		model.addAttribute("party", partyDTO);
		model.addAttribute("stateList", stateList);
		model.addAttribute("cityList", cityList);
		model.addAttribute("party", partyDTO);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/partyDetailsJSP";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-party-{id}" }, method = RequestMethod.POST)
	public String updateUser(@Valid PartyDTO partyDTO, BindingResult result,
			ModelMap model, @PathVariable Long id) {
		Party party = new Party();
		if (result.hasErrors()) {
			//party = jobcardService.findById(id);
			//partyDTO = new AgentDTO(party);
			partyDTO.setSelectedCityId(party.getCity().getCityId());
			partyDTO.setSelectedStateId(party.getState().getStateId());
			
			List<City> cityList = cityService.findAllCities();
			
			List<State> stateList = stateService.findAllStates();
			
			model.addAttribute("party", partyDTO);
			model.addAttribute("stateList", stateList);
			model.addAttribute("cityList", cityList);
			model.addAttribute("edit", true);
			model.addAttribute("loggedinuser", getPrincipal());
			return "masters/partyDetailsJSP";
		}

		/*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registrationJSP";
		}*/

		setDTOToEntity(partyDTO,party);
		String status = partyService.updateParty(party);
		
		if(status.equalsIgnoreCase("success")){
			partyDTO = new PartyDTO();
			model.addAttribute("party", partyDTO);
			model.addAttribute("success", "Job " + party.getShortName() + " "+ party.getShortName() + " created successfully");
			partyDTO.setMessage("Job " + party.getShortName() + " "+ party.getShortName() + " created successfully");
		}else{
			//partyDTO = new AgentDTO(party);
			partyDTO.setSelectedCityId(party.getCity().getCityId());
			partyDTO.setSelectedStateId(party.getState().getStateId());
			model.addAttribute("edit", true);
			return "masters/partyDetailsJSP";
		}
		
		List<City> cityList = cityService.findAllCities();
		
		List<State> stateList = stateService.findAllStates();
		model.addAttribute("cityList", cityList);
		model.addAttribute("stateList", stateList);
		model.addAttribute("party", partyDTO);
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "masters/partyDetailsJSP";
	}
	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/delete-party-{id}" }, method = RequestMethod.GET)
	public @ResponseBody String deleteUser(@PathVariable Long partyId) {
		Party party  = new Party();
		party.setPartyId(partyId);
		String status = partyService.deleteParty(party);
		if(status.equalsIgnoreCase("success")){
			return "Job deleted successfully";
		}else{
			return "Error - Cannot delete Job";
		}
		
	}
	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/getIECData" }, method = RequestMethod.POST)
	public @ResponseBody String deleteUser(@RequestParam("iecCodeNo") String iec,@RequestParam("partyName") String name) {
		HashMap<String, String> postParams = new HashMap<>();
		postParams.put("iec", iec);
		postParams.put("name", name);
		
		String response = ImportIECDataUtil.performPostCall(POST_URL,postParams);
		return response;
	}
	
	//Important links - https://stackoverflow.com/questions/1667854/copy-all-values-from-fields-in-one-class-to-another-through-reflection
	
	public void setDTOToEntity(PartyDTO partyDTO,Party party){
		party.setAccountPartyName(partyDTO.getAccountPartyName());
		party.setAppUser(partyDTO.getAppUser());
		party.setCreateDate(partyDTO.getCreateDate());
		party.setModifiedDate(partyDTO.getModifiedDate());
		party.setCreateUserId(partyDTO.getCreateUserId());
		party.setCreateUsername(partyDTO.getCreateUsername());
		party.setCreateUsertype(partyDTO.getCreateUsertype());

		party.setSalesPerson(partyDTO.getSalesPerson());
		//----------party
		party.setAccountPartyName(partyDTO.getAccountPartyName());
		party.setShortName(partyDTO.getShortName());
		party.setOpBalance(partyDTO.getOpBalance());
		party.setUnderGroup(partyDTO.getUnderGroup());
		party.setDebitCredit(partyDTO.getDebitCredit());
		party.setStrDirectory(partyDTO.getStrDirectory());
		party.setBankChequeReport(partyDTO.getBankChequeReport());
		party.setRewardDirectory(partyDTO.getRewardDirectory());
		party.setTextinput(partyDTO.getTextinput());
		party.setDeactivate(partyDTO.getDeactivate());
		party.setManifestReportName(partyDTO.getManifestReportName());
		party.setBinNo(partyDTO.getBinNo());
		party.setExporterHouse(partyDTO.getExporterHouse());
		party.setCertificateDate(partyDTO.getCertificateDate());
		party.setValidUptoDate(partyDTO.getValidUptoDate());
		party.setIfsCode(partyDTO.getIfsCode());
		party.setStExciseReg(partyDTO.getStExciseReg());
		party.setGstNo(party.getGstNo());
		party.setBranchSrNo(partyDTO.getBranchSrNo());
		party.setTotalBranch(partyDTO.getTotalBranch());
		party.setCity(partyDTO.getCity());
		party.setState(partyDTO.getState());
		party.setPinCode(partyDTO.getPinCode());
		party.setContactPerson(partyDTO.getContactPerson());
		party.setPhone(partyDTO.getPhone());
		party.setMobile(partyDTO.getMobile());
		party.setEmail(partyDTO.getEmail());
		party.setCommercialTaxRegState(partyDTO.getCommercialTaxRegState());
		party.setCommercialTaxType(partyDTO.getCommercialTaxType());
		party.setCommercialTaxRegNo(partyDTO.getCommercialTaxRegNo());
		party.setIecCode(partyDTO.getIecCode());
		party.setBranchSerialNo(partyDTO.getBranchSerialNo());
		party.setCommissionRate(partyDTO.getCommissionRate());
		party.setDivision(partyDTO.getDivision());
		party.setRange(partyDTO.getRange());
		party.setBranch(partyDTO.getBranch());
		party.setDrawBankAccountNo(partyDTO.getDrawBankAccountNo());
		party.setBankName(partyDTO.getBankName());
		party.setDrawBankAddress(partyDTO.getDrawBankAddress());
		party.setAddress(partyDTO.getAddress());
		party.setIecCodeNo(partyDTO.getIecCodeNo());
		party.setOrganization(partyDTO.getOrganization());
		party.setPanNo(partyDTO.getPanNo());
		party.setAccountNo(partyDTO.getAccountNo());
		party.setGrBankAdCode(partyDTO.getGrBankAdCode());
		party.setGrBankName(partyDTO.getGrBankName());
		party.setGrBankaddress(partyDTO.getGrBankaddress());
		party.setGrBankTotalBranch(partyDTO.getGrBankTotalBranch());
		party.setIecCodeThirdParty(partyDTO.getIecCodeThirdParty());
		party.setBranchSrNoThirdParty(partyDTO.getBranchSrNoThirdParty());
		party.setCommissionRateThirdParty(partyDTO.getCommissionRateThirdParty());
		party.setDivisionThirdParty(partyDTO.getDivisionThirdParty());
		party.setRangeThirdParty(partyDTO.getRangeThirdParty());
		party.setNameAddress(partyDTO.getNameAddress());
		party.setExporterClass(partyDTO.getExporterClass());
		party.setGrBank(partyDTO.getGrBank());
		
	}
	
	public void setEntityToDTO(PartyDTO partyDTO,Party party){
		partyDTO.setAccountPartyName(party.getAccountPartyName());
		partyDTO.setAppUser(party.getAppUser());
		partyDTO.setCreateDate(party.getCreateDate());
		partyDTO.setModifiedDate(party.getModifiedDate());
		partyDTO.setCreateUserId(party.getCreateUserId());
		partyDTO.setCreateUsername(party.getCreateUsername());
		partyDTO.setCreateUsertype(party.getCreateUsertype());

		partyDTO.setSalesPerson(partyDTO.getSalesPerson());
		//----------partyDTO
		partyDTO.setAccountPartyName(party.getAccountPartyName());
		partyDTO.setShortName(party.getShortName());
		partyDTO.setOpBalance(party.getOpBalance());
		partyDTO.setUnderGroup(party.getUnderGroup());
		partyDTO.setDebitCredit(party.getDebitCredit());
		partyDTO.setStrDirectory(party.getStrDirectory());
		partyDTO.setBankChequeReport(party.getBankChequeReport());
		partyDTO.setRewardDirectory(party.getRewardDirectory());
		partyDTO.setTextinput(party.getTextinput());
		partyDTO.setDeactivate(party.getDeactivate());
		partyDTO.setManifestReportName(party.getManifestReportName());
		partyDTO.setBinNo(party.getBinNo());
		partyDTO.setExporterHouse(party.getExporterHouse());
		partyDTO.setCertificateDate(party.getCertificateDate());
		partyDTO.setValidUptoDate(party.getValidUptoDate());
		partyDTO.setIfsCode(party.getIfsCode());
		partyDTO.setStExciseReg(party.getStExciseReg());
		partyDTO.setGstNo(party.getGstNo());
		partyDTO.setBranchSrNo(party.getBranchSrNo());
		partyDTO.setTotalBranch(party.getTotalBranch());
		partyDTO.setCity(party.getCity());
		partyDTO.setState(party.getState());
		partyDTO.setPinCode(party.getPinCode());
		partyDTO.setContactPerson(party.getContactPerson());
		partyDTO.setPhone(party.getPhone());
		partyDTO.setMobile(party.getMobile());
		partyDTO.setEmail(party.getEmail());
		partyDTO.setCommercialTaxRegState(party.getCommercialTaxRegState());
		partyDTO.setCommercialTaxType(party.getCommercialTaxType());
		partyDTO.setCommercialTaxRegNo(party.getCommercialTaxRegNo());
		partyDTO.setIecCode(party.getIecCode());
		partyDTO.setBranchSerialNo(party.getBranchSerialNo());
		partyDTO.setCommissionRate(party.getCommissionRate());
		partyDTO.setDivision(party.getDivision());
		partyDTO.setRange(party.getRange());
		partyDTO.setBranch(party.getBranch());
		partyDTO.setDrawBankAccountNo(party.getDrawBankAccountNo());
		partyDTO.setBankName(party.getBankName());
		partyDTO.setDrawBankAddress(party.getDrawBankAddress());
		partyDTO.setAddress(party.getAddress());
		partyDTO.setIecCodeNo(party.getIecCodeNo());
		partyDTO.setOrganization(party.getOrganization());
		partyDTO.setPanNo(party.getPanNo());
		partyDTO.setAccountNo(party.getAccountNo());
		partyDTO.setGrBankAdCode(party.getGrBankAdCode());
		partyDTO.setGrBankName(party.getGrBankName());
		partyDTO.setGrBankaddress(party.getGrBankaddress());
		partyDTO.setGrBankTotalBranch(party.getGrBankTotalBranch());
		partyDTO.setIecCodeThirdParty(party.getIecCodeThirdParty());
		partyDTO.setBranchSrNoThirdParty(party.getBranchSrNoThirdParty());
		partyDTO.setCommissionRateThirdParty(party.getCommissionRateThirdParty());
		partyDTO.setDivisionThirdParty(party.getDivisionThirdParty());
		partyDTO.setRangeThirdParty(party.getRangeThirdParty());
		partyDTO.setNameAddress(party.getNameAddress());
		partyDTO.setExporterClass(party.getExporterClass());
		partyDTO.setGrBank(party.getGrBank());
		
	}
	
	public void setDTOToEntityUsingGson(AgentDTO partyDTO, Agent party){
		Gson gson= new Gson();
		String tmp = gson.toJson(partyDTO);
		party = gson.fromJson(tmp,Agent.class);
	}
	
	public void setEntityToDTOUsingGson(AgentDTO partyDTO, Agent party){
		Gson gson= new Gson();
		String tmp = gson.toJson(party);
		partyDTO = gson.fromJson(tmp,AgentDTO.class);
	}
	
}
