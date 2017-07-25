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
 * Vendorcreditdetailsmaster generated by hbm2java
 */
@Entity
@Table(name = "vendorcreditdetailsmaster", catalog = "websystique")
public class VendorCreditDetails implements java.io.Serializable {

	private long vendorcreditId;
	private AppUser appUser;
	private Vendor vendor;
	private String vendorcreditCode;
	private Integer creditDays;
	private Long creditlimits;
	private Date effectiveFrom;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;

	public VendorCreditDetails() {
	}

	public VendorCreditDetails(long vendorcreditId, Vendor vendor, Date modifiedDate) {
		this.vendorcreditId = vendorcreditId;
		this.vendor = vendor;
		this.modifiedDate = modifiedDate;
	}

	public VendorCreditDetails(long vendorcreditId, AppUser appUser, Vendor vendor,
			String vendorcreditCode, Integer creditDays, Long creditlimits, Date effectiveFrom, Date createDate,
			Date modifiedDate, Integer createUserId, String createUsername, String createUsertype) {
		this.vendorcreditId = vendorcreditId;
		this.appUser = appUser;
		this.vendor = vendor;
		this.vendorcreditCode = vendorcreditCode;
		this.creditDays = creditDays;
		this.creditlimits = creditlimits;
		this.effectiveFrom = effectiveFrom;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
	}

	@Id

	@Column(name = "vendorcreditId", unique = true, nullable = false)
	public long getVendorcreditId() {
		return this.vendorcreditId;
	}

	public void setVendorcreditId(long vendorcreditId) {
		this.vendorcreditId = vendorcreditId;
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
	@JoinColumn(name = "vendorId", nullable = false)
	public Vendor getVendor() {
		return this.vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	@Column(name = "vendorcreditCode", length = 65)
	public String getVendorcreditCode() {
		return this.vendorcreditCode;
	}

	public void setVendorcreditCode(String vendorcreditCode) {
		this.vendorcreditCode = vendorcreditCode;
	}

	@Column(name = "creditDays")
	public Integer getCreditDays() {
		return this.creditDays;
	}

	public void setCreditDays(Integer creditDays) {
		this.creditDays = creditDays;
	}

	@Column(name = "creditlimits", precision = 11, scale = 0)
	public Long getCreditlimits() {
		return this.creditlimits;
	}

	public void setCreditlimits(Long creditlimits) {
		this.creditlimits = creditlimits;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "effectiveFrom", length = 19)
	public Date getEffectiveFrom() {
		return this.effectiveFrom;
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
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