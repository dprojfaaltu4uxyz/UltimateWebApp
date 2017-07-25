package com.webapp.project.modules.paymenthistory.controller;

import org.springframework.stereotype.Controller;

@Controller
public class PaymentHistoryController {/*

	
	@Autowired
	ClassesService classesService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Teacher.class, new TeacherEditor());
    }

	*//**
	 * This method will list all existing classes.
	 *//*
	@RequestMapping(value = {"/classeslist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

		List<Classes> classes = classesService.findAllClasses();
		model.addAttribute("classes", classes);
		model.addAttribute("loggedinuser", getPrincipal());
		return "classesListJSP";
	}

	
	@RequestMapping(value = {"/newclass" }, method = RequestMethod.GET)
	public String loadDashBoard(ModelMap model) {
		Classes classes = new Classes();
		
		Map< String, String > teacher = new HashMap<String, String>();  
		teacher.put("1", "Akshay");  
		teacher.put("2", "Gautam");  
        //phones.put("other", "OTHER"); 
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(new Teacher(3, "Akshay"));
		teacherList.add(new Teacher(2, "Gautam"));
		
		model.addAttribute("loggedinuser", getPrincipal());
		model.addAttribute("classes", classes);
        model.addAttribute("teacherList", teacherList);
		return "classesJSP";
	}
	
	
	*//**
	 * This method returns the principal[user-name] of logged-in user.
	 *//*
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
			Map< Integer, String > teacher = new HashMap<Integer, String>();  
			teacher.put(1, "Akshay");  
			teacher.put(2, "Gautam");  
	        //phones.put("other", "OTHER"); c
			
			List<Teacher> teacherList = new ArrayList<>();
			teacherList.add(new Teacher(3, "Akshay"));
			teacherList.add(new Teacher(2, "Gautam"));
			
			model.addAttribute("loggedinuser", getPrincipal());
			model.addAttribute("classes", classes);
	        model.addAttribute("teacherList", teacherList);
			return "classesJSP";
		}
		
		//Teacher teacher = new Teacher();
		System.out.println(classes.getTeacher());
		classes.setTeacher(classes.getTeacher());
		
		classes.setCreateUserName(getPrincipal());
		classesService.saveClasses(classes);
		
		model.addAttribute("success", "Class " + classes.getClasses() + " added successfully");
		model.addAttribute("loggedinuser", getPrincipal());
		
		return "registrationsuccessJSP";
	}
	
*/}
