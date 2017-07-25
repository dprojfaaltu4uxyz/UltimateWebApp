package com.webapp.project.modules.masters.model;
// Generated Jul 9, 2017 1:44:32 AM by Hibernate Tools 4.3.1.Final

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

/**
 * Citymaster generated by hbm2java
 */
@Entity
@Table(name = "citymaster", catalog = "websystique")
public class City implements java.io.Serializable {

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

	public City() {
	}

	public City(long cityId, Date modifiedDate) {
		this.cityId = cityId;
		this.modifiedDate = modifiedDate;
	}

	public City(long cityId, AppUser appUser, State state, String cityName, String cityCode,
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

	@Id

	@Column(name = "cityId", unique = true, nullable = false)
	public long getCityId() {
		return this.cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stateId")
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Column(name = "cityName", length = 100)
	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Column(name = "cityCode", length = 65)
	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_date", nullable = false, length = 19)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "create_userId")
	public Integer getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	@Column(name = "create_username", length = 65)
	public String getCreateUsername() {
		return this.createUsername;
	}

	public void setCreateUsername(String createUsername) {
		this.createUsername = createUsername;
	}

	@Column(name = "create_usertype", length = 20)
	public String getCreateUsertype() {
		return this.createUsertype;
	}

	public void setCreateUsertype(String createUsertype) {
		this.createUsertype = createUsertype;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<AirAgent> getAirAgents() {
		return this.airAgents;
	}

	public void setAirAgents(Set<AirAgent> airAgents) {
		this.airAgents = airAgents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "appUser")
	public Set<Vendor> getVendors() {
		return this.vendors;
	}

	public void setVendors(Set<Vendor> vendors) {
		this.vendors = vendors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}
