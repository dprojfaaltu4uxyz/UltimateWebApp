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
import com.webapp.project.framework.model.BaseDTO;

public class JobcardDTO extends BaseDTO{

	private long jobId;
	private AppUser appUser;
	private CargoType cargoType;
	private Consignee consignee;
	private ContainerType containerType;
	private Currency currency;
	private Customer customer;
	private Port portmasterByPortDischargeId;
	private Port portmasterByPortLoadingId;
	private String jobCode;
	private String jobDetails;
	private String jobNo;
	private String quantityType;
	private Long quantity;
	private Long invoiceValue;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;

	private String bookingId;
	private Date bookingDate;
	private String bookingParty;
	private Date expectedShipmentDate;
	private String salesPerson;
	private String broker;
	private String shipper;
	private Port portOfOriginId;
	private String shippingLineBookingNo;
	private String FreightTerms;
	private String FinalPlaceOfDelivery;
	private String containerPickupPoint;
	private String emptyContainerLocation;
	private Date containerPickupDate;
	private String cargoReady;
	private Date DocsCutOffDate;
	private Date ACDCutOffDate;
	private Date etd;	
	private Long selectedPortId;
	private Long selectedContainerTypeId;
	private Long selectedCargoTypeId;
	private Long selectedCurrencyId;
	private Long selectedCustomerId;
	private Long selectedConsigneeId;
	
	
	public JobcardDTO() {
	}

	public JobcardDTO(long jobId, Date modifiedDate) {
		this.jobId = jobId;
		this.modifiedDate = modifiedDate;
	}

	public JobcardDTO(long jobId, AppUser appUser, CargoType cargoType, Consignee consignee,
			ContainerType containerType, Currency currency, Customer customer,
			Port portmasterByPortDischargeId, Port portmasterByPortLoadingId, String jobCode,
			String jobDetails, String jobNo, String quantityType, Long quantity, Long invoiceValue, Date createDate,
			Date modifiedDate, Integer createUserId, String createUsername, String createUsertype) {
		this.jobId = jobId;
		this.appUser = appUser;
		this.cargoType = cargoType;
		this.consignee = consignee;
		this.containerType = containerType;
		this.currency = currency;
		this.customer = customer;
		this.portmasterByPortDischargeId = portmasterByPortDischargeId;
		this.portmasterByPortLoadingId = portmasterByPortLoadingId;
		this.jobCode = jobCode;
		this.jobDetails = jobDetails;
		this.jobNo = jobNo;
		this.quantityType = quantityType;
		this.quantity = quantity;
		this.invoiceValue = invoiceValue;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
	}

