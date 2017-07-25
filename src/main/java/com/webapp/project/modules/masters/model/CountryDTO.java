package com.webapp.project.modules.masters.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.framework.model.BaseDTO;

public class CountryDTO extends BaseDTO{

	private long countryId;
	private String countryName;
	private String countryCode;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;
	private AppUser appUser;
	private Set<Customer> customers = new HashSet<Customer>(0);
	private Set<State> states = new HashSet<State>(0);

	public CountryDTO() {
	}

	public CountryDTO(long countryId, Date modifiedDate) {
		this.countryId = countryId;
		this.modifiedDate = modifiedDate;
	}

	public CountryDTO(long countryId, String countryName, String countryCode, Date createDate, Date modifiedDate,
			Integer createUserId, String createUsername, String createUsertype, Long userId,
			Set<Customer> customers,Set<State> states,AppUser appUser) {
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
		this.customers = customers;
		this.states = states;
		this.appUser = appUser;
	}
	

	public long getCountryId() {
		return this.countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Integer getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUsername() {
		return this.createUsername;
	}

	public void setCreateUsername(String createUsername) {
		this.createUsername = createUsername;
	}

	public String getCreateUsertype() {
		return this.createUsertype;
	}

	public void setCreateUsertype(String createUsertype) {
		this.createUsertype = createUsertype;
	}

	public Set<Customer> getCustomers() {
		return this.customers;
	}
	
	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	
	public Set<State> getStates() {
		return states;
	}

	public void setStates(Set<State> states) {
		this.states = states;
	}

}
