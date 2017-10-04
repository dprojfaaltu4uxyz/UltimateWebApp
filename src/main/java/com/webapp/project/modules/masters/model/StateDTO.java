package com.webapp.project.modules.masters.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.framework.model.BaseDTO;

public class StateDTO extends BaseDTO{

	private long stateId;
	private AppUser appUser;
	private String stateName;
	private String stateCode;
	private Country country;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;
	private Set<City> cities = new HashSet<City>(0);
	private Integer active;
	private Long selectedCountryId;

	public StateDTO() {
	}

	public StateDTO(long stateId, Date modifiedDate) {
		this.stateId = stateId;
		this.modifiedDate = modifiedDate;
	}

	public StateDTO(long stateId, AppUser appUser, String stateName, String stateCode, Country country,
			Date createDate, Date modifiedDate, Integer createUserId, String createUsername, String createUsertype,
			Set<City> cities) {
		this.stateId = stateId;
		this.appUser = appUser;
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.country = country;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
		this.cities = cities;
	}

	public long getStateId() {
		return this.stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
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

	public Set<City> getCities() {
		return this.cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Long getSelectedCountryId() {
		return selectedCountryId;
	}

	public void setSelectedCountryId(Long selectedCountryId) {
		this.selectedCountryId = selectedCountryId;
	}

	
}
