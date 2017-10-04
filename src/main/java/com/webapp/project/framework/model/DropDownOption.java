package com.webapp.project.framework.model;


public class DropDownOption {
	private String key;
	private String value;
	
	public DropDownOption(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public DropDownOption() {
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}