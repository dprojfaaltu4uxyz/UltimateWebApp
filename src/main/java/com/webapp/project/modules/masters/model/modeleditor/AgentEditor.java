package com.webapp.project.modules.masters.model.modeleditor;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.Map;

import com.webapp.project.modules.masters.model.Agent;

public class AgentEditor extends PropertyEditorSupport{

    //This will be called when user HTTP Post to server a field bound to DepartmentVO
    public void setAsText(String id) 
    {
    	Map<Integer,Agent> agentMap = new HashMap<>();
    	agentMap.put(5,new Agent(5,  "Anup"));
    	
    	Agent d = null;
        if(id !=null || id != ""){

			if(agentMap.get(Integer.parseInt(id))!=null){
				d = agentMap.get(Integer.parseInt(id));
			}
			this.setValue(d);
		}
    }
}
