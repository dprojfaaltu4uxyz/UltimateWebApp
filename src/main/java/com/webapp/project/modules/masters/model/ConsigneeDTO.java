package com.webapp.project.modules.masters.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.framework.model.BaseDTO;
import com.webapp.project.modules.jobcard.model.Jobcard;

public class ConsigneeDTO extends BaseDTO{

	private Long consigneeId;
	private AppUser appUser;
	private String name;
	private String code;
	private String notifyParty1;
	private String notifyParty2;
	private String buyer;
	private String addressOne;
	private String addressTwo;
	private String addressThree;
	private String details;
	private Date createDate;
	private Date modifyDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;
	private int teacheractive;
	private Set<Jobcard> jobcards = new HashSet<Jobcard>(0);
	private City city;
	private String phone;
	private Country country;
	private Integer active;
	private Long selectedCountryId;
	private Long selectedCityId;

	public ConsigneeDTO() {
	}

	public Long getConsigneeId() {
		return consigneeId;
	}

	public void setConsigneeId(Long consigneeId) {
		this.consigneeId = consigneeId;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNotifyParty1() {
		return notifyParty1;
	}

	public void setNotifyParty1(String notifyParty1) {
		this.notifyParty1 = notifyParty1;
	}

	public String getNotifyParty2() {
		return notifyParty2;
	}

	public void setNotifyParty2(String notifyParty2) {
		this.notifyParty2 = notifyParty2;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getAddressOne() {
		return addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public String getAddressThree() {
		return addressThree;
	}

	public void setAddressThree(String addressThree) {
		this.addressThree = addressThree;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUsername() {
		return createUsername;
	}

	public void setCreateUsername(String createUsername) {
		this.createUsername = createUsername;
	}

	public String getCreateUsertype() {
		return createUsertype;
	}

	public void setCreateUsertype(String createUsertype) {
		this.createUsertype = createUsertype;
	}

	public int getTeacheractive() {
		return teacheractive;
	}

	public void setTeacheractive(int teacheractive) {
		this.teacheractive = teacheractive;
	}

	public Set<Jobcard> getJobcards() {
		return jobcards;
	}

	public void setJobcards(Set<Jobcard> jobcards) {
		this.jobcards = jobcards;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	public Integer getActive() {
		return this.active;
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

	public Long getSelectedCityId() {
		return selectedCityId;
	}

	public void setSelectedCityId(Long selectedCityId) {
		this.selectedCityId = selectedCityId;
	}
	
	
}
