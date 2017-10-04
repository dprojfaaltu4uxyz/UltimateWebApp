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
import com.webapp.project.modules.teacher.model.Teacher;
import com.webapp.project.modules.teacher.model.modeleditor.TeacherEditor;

@Controller
public class VendorController {

	
	@Autowired
	InvoiceService invoiceService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Teacher.class, new TeacherEditor());
    }

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/vendorlist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

//		List<Invoice> invoices = invoiceService.findAllInvoice();
//		model.addAttribute("invoices", invoices);
//		model.addAttribute("loggedinuser", getPrincipal());
		return "invoice/classesListJSP";
	}

	
	@RequestMapping(value = {"/newvendor" }, method = RequestMethod.GET)
	public String loadVendor(ModelMap model) {
		model.addAttribute("loggedinuser", getPrincipal());
		return "masters/vendorJSP";
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
	
	@RequestMapping(value={"/newvendor"},method = RequestMethod.POST)
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
