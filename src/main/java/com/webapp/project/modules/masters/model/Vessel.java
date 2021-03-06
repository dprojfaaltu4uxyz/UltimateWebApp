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
 * Vesselmaster generated by hbm2java
 */
@Entity
@Table(name = "vesselmaster", catalog = "websystique")
public class Vessel implements java.io.Serializable {

	private long vesselId;
	private AppUser appUser;
	private String vesselCode;
	private String imoDetails;
	private String vesselFlag;
	private String vesselAbbr;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;

	public Vessel() {
	}

	public Vessel(long vesselId, Date modifiedDate) {
		this.vesselId = vesselId;
		this.modifiedDate = modifiedDate;
	}

	public Vessel(long vesselId, AppUser appUser, String vesselCode, String imoDetails, String vesselFlag,
			String vesselAbbr, Date createDate, Date modifiedDate, Integer createUserId, String createUsername,
			String createUsertype) {
		this.vesselId = vesselId;
		this.appUser = appUser;
		this.vesselCode = vesselCode;
		this.imoDetails = imoDetails;
		this.vesselFlag = vesselFlag;
		this.vesselAbbr = vesselAbbr;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
	}

	@Id

	@Column(name = "vesselId", unique = true, nullable = false)
	public long getVesselId() {
		return this.vesselId;
	}

	public void setVesselId(long vesselId) {
		this.vesselId = vesselId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@Column(name = "vesselCode", length = 65)
	public String getVesselCode() {
		return this.vesselCode;
	}

	public void setVesselCode(String vesselCode) {
		this.vesselCode = vesselCode;
	}

	@Column(name = "imoDetails", length = 100)
	public String getImoDetails() {
		return this.imoDetails;
	}

	public void setImoDetails(String imoDetails) {
		this.imoDetails = imoDetails;
	}

	@Column(name = "vesselFlag", length = 65)
	public String getVesselFlag() {
		return this.vesselFlag;
	}

	public void setVesselFlag(String vesselFlag) {
		this.vesselFlag = vesselFlag;
	}

	@Column(name = "vesselAbbr", length = 65)
	public String getVesselAbbr() {
		return this.vesselAbbr;
	}

	public void setVesselAbbr(String vesselAbbr) {
		this.vesselAbbr = vesselAbbr;
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
