package com.webapp.project.modules.section.controller;

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
import com.webapp.project.modules.classes.model.modeleditor.ClassesEditor;
import com.webapp.project.modules.classes.service.ClassesService;
import com.webapp.project.modules.section.model.Section;
import com.webapp.project.modules.section.service.SectionService;
import com.webapp.project.modules.teacher.model.Teacher;
import com.webapp.project.modules.teacher.model.modeleditor.TeacherEditor;
import com.webapp.project.modules.teacher.service.TeacherService;

@Controller
public class SectionController {

	@Autowired
	SectionService sectionService;
	

	@Autowired
	TeacherService teacherService ;
	
	@Autowired
	ClassesService classesService ;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        
        binder.registerCustomEditor(Classes.class, new ClassesEditor());
        binder.registerCustomEditor(Teacher.class, new TeacherEditor());
    }

	
	@RequestMapping(value = {"/section" }, method = RequestMethod.GET)
	public String loadDashBoard(ModelMap model) {

		Section section = new Section();
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList = teacherService.findAllTeachers();
		/*teacherList.add(new Teacher(3, "Akshay"));
		teacherList.add(new Teacher(2, "Gautam"));*/
		
		List<Classes> classsesList = new ArrayList<>();
		classsesList = classesService.findAllClasses();
		/*classsesList.add(new Classes(1, "Class one"));
		classsesList.add(new Classes(2, "Class two"));*/
		
		model.addAttribute("loggedinuser", getPrincipal());
		model.addAttribute("teacherList", teacherList);
		model.addAttribute("classesList", classsesList);
		model.addAttribute("section", section);
		return "section/sectionJSP";
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
	 * This method will list all existing classes.
	 */
	@RequestMapping(value = {"/sectionlist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

		List<Section> sections = sectionService.findAllSection();
		model.addAttribute("sections", sections);
		model.addAttribute("loggedinuser", getPrincipal());
		return "section/sectionListJSP";
	}

	@RequestMapping(value={"/section"},method = RequestMethod.POST)
	public String SaveClass(@Valid Section section,BindingResult result,
			ModelMap model){
		
		if (result.hasErrors()) {
			/*Map< Integer, String > teacher = new HashMap<Integer, String>();  
			teacher.put(1, "Akshay");  
			teacher.put(2, "Gautam"); */ 
	        //phones.put("other", "OTHER"); c
			
			List<Teacher> teacherList = new ArrayList<>();
			teacherList = teacherService.findAllTeachers();
			

			List<Classes> classsesList = new ArrayList<>();
			classsesList = classesService.findAllClasses();
			
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("classsesList", classsesList);
	        model.addAttribute("teacherList", teacherList);
			return "section/sectionJSP";
		}
		
		//Teacher teacher = new Teacher();
		System.out.println(section.getTeacher());
		section.setTeacher(section.getTeacher());
		section.setClasses(section.getClasses());
		
		section.setCreateUsername(getPrincipal());
		sectionService.saveSection(section);
		
		model.addAttribute("success", "Class " + section.getClasses() + " added successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "registrationsuccessJSP";
	}
	
}
