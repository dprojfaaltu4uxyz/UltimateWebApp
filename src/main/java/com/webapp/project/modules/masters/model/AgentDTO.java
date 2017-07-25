package com.webapp.project.modules.masters.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.framework.model.BaseDTO;

public class AgentDTO extends BaseDTO{

	private long agentId;
	private AppUser appUser;
	@NotNull
	private Port port;
	
	@NotNull @Size(min=2) 
	private String agentName;
	private String address;
	@NotNull @Size(min=2) 
	private String agentCode;
	private String email;
	@NotNull @Size(min=7) 
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
	private Long selectedPortId;
	
	public AgentDTO() {
	}

	public AgentDTO(long agentId, String agentName, Date modifiedDate) {
		this.agentId = agentId;
		this.agentName = agentName;
		this.modifiedDate = modifiedDate;
	}
	public AgentDTO(long agentId, String agentName) {
		this.agentId = agentId;
		this.agentName = agentName;
	}
	public AgentDTO(long agentId, AppUser appUser, Port port, String agentName, String address,
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

	public AgentDTO(Agent agent) {
		this.agentId = agent.getAgentId();
		this.appUser = agent.getAppUser();
		this.port = agent.getPort();
		this.agentName = agent.getAgentName();
		this.address = agent.getAddress();
		this.agentCode = agent.getAgentCode();
		this.email = agent.getEmail();
		this.telephone = agent.getTelephone();
		this.fax = agent.getFax();
		this.contactPerson = agent.getContactPerson();
		this.contactNumber = agent.getContactNumber();
		this.active = agent.getActive();
		this.agentType = agent.getAgentType();
		this.createDate = agent.getCreateDate();
		this.modifiedDate = agent.getModifiedDate();
		this.createUserId = agent.getCreateUserId();
		this.createUsername = agent.getCreateUsername();
		this.createUsertype = agent.getCreateUsertype();
	}

	public long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(long agentId) {
		this.agentId = agentId;
	}

	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public Port getPort() {
		return this.port;
	}

	public void setPort(Port port) {
		this.port = port;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
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

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getAgentType() {
		return this.agentType;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
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

	public Long getSelectedPortId() {
		return selectedPortId;
	}

	public void setSelectedPortId(Long selectedPortId) {
		this.selectedPortId = selectedPortId;
	}
	
	
}
