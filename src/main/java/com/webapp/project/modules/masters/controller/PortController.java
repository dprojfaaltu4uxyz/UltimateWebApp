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
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webapp.project.modules.masters.model.Port;
import com.webapp.project.modules.masters.service.PortService;

@Controller
public class PortController {

	
	@Autowired
	PortService portService;
	
	/*@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Port.class, new PortEditor());
    }*/

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/portlist" }, method = RequestMethod.GET)
	public String listPorts(ModelMap model) {

		List<Port> ports = portService.findAllPorts();
		model.addAttribute("ports", ports);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/portListJSP";
	}

	
	@RequestMapping(value = {"/newports" }, method = RequestMethod.GET)
	public String loadPort(ModelMap model) {
		Port port = new Port();
		model.addAttribute("port", port);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/portJSP";
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
	
	@RequestMapping(value={"/newport"},method = RequestMethod.POST)
	public String SavePort(@Valid Port port,BindingResult result,
			ModelMap model){
		
		if (result.hasErrors()) {
			/*Map< Integer, String > teacher = new HashMap<Integer, String>();  
			teacher.put(1, "Akshay");  
			teacher.put(2, "Gautam"); */ 
	        //phones.put("other", "OTHER"); c
			
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("port", port);
			return "masters/portJSP";
		}
		
		//Teacher teacher = new Teacher();
		System.out.println(port.getPortName());
		
		portService.savePort(port);
		
		model.addAttribute("success", "Port " + port.getPortName() + " added successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "masters/portListJSP";
	}
	
	/**
	 * This method will provide the medium to update an existing port.
	 */
	@RequestMapping(value = { "/edit-port-{id}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable Long id, ModelMap model) {
		Port port = portService.findById(id);
		model.addAttribute("port", port);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/portJSP";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-port-{id}" }, method = RequestMethod.POST)
	public String updateUser(@Valid Port port, BindingResult result,
			ModelMap model, @PathVariable Long id) {

		if (result.hasErrors()) {
			return "portJSP";
		}

		/*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registrationJSP";
		}*/


		portService.updatePort(port);

		model.addAttribute("success", "Port " + port.getPortName() + " "+ port.getPortCode() + " updated successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/portListJSP";
	}
	
}
