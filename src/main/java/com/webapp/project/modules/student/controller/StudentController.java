package com.webapp.project.modules.student.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webapp.project.modules.student.model.Student;

@Controller
public class StudentController {

	@RequestMapping(value = {"/student" }, method = RequestMethod.GET)
	public String loadDashBoard(ModelMap model) {
		Student student = new Student();
		model.addAttribute("loggedinuser", getPrincipal());
		Map< String, String > gender = new HashMap<String, String>();  
		gender.put("male", "MALE");  
		gender.put("female", "FEMALE");  
        //phones.put("other", "OTHER");  
        model.addAttribute("genderList", gender);
        model.addAttribute("student", student);
		return "student/studentJSP";
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
	
}
