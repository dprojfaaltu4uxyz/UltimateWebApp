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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webapp.project.modules.classes.model.Classes;
import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.invoice.service.InvoiceService;
import com.webapp.project.modules.masters.model.Cha;
import com.webapp.project.modules.teacher.model.Teacher;
import com.webapp.project.modules.teacher.model.modeleditor.TeacherEditor;

@Controller
public class CHAController {

	
//	@Autowired
//	CHAService chaService;


	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/chalist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

//		List<Cha> chas = chaService.findAllChas();
//		model.addAttribute("chas", chas);
		model.addAttribute("loggedinuser", getPrincipal());
		return "invoice/classesListJSP";
	}

	
	@RequestMapping(value = {"/newcha" }, method = RequestMethod.GET)
	public String loadCHA(ModelMap model) {
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/chaJSP";
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
	
	@RequestMapping(value={"/newcha"},method = RequestMethod.POST)
	public String SaveClass(@Valid Classes classes,BindingResult result,
			ModelMap model){
		
		if (result.hasErrors()) {
			/*Map< Integer, String > teacher = new HashMap<Integer, String>();  
			teacher.put(1, "Akshay");  
			teacher.put(2, "Gautam"); */ 
	        //phones.put("other", "OTHER"); c
			
			List<Teacher> teacherList = new ArrayList();
			teacherList.add(new Teacher(3l, "Akshay"));
			teacherList.add(new Teacher(2l, "Gautam"));
			
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("classes", classes);
	        model.addAttribute("teacherList", teacherList);
			return "invoice/classesJSP";
		}
		
		//Teacher teacher = new Teacher();
		System.out.println(classes.getTeacher());
		classes.setTeacher(classes.getTeacher());
		
		classes.setCreateUserName(getPrincipal());
		//invoiceService.saveClasses(classes);
		
		model.addAttribute("success", "Class " + classes.getClasses() + " added successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "registrationsuccessJSP";
	}
	
}
