package com.webapp.project.modules.jobcard.model;

import java.util.Date;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.framework.model.BaseDTO;
import com.webapp.project.modules.masters.model.CargoType;
import com.webapp.project.modules.masters.model.Consignee;
import com.webapp.project.modules.masters.model.ContainerType;
import com.webapp.project.modules.masters.model.Currency;
import com.webapp.project.modules.masters.model.Customer;
import com.webapp.project.modules.masters.model.Port;

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
	private String freightTerms;
	private String finalPlaceOfDelivery;
	private String containerPickupPoint;
	private String emptyContainerLocation;
	private Date containerPickupDate;
	private String cargoReady;
	private Date DocsCutOffDate;
	private Date ACDCutOffDate;
	private Date etd;	
	private Long selectedPortLoadingId;
	private Long selectedPortDischargeId;
	private Long selectedPortOriginId;
	private Long selectedContainerTypeId;
	private Long selectedCargoTypeId;
	private Long selectedCurrencyId;
	private Long selectedCustomerId;
	private Long selectedConsigneeId;
	private String poNumber;
	private String activityName;
	private String mode;
	private Port port;
	private String modeOfRealization;
	private String epzIcdCode;
	private String reference;
	private String purposeOfTransfer;
	private String voyNo;
	private String vessel;
	private String viaNo;
	private String consigneeAddress;
	private String buyerAddress;
	private String productHead;
	private String accountPartyName;
	private String address;
	private String grBank;
	private String remark;
	private String category;
	private String rbiWaiverNo;
	private Date rbiWaiverDate;
	private String country;
	private Integer consigneeBuyerSame;
	private String buyer;
	private String buyerCountry;
	private Integer pmvRequired;
	private String service;
	private String organization;
	private String partyAddress;
	private String stateOfOriginOfGoods;
	private String branchNo;
	private String itemCode;
	private String iecCodeNo;
	private String panNo;
	private String exporterClass;
	private String natureOfPayment;
	private String bankName;
	private String periodPfPaymentInDays;
	private String exportContactNo;
	private String drawbackBankAccount;
	private Date date;
	private String terminal;
	
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
		return freightTerms;
	}

	public void setFreightTerms(String freightTerms) {
		freightTerms = freightTerms;
	}

	public String getFinalPlaceOfDelivery() {
		return finalPlaceOfDelivery;
	}

	public void setFinalPlaceOfDelivery(String finalPlaceOfDelivery) {
		finalPlaceOfDelivery = finalPlaceOfDelivery;
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

	public Long getSelectedPortLoadingId() {
		return selectedPortLoadingId;
	}

	public void setSelectedPortLoadingId(Long selectedPortLoadingId) {
		this.selectedPortLoadingId = selectedPortLoadingId;
	}

	public Long getSelectedPortDischargeId() {
		return selectedPortDischargeId;
	}

	public void setSelectedPortDischargeId(Long selectedPortDischargeId) {
		this.selectedPortDischargeId = selectedPortDischargeId;
	}

	public Long getSelectedPortOriginId() {
		return selectedPortOriginId;
	}

	public void setSelectedPortOriginId(Long selectedPortOriginId) {
		this.selectedPortOriginId = selectedPortOriginId;
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

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Port getPort() {
		return port;
	}

	public void setPort(Port port) {
		this.port = port;
	}

	public String getModeOfRealization() {
		return modeOfRealization;
	}

	public void setModeOfRealization(String modeOfRealization) {
		this.modeOfRealization = modeOfRealization;
	}

	public String getEpzIcdCode() {
		return epzIcdCode;
	}

	public void setEpzIcdCode(String epzIcdCode) {
		this.epzIcdCode = epzIcdCode;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getPurposeOfTransfer() {
		return purposeOfTransfer;
	}

	public void setPurposeOfTransfer(String purposeOfTransfer) {
		this.purposeOfTransfer = purposeOfTransfer;
	}

	public String getVoyNo() {
		return voyNo;
	}

	public void setVoyNo(String voyNo) {
		this.voyNo = voyNo;
	}

	public String getVessel() {
		return vessel;
	}

	public void setVessel(String vessel) {
		this.vessel = vessel;
	}

	public String getViaNo() {
		return viaNo;
	}

	public void setViaNo(String viaNo) {
		this.viaNo = viaNo;
	}

	public String getConsigneeAddress() {
		return consigneeAddress;
	}

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	public String getBuyerAddress() {
		return buyerAddress;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public String getProductHead() {
		return productHead;
	}

	public void setProductHead(String productHead) {
		this.productHead = productHead;
	}

	public String getAccountPartyName() {
		return accountPartyName;
	}

	public void setAccountPartyName(String accountPartyName) {
		this.accountPartyName = accountPartyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrBank() {
		return grBank;
	}

	public void setGrBank(String grBank) {
		this.grBank = grBank;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRbiWaiverNo() {
		return rbiWaiverNo;
	}

	public void setRbiWaiverNo(String rbiWaiverNo) {
		this.rbiWaiverNo = rbiWaiverNo;
	}

	public Date getRbiWaiverDate() {
		return rbiWaiverDate;
	}

	public void setRbiWaiverDate(Date rbiWaiverDate) {
		this.rbiWaiverDate = rbiWaiverDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getConsigneeBuyerSame() {
		return consigneeBuyerSame;
	}

	public void setConsigneeBuyerSame(Integer consigneeBuyerSame) {
		this.consigneeBuyerSame = consigneeBuyerSame;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getBuyerCountry() {
		return buyerCountry;
	}

	public void setBuyerCountry(String buyerCountry) {
		this.buyerCountry = buyerCountry;
	}

	public Integer getPmvRequired() {
		return pmvRequired;
	}

	public void setPmvRequired(Integer pmvRequired) {
		this.pmvRequired = pmvRequired;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getPartyAddress() {
		return partyAddress;
	}

	public void setPartyAddress(String partyAddress) {
		this.partyAddress = partyAddress;
	}

	public String getStateOfOriginOfGoods() {
		return stateOfOriginOfGoods;
	}

	public void setStateOfOriginOfGoods(String stateOfOriginOfGoods) {
		this.stateOfOriginOfGoods = stateOfOriginOfGoods;
	}

	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getIecCodeNo() {
		return iecCodeNo;
	}

	public void setIecCodeNo(String iecCodeNo) {
		this.iecCodeNo = iecCodeNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getExporterClass() {
		return exporterClass;
	}

	public void setExporterClass(String exporterClass) {
		this.exporterClass = exporterClass;
	}

	public String getNatureOfPayment() {
		return natureOfPayment;
	}

	public void setNatureOfPayment(String natureOfPayment) {
		this.natureOfPayment = natureOfPayment;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getPeriodPfPaymentInDays() {
		return periodPfPaymentInDays;
	}

	public void setPeriodPfPaymentInDays(String periodPfPaymentInDays) {
		this.periodPfPaymentInDays = periodPfPaymentInDays;
	}

	public String getExportContactNo() {
		return exportContactNo;
	}

	public void setExportContactNo(String exportContactNo) {
		this.exportContactNo = exportContactNo;
	}

	public String getDrawbackBankAccount() {
		return drawbackBankAccount;
	}

	public void setDrawbackBankAccount(String drawbackBankAccount) {
		this.drawbackBankAccount = drawbackBankAccount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	
	
}
