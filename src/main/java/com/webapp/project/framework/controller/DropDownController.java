package com.webapp.project.framework.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.webapp.project.framework.model.DropDownOption;
import com.webapp.project.framework.service.DropDownService;
import com.webapp.project.modules.masters.model.Currency;

@Controller
@RequestMapping(value = "/dropdown")
public class DropDownController {

	@Autowired
	private DropDownService dropDownService;

	@RequestMapping(value = "/{entity}/get.action", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getDropdownList(
			@PathVariable("entity") String entity, HttpServletRequest request)
					throws ServletRequestBindingException {

		String filter = "";
		String firstParam = "";
		String secondParam = "";
		String thirdParam = "";

		// Get name and value property from request
		String nameProp = ServletRequestUtils.getRequiredStringParameter(
					request, "nameProp");
		String valueProp = ServletRequestUtils.getRequiredStringParameter(
					request, "valueProp");
		if(ServletRequestUtils.getStringParameter(request,
				"filter") != null){
			filter = ServletRequestUtils.getRequiredStringParameter(
					request, "filter");
		}
		if(ServletRequestUtils.getStringParameter(request,
				"firstParam") != null){
			firstParam = ServletRequestUtils.getRequiredStringParameter(
					request, "firstParam");
		}
		if(ServletRequestUtils.getStringParameter(request,
				"search") != null){
			firstParam = ServletRequestUtils.getRequiredStringParameter(
					request, "search");
		}
		System.out.println(request.getParameter("search"));
		if(ServletRequestUtils.getStringParameter(request,
				"secondParam") != null){
			secondParam = ServletRequestUtils.getRequiredStringParameter(
					request, "secondParam");
		}
		if(ServletRequestUtils.getStringParameter(request,
				"thirdParam") != null){
			thirdParam = ServletRequestUtils.getRequiredStringParameter(
					request, "thirdParam");
		}

		List<DropDownOption> downOptions = dropDownService.getOptions(entity, nameProp, valueProp, filter,firstParam,secondParam,thirdParam);
		JsonObject json_response=new JsonObject();
		JsonArray data_json=new JsonArray();
		for (DropDownOption option : downOptions) {
			JsonObject json = new JsonObject();
			json.addProperty("key", option.getKey());
			json.addProperty("value", option.getValue());
			data_json.add(json);
		}
		//json_response.add("aaData", data_json);
		
		return data_json.toString();


	}
}
