package com.webapp.project.modules.masters.model;
// Generated Jul 9, 2017 1:44:32 AM by Hibernate Tools 4.3.1.Final

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

/**
 * Agentmaster generated by hbm2java
 */
@Entity
@Table(name = "agentmaster", catalog = "websystique")
public class Agent implements java.io.Serializable {

	private long agentId;
	private AppUser appUser;
	private Port port;
	private String agentName;
	private String address;
	private String agentCode;
	private String email;
	private String telephone;
	private String fax;
	private String contactPerson;
	private String contactNumber;
	private Integer active;
	private String agentType;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;

	public Agent() {
	}

	public Agent(long agentId, String agentName, Date modifiedDate) {
		this.agentId = agentId;
		this.agentName = agentName;
		this.modifiedDate = modifiedDate;
	}
	public Agent(long agentId, String agentName) {
		this.agentId = agentId;
		this.agentName = agentName;
	}
	public Agent(long agentId, AppUser appUser, Port port, String agentName, String address,
			String agentCode, String email, String telephone, String fax, String contactPerson, String contactNumber,
			Integer active, String agentType, Date createDate, Date modifiedDate, Integer createUserId,
			String createUsername, String createUsertype) {
		this.agentId = agentId;
		this.appUser = appUser;
		this.port = port;
		this.agentName = agentName;
		this.address = address;
		this.agentCode = agentCode;
		this.email = email;
		this.telephone = telephone;
		this.fax = fax;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.active = active;
		this.agentType = agentType;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
	}

	@Id

	@Column(name = "agentId", unique = true, nullable = false)
	public long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(long agentId) {
		this.agentId = agentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "portId")
	public Port getPort() {
		return this.port;
	}

	public void setPort(Port port) {
		this.port = port;
	}

	@Column(name = "agentName", nullable = false, length = 100)
	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Column(name = "Address", length = 355)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "agentCode", length = 65)
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "telephone", length = 20)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "fax", length = 20)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "contactperson", length = 100)
	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Column(name = "contactnumber", length = 20)
	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "active")
	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Column(name = "agentType", length = 65)
	public String getAgentType() {
		return this.agentType;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
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

}
