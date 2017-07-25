package com.webapp.project.modules.classes.controller;

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
import com.webapp.project.modules.classes.repository.ClassesRepository;
import com.webapp.project.modules.classes.service.ClassesService;
import com.webapp.project.modules.teacher.model.Teacher;
import com.webapp.project.modules.teacher.model.modeleditor.TeacherEditor;
import com.webapp.project.modules.teacher.service.TeacherService;

@Controller
public class ClassesController {

	
	@Autowired
	ClassesService classesService;
	
	@Autowired
	ClassesRepository classesRepository;
	

	@Autowired
	TeacherService teacherService ;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Teacher.class, new TeacherEditor());
    }

	/**
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/classeslist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

		List<Classes> classes = classesService.findAllClasses();
		model.addAttribute("classes", classes);
		model.addAttribute("loggedinuser", getPrincipal());
		return "classes/classesListJSP";
	}

	
	@RequestMapping(value = {"/newclass" }, method = RequestMethod.GET)
	public String loadDashBoard(ModelMap model) {
		Classes classes = new Classes();
		
		/*Map< String, String > teacher = new HashMap<String, String>();  
		teacher.put("1", "Akshay");  
		teacher.put("2", "Gautam");  
        //phones.put("other", "OTHER"); 
*/		
		List<Teacher> teacherList = new ArrayList();
		teacherList = teacherService.findAllTeachers();
		
		model.addAttribute("loggedinuser", getPrincipal());
		model.addAttribute("classes", classes);
        model.addAttribute("teacherList", teacherList);
		return "classes/classesJSP";
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
	
	@RequestMapping(value={"/newclass"},method = RequestMethod.POST)
	public String SaveClass(@Valid Classes classes,BindingResult result,
			ModelMap model){
		
		if (result.hasErrors()) {
			/*Map< Integer, String > teacher = new HashMap<Integer, String>();  
			teacher.put(1, "Akshay");  
			teacher.put(2, "Gautam"); */ 
	        //phones.put("other", "OTHER"); c
			
			List<Teacher> teacherList = new ArrayList<Teacher>();
			teacherList = teacherService.findAllTeachers();
			
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("classes", classes);
	        model.addAttribute("teacherList", teacherList);
			return "classes/classesJSP";
		}
		
		//Teacher teacher = new Teacher();
		System.out.println(classes.getTeacher());
		classes.setTeacher(classes.getTeacher());
		
		classes.setCreateUserName(getPrincipal());
		classesService.saveClasses(classes);
		
		model.addAttribute("success", "Class " + classes.getClasses() + " added successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		
		
		//save in mongodb
		
		classesRepository.save(classes);
		
		
		return "registrationsuccessJSP";
	}
	
}
