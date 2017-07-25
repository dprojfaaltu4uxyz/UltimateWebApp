package com.webapp.project.modules.masters.model.modeleditor;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.webapp.project.modules.masters.model.Agent;
import com.webapp.project.modules.masters.model.Port;
import com.webapp.project.modules.masters.service.PortService;

public class PortEditor extends PropertyEditorSupport{

	@Autowired
	PortService portService;
	
    //This will be called when user HTTP Post to server a field bound to DepartmentVO
	//important links - https://stackoverflow.com/questions/13480694/dropdown-value-binding-in-spring-mvc
	//http://forum.spring.io/forum/spring-projects/web/24541-step-by-step-guide-using-form-tag-listbox-with-property-editors
	//http://howtodoinjava.com/spring/spring-mvc/spring-mvc-populate-and-validate-dropdown-example/
	
    public void setAsText(String id) 
    {
    	Map<Integer,Port> portMap = new HashMap<>();
    	
    	
    	Port d = null;
        if(id !=null || id != ""){

			if(portMap.get(Integer.parseInt(id))!=null){
				d = portMap.get(Integer.parseInt(id));
			}
			this.setValue(d);
		}
    }
}
