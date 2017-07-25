package com.webapp.project.modules.teacher.model.modeleditor;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.Map;

import com.webapp.project.modules.teacher.model.Teacher;

public class TeacherEditor extends PropertyEditorSupport{

    //This will be called when user HTTP Post to server a field bound to DepartmentVO
    public void setAsText(String id) 
    {
    	Map<Integer,Teacher> teacherMap = new HashMap();
    	teacherMap.put(5,new Teacher(5l,  "Anup"));
    	
        Teacher d = null;
        if(id !=null || id != ""){

			if(teacherMap.get(Integer.parseInt(id))!=null){
				d = teacherMap.get(Integer.parseInt(id));
			}
			this.setValue(d);
		}
    }
}
