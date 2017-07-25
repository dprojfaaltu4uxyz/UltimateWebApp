package com.webapp.project.modules.expense.controller;

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
import com.webapp.project.modules.expense.model.Expense;
import com.webapp.project.modules.expense.service.ExpenseService;
import com.webapp.project.modules.teacher.model.Teacher;
import com.webapp.project.modules.teacher.model.modeleditor.TeacherEditor;

@Controller
public class ExpenseController {

	
	@Autowired
	ExpenseService expenseService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Teacher.class, new TeacherEditor());
    }

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/expenselist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

		List<Expense> expenses = expenseService.findAllExpense();
		model.addAttribute("expenses", expenses);
		model.addAttribute("loggedinuser", getPrincipal());
		return "expense/expenseListJSP";
	}

	
	@RequestMapping(value = {"/newexpense" }, method = RequestMethod.GET)
	public String loadDashBoard(ModelMap model) {
		Classes classes = new Classes();
		
		/*Map< String, String > teacher = new HashMap<String, String>();  
		teacher.put("1", "Akshay");  
		teacher.put("2", "Gautam");  
        //phones.put("other", "OTHER"); 
*/		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(new Teacher(3l, "Akshay"));
		teacherList.add(new Teacher(2l, "Gautam"));
		
		model.addAttribute("loggedinuser", getPrincipal());
		model.addAttribute("classes", classes);
        model.addAttribute("teacherList", teacherList);
		return "expense/expenseJSP";
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
	
	@RequestMapping(value={"/newexpense"},method = RequestMethod.POST)
	public String SaveClass(@Valid Expense expense,BindingResult result,
			ModelMap model){
		
		if (result.hasErrors()) {
			/*Map< Integer, String > teacher = new HashMap<Integer, String>();  
			teacher.put(1, "Akshay");  
			teacher.put(2, "Gautam"); */ 
	        //phones.put("other", "OTHER"); c
			
			List<Teacher> teacherList = new ArrayList<>();
			teacherList.add(new Teacher(3l, "Akshay"));
			teacherList.add(new Teacher(2l, "Gautam"));
			
			model.addAttribute("loggedinuser", getPrincipal());
			//model.addAttribute("expense", expense);
	        model.addAttribute("teacherList", teacherList);
			return "expense/expenseJSP";
		}
		
		/*//Teacher teacher = new Teacher();
		System.out.println(expense.getTeacher());
		expense.setTeacher(expense.getTeacher());
		*/
		//expense.setCreateUserName(getPrincipal());
		expenseService.saveExpense(expense);
		
		//model.addAttribute("success", "Class " + expense.getClasses() + " added successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "registrationsuccessJSP";
	}
	
}
