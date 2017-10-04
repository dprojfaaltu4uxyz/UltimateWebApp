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

public class CityDTO extends BaseDTO{

	private long cityId;
	private AppUser appUser;
	private State state;
	private String cityName;
	private String cityCode;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;
	private Set<AirAgent> airAgents = new HashSet<AirAgent>(0);
	private Set<Vendor> vendors = new HashSet<Vendor>(0);
	private Set<Customer> customers = new HashSet<Customer>(0);
	private Long selectedStateId;
	private Integer active;

	public CityDTO() {
	}

	public CityDTO(long cityId, Date modifiedDate) {
		this.cityId = cityId;
		this.modifiedDate = modifiedDate;
	}

	public CityDTO(long cityId, AppUser appUser, State state, String cityName, String cityCode,
			Date createDate, Date modifiedDate, Integer createUserId, String createUsername, String createUsertype,
			Set<AirAgent> airAgents, Set<Vendor> vendormasters, Set<Customer> customermasters) {
		this.cityId = cityId;
		this.appUser = appUser;
		this.state = state;
		this.cityName = cityName;
		this.cityCode = cityCode;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
		this.airAgents = airAgents;
		this.vendors = vendors;
		this.customers = customers;
	}

	public long getCityId() {
		return this.cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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

	public Set<AirAgent> getAirAgents() {
		return this.airAgents;
	}

	public void setAirAgents(Set<AirAgent> airAgents) {
		this.airAgents = airAgents;
	}

	public Set<Vendor> getVendors() {
		return this.vendors;
	}

	public void setVendors(Set<Vendor> vendors) {
		this.vendors = vendors;
	}

	public Set<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public Long getSelectedStateId() {
		return selectedStateId;
	}

	public void setSelectedStateId(Long selectedStateId) {
		this.selectedStateId = selectedStateId;
	}
	
	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

}
