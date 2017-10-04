package com.webapp.project.modules.invoice.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webapp.project.modules.invoice.model.Person;
 
 
@Controller
public class SpringMVCController {
	
	@RequestMapping(value = "/PostFormDataJSONArray", method = RequestMethod.POST)
	public @ResponseBody Person PostFormDataJSONArray(@RequestBody Person person) {	
		
		return person;
	}
 
}