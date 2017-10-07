package com.webapp.project.modules.invoice.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webapp.project.modules.classes.model.Classes;
import com.webapp.project.modules.invoice.model.Invoice;
import com.webapp.project.modules.invoice.model.InvoiceVoucher;
import com.webapp.project.modules.invoice.service.InvoiceService;
import com.webapp.project.modules.teacher.model.Teacher;
import com.webapp.project.modules.teacher.model.modeleditor.TeacherEditor;

@Controller
public class InvoiceController {

	
	@Autowired
	InvoiceService invoiceService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Teacher.class, new TeacherEditor());
    }

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/invoicelist" }, method = RequestMethod.GET)
	public@ResponseBody List<InvoiceVoucher> invoicelist(ModelMap model) {

		List<InvoiceVoucher> invoices = invoiceService.findAllInvoice();		 
		model.addAttribute("invoices", invoices);
		model.addAttribute("loggedinuser", getPrincipal());		
		return invoices;
	}
	@RequestMapping(value = {"/newInvws" }, method = RequestMethod.GET)
	public String newInv(ModelMap model) {		
		return "invoice/invoiceJSP";
	}
	 @RequestMapping(value="/saveInv")	
	public @ResponseBody Long saveInv(@RequestBody InvoiceVoucher invoiceVoucher) throws ParseException {
		//System.out.println(data);		
		 Long invId = invoiceService.saveInvoice(invoiceVoucher);
		return invId;
	}
	
	@RequestMapping(value = "/updateInv")	
	public @ResponseBody long updateInv(@RequestBody InvoiceVoucher invoiceVoucher) {
		//System.out.println(data);
		String a= "test";
		invoiceService.updateInvoice(invoiceVoucher);
		return invoiceVoucher.getInvId();
	}
	
	@RequestMapping(value = "/deleteInv")	
	public @ResponseBody long deleteInv(@RequestBody InvoiceVoucher[] invoiceVoucher) {
		//System.out.println(data);
		String a= "test";
		invoiceService.deleteInv(invoiceVoucher);
		return 0;
	}
	
	@RequestMapping(value = {"/newinvoice" }, method = RequestMethod.GET)
	public String loadDashBoard(ModelMap model) {
		Classes classes = new Classes();
		
		/*Map< String, String > teacher = new HashMap<String, String>();  
		teacher.put("1", "Akshay");  
		teacher.put("2", "Gautam");  
        //phones.put("other", "OTHER"); 
*/		
		List<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList.add(new Teacher(3l, "Akshay"));
		teacherList.add(new Teacher(2l, "Gautam"));
		
		model.addAttribute("loggedinuser", getPrincipal());
		model.addAttribute("classes", classes);
        model.addAttribute("teacherList", teacherList);
		return "invoice/classesJSP";
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
	
	/*@RequestMapping(value={"/newinvoice"},method = RequestMethod.POST)
	public String SaveClass(@Valid Classes classes,BindingResult result,
			ModelMap model){
		
		if (result.hasErrors()) {
			Map< Integer, String > teacher = new HashMap<Integer, String>();  
			teacher.put(1, "Akshay");  
			teacher.put(2, "Gautam");  
	        //phones.put("other", "OTHER"); c
			
			List<Teacher> teacherList = new ArrayList<>();
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
	}*/
	
}
