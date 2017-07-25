package com.webapp.project.modules.teacher.controller;

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
import com.webapp.project.modules.teacher.model.Teacher;
import com.webapp.project.modules.teacher.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	TeacherService teacherService;
	

	@Autowired
	MessageSource messageSource;

	@Autowired
	UserService userService;
	
	@Autowired
	UserProfileService userProfileService;
	
	/**
	 * This method will list all existing teachers.
	 */
	@RequestMapping(value = {"/teacherlist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

		List<Teacher> teachers = teacherService.findAllTeachers();
		model.addAttribute("teachers", teachers);
		model.addAttribute("loggedinuser", getPrincipal());
		return  "teacher/teacherListJSP";
	}

	
	
	@RequestMapping(value = {"/newteacher" }, method = RequestMethod.GET)
	public String loadDashBoard(ModelMap model) {
		Teacher teacher = new Teacher();
		model.addAttribute("loggedinuser", getPrincipal());
		Map< String, String > gender = new HashMap<String, String>();  
		gender.put("male", "MALE");  
		gender.put("female", "FEMALE");  
        //phones.put("other", "OTHER");  
        model.addAttribute("genderList", gender);
        model.addAttribute("teacher", teacher);
		return "teacher/teacherJSP";
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
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/newteacher" }, method = RequestMethod.POST)
	public String saveTeacher(@Valid Teacher teacher, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			Map< String, String > gender = new HashMap<String, String>();  
			gender.put("male", "MALE");  
			gender.put("female", "FEMALE");  
	        //phones.put("other", "OTHER");  
	        model.addAttribute("genderList", gender);
			return "teacher/teacherJSP";
		}

		/*
		 * Preferred way to achieve uniqueness of field [sso] should be implementing custom @Unique annotation 
		 * and applying it on field [sso] of Model class [User].
		 * 
		 * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
		 * framework as well while still using internationalized messages.
		 * 
		 */
		
		if(!userService.isUserSSOUnique(teacher.getTeacherId().intValue(), teacher.getUsername())){
			FieldError ssoError =new FieldError("teacher","ssoId",messageSource.getMessage("non.unique.userName", new String[]{teacher.getUsername()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registration";
		}
		
		AppUser user = new AppUser();
		UserProfile userProfile = new UserProfile();
		Set<UserProfile> userProfiles = new HashSet<UserProfile>();
		user.setSsoId(teacher.getUsername());
		user.setEmail(teacher.getEmail());
		user.setPassword(teacher.getPassword());
		user.setFirstName(teacher.getFirstName());
		user.setLastName(teacher.getLastName());
		user.setLastName(teacher.getLastName());
		userProfile.setType("TEACHER");
		userProfile.setId(4l);
		userProfiles.add(userProfile);
		user.setUserProfiles(userProfiles);
		
		String status = userService.saveTeacher(user);
		if(status.equalsIgnoreCase("SUCCESS")){
			teacher.setAppUser(user);
			teacher.setCreateUsername(getPrincipal());
			teacherService.saveTeacher(teacher);
		}
		model.addAttribute("success", "Teacher " + teacher.getUsername() + " added successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		//return "success";
		return "registrationsuccessJSP";
	}
	
}