	public long getJobId() {
		return this.jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public CargoType getCargoType() {
		return this.cargoType;
	}

	public void setCargoType(CargoType cargoType) {
		this.cargoType = cargoType;
	}

	public Consignee getConsignee() {
		return this.consignee;
	}

	public void setConsignee(Consignee consignee) {
		this.consignee = consignee;
	}

	public ContainerType getContainerType() {
		return this.containerType;
	}

	public void setContainerType(ContainerType containerType) {
		this.containerType = containerType;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Port getPortmasterByPortDischargeId() {
		return this.portmasterByPortDischargeId;
	}

	public void setPortmasterByPortDischargeId(Port portmasterByPortDischargeId) {
		this.portmasterByPortDischargeId = portmasterByPortDischargeId;
	}

	public Port getPortmasterByPortLoadingId() {
		return this.portmasterByPortLoadingId;
	}

	public void setPortmasterByPortLoadingId(Port portmasterByPortLoadingId) {
		this.portmasterByPortLoadingId = portmasterByPortLoadingId;
	}

	public String getJobCode() {
		return this.jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobDetails() {
		return this.jobDetails;
	}

	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}

	public String getJobNo() {
		return this.jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	public String getQuantityType() {
		return this.quantityType;
	}

	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getInvoiceValue() {
		return this.invoiceValue;
	}

	public void setInvoiceValue(Long invoiceValue) {
		this.invoiceValue = invoiceValue;
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

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingParty() {
		return bookingParty;
	}

	public void setBookingParty(String bookingParty) {
		this.bookingParty = bookingParty;
	}

	public Date getExpectedShipmentDate() {
		return expectedShipmentDate;
	}

	public void setExpectedShipmentDate(Date expectedShipmentDate) {
		this.expectedShipmentDate = expectedShipmentDate;
	}

	public String getSalesPerson() {
		return salesPerson;
	}

	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}

	public String getBroker() {
		return broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public Port getPortOfOriginId() {
		return portOfOriginId;
	}

	public void setPortOfOriginId(Port portOfOriginId) {
		this.portOfOriginId = portOfOriginId;
	}

	public String getShippingLineBookingNo() {
		return shippingLineBookingNo;
	}

	public void setShippingLineBookingNo(String shippingLineBookingNo) {
		this.shippingLineBookingNo = shippingLineBookingNo;
	}

	public String getFreightTerms() {
		return FreightTerms;
	}

	public void setFreightTerms(String freightTerms) {
		FreightTerms = freightTerms;
	}

	public String getFinalPlaceOfDelivery() {
		return FinalPlaceOfDelivery;
	}

	public void setFinalPlaceOfDelivery(String finalPlaceOfDelivery) {
		FinalPlaceOfDelivery = finalPlaceOfDelivery;
	}

	public String getContainerPickupPoint() {
		return containerPickupPoint;
	}

	public void setContainerPickupPoint(String containerPickupPoint) {
		this.containerPickupPoint = containerPickupPoint;
	}
	
	public String getEmptyContainerLocation() {
		return emptyContainerLocation;
	}

	public void setEmptyContainerLocation(String emptyContainerLocation) {
		this.emptyContainerLocation = emptyContainerLocation;
	}

	public Date getContainerPickupDate() {
		return containerPickupDate;
	}

	public void setContainerPickupDate(Date containerPickupDate) {
		this.containerPickupDate = containerPickupDate;
	}

	public String getCargoReady() {
		return cargoReady;
	}

	public void setCargoReady(String cargoReady) {
		this.cargoReady = cargoReady;
	}

	public Date getDocsCutOffDate() {
		return DocsCutOffDate;
	}

	public void setDocsCutOffDate(Date docsCutOffDate) {
		DocsCutOffDate = docsCutOffDate;
	}

	public Date getACDCutOffDate() {
		return ACDCutOffDate;
	}

	public void setACDCutOffDate(Date aCDCutOffDate) {
		ACDCutOffDate = aCDCutOffDate;
	}

	public Date getEtd() {
		return etd;
	}

	public void setEtd(Date etd) {
		this.etd = etd;
	}

	public Long getSelectedPortId() {
		return selectedPortId;
	}

	public void setSelectedPortId(Long selectedPortId) {
		this.selectedPortId = selectedPortId;
	}

	public Long getSelectedContainerTypeId() {
		return selectedContainerTypeId;
	}

	public void setSelectedContainerTypeId(Long selectedContainerTypeId) {
		this.selectedContainerTypeId = selectedContainerTypeId;
	}

	public Long getSelectedCargoTypeId() {
		return selectedCargoTypeId;
	}

	public void setSelectedCargoTypeId(Long selectedCargoTypeId) {
		this.selectedCargoTypeId = selectedCargoTypeId;
	}

	public Long getSelectedCurrencyId() {
		return selectedCurrencyId;
	}

	public void setSelectedCurrencyId(Long selectedCurrencyId) {
		this.selectedCurrencyId = selectedCurrencyId;
	}

	public Long getSelectedCustomerId() {
		return selectedCustomerId;
	}

	public void setSelectedCustomerId(Long selectedCustomerId) {
		this.selectedCustomerId = selectedCustomerId;
	}

	public Long getSelectedConsigneeId() {
		return selectedConsigneeId;
	}

	public void setSelectedConsigneeId(Long selectedConsigneeId) {
		this.selectedConsigneeId = selectedConsigneeId;
	}
	
}
