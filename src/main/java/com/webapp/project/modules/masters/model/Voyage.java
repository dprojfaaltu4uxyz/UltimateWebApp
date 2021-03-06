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
 * Voyagemaster generated by hbm2java
 */
@Entity
@Table(name = "voyagemaster", catalog = "websystique")
public class Voyage implements java.io.Serializable {

	private long voyagelId;
	private AppUser appUser;
	private String voyageCode;
	private String voyageDetails;
	private Date voyageDate;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;

	public Voyage() {
	}

	public Voyage(long voyagelId, Date modifiedDate) {
		this.voyagelId = voyagelId;
		this.modifiedDate = modifiedDate;
	}

	public Voyage(long voyagelId, AppUser appUser, String voyageCode, String voyageDetails, Date voyageDate,
			Date createDate, Date modifiedDate, Integer createUserId, String createUsername, String createUsertype) {
		this.voyagelId = voyagelId;
		this.appUser = appUser;
		this.voyageCode = voyageCode;
		this.voyageDetails = voyageDetails;
		this.voyageDate = voyageDate;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
	}

	@Id

	@Column(name = "voyagelId", unique = true, nullable = false)
	public long getVoyagelId() {
		return this.voyagelId;
	}

	public void setVoyagelId(long voyagelId) {
		this.voyagelId = voyagelId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@Column(name = "voyageCode", length = 65)
	public String getVoyageCode() {
		return this.voyageCode;
	}

	public void setVoyageCode(String voyageCode) {
		this.voyageCode = voyageCode;
	}

	@Column(name = "voyageDetails", length = 100)
	public String getVoyageDetails() {
		return this.voyageDetails;
	}

	public void setVoyageDetails(String voyageDetails) {
		this.voyageDetails = voyageDetails;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "voyage_date", length = 19)
	public Date getVoyageDate() {
		return this.voyageDate;
	}

	public void setVoyageDate(Date voyageDate) {
		this.voyageDate = voyageDate;
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
