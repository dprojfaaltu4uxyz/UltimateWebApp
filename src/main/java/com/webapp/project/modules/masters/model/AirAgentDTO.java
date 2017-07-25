package com.webapp.project.modules.masters.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.webapp.project.framework.model.AppUser;

public class AirAgentDTO {

	private long airagentId;
	private AppUser appUser;
	private City city;
	private String airagentName;
	private String address;
	private String airagentCode;
	private String email;
	private String telephone;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;

	public AirAgentDTO() {
	}

	public AirAgentDTO(long airagentId, Date modifiedDate) {
		this.airagentId = airagentId;
		this.modifiedDate = modifiedDate;
	}

	public AirAgentDTO(long airagentId, AppUser appUser, City city, String airagentName, String address,
			String airagentCode, String email, String telephone, Date createDate, Date modifiedDate,
			Integer createUserId, String createUsername, String createUsertype) {
		this.airagentId = airagentId;
		this.appUser = appUser;
		this.city = city;
		this.airagentName = airagentName;
		this.address = address;
		this.airagentCode = airagentCode;
		this.email = email;
		this.telephone = telephone;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
	}

	public long getAiragentId() {
		return this.airagentId;
	}

	public void setAiragentId(long airagentId) {
		this.airagentId = airagentId;
	}

	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Column(name = "airagentName", length = 100)
	public String getAiragentName() {
		return this.airagentName;
	}

	public void setAiragentName(String airagentName) {
		this.airagentName = airagentName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAiragentCode() {
		return this.airagentCode;
	}

	public void setAiragentCode(String airagentCode) {
		this.airagentCode = airagentCode;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

}
