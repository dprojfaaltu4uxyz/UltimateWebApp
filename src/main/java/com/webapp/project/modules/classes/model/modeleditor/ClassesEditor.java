package com.webapp.project.modules.classes.model.modeleditor;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.Map;

import com.webapp.project.modules.classes.model.Classes;
public class ClassesEditor extends PropertyEditorSupport{

	//This will be called when user HTTP Post to server a field bound to DepartmentVO
	public void setAsText(String id) 

	{
		Map<Integer,Classes> classesMap = new HashMap();
		classesMap.put(1,new Classes(1,  "Class one")); 
		classesMap.put(2,new Classes(2,  "Class two"));

		Classes d = null;
		if(id !=null || id != ""){

			if(classesMap.get(Integer.parseInt(id))!=null){
				d = classesMap.get(Integer.parseInt(id));
			}
			this.setValue(d);
		}
	}
}
