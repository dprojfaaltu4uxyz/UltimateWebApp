package com.webapp.project.modules.parent.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.framework.model.UserProfile;
import com.webapp.project.framework.service.UserProfileService;
import com.webapp.project.framework.service.UserService;
import com.webapp.project.modules.parent.model.Parent;
import com.webapp.project.modules.parent.service.ParentService;

@Controller
public class ParentController {

	@Autowired
	ParentService parentService;
	
	@Autowired
	MessageSource messageSource;
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserProfileService userProfileService;
	
	@RequestMapping(value = {"/parentlist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {
		List<Parent> parents = parentService.findAllParents();
		model.addAttribute("parents", parents);
		model.addAttribute("loggedinuser", getPrincipal());
		return "parent/parentListJSP";
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
	
	@RequestMapping(value = {"/newparent" }, method = RequestMethod.GET)
	public String loadDashBoard(ModelMap model) {
		Parent parent = new Parent();
		model.addAttribute("loggedinuser", getPrincipal());
		Map< String, String > gender = new HashMap<String, String>();  
		gender.put("male", "MALE");  
		gender.put("female", "FEMALE");  
        //phones.put("other", "OTHER");  
        model.addAttribute("genderList", gender);
        model.addAttribute("parent", parent);
		return "parent/parentJSP";
	}
	
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/newparent" }, method = RequestMethod.POST)
	public String saveParent(@Valid Parent parent, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			Map< String, String > gender = new HashMap<String, String>();  
			gender.put("male", "MALE");  
			gender.put("female", "FEMALE");  
	        //phones.put("other", "OTHER");  
	        model.addAttribute("genderList", gender);
			return "parent/parentJSP";
		}

		/*
		 * Preferred way to achieve uniqueness of field [sso] should be implementing custom @Unique annotation 
		 * and applying it on field [sso] of Model class [User].
		 * 
		 * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
		 * framework as well while still using internationalized messages.
		 * 
		 */
		
		if(!userService.isUserSSOUnique(parent.getParentId().intValue(), parent.getUsername())){
			FieldError ssoError =new FieldError("parent","ssoId",messageSource.getMessage("non.unique.userName", new String[]{parent.getUsername()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registration";
		}
		
		AppUser user = new AppUser();
		UserProfile userProfile = new UserProfile();
		Set<UserProfile> userProfiles = new HashSet<UserProfile>();
		user.setSsoId(parent.getUsername());
		user.setEmail(parent.getEmail());
		user.setPassword(parent.getPassword());
		user.setFirstName(parent.getFirstName());
		user.setLastName(parent.getLastName());
		user.setLastName(parent.getLastName());
		userProfile.setType("PARENT");
		userProfile.setId(6l);
		userProfiles.add(userProfile);
		user.setUserProfiles(userProfiles);
		
		String status = userService.saveParent(user);
		if(status.equalsIgnoreCase("SUCCESS")){
			parent.setAppUser(user);
			parent.setCreateUsername(getPrincipal());
			parentService.saveParent(parent);
		}
		model.addAttribute("success", "Parent " + parent.getUsername() + " added successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		//return "success";
		return "registrationsuccessJSP";
	}
	
}
