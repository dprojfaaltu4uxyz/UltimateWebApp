package com.webapp.project.framework.model;

import java.io.Serializable;

public enum UserProfileType implements Serializable{
	USER("USER"),
	DBA("DBA"),
	ADMIN("ADMIN"),
	TEACHER("TEACHER"),
	STUDENT("STUDENT"),
	PARENT("PARENT"),
	STAFF("STAFF");
	
	String userProfileType;
	
	private UserProfileType(String userProfileType){
		this.userProfileType = userProfileType;
	}
	
	public String getUserProfileType(){
		return userProfileType;
	}
	
}
