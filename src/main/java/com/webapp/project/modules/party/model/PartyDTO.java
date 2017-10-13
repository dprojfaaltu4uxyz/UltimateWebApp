package com.webapp.project.modules.party.model;

import java.util.Date;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.framework.model.BaseDTO;
import com.webapp.project.modules.masters.model.CargoType;
import com.webapp.project.modules.masters.model.City;
import com.webapp.project.modules.masters.model.Consignee;
import com.webapp.project.modules.masters.model.ContainerType;
import com.webapp.project.modules.masters.model.Currency;
import com.webapp.project.modules.masters.model.Customer;
import com.webapp.project.modules.masters.model.Port;
import com.webapp.project.modules.masters.model.State;

public class PartyDTO extends BaseDTO{

	private long partyId;
	private String partyCode; 
	private AppUser appUser;
	private Date createDate;
	private Date modifiedDate;
	private Integer createUserId;
	private String createUsername;
	private String createUsertype;

	private String salesPerson;
	//----------party
	private String accountPartyName;
	private String shortName;
	private String opBalance;
	private String underGroup;
	private String debitCredit;
	private String strDirectory;
	private String bankChequeReport;
	private String rewardDirectory;
	private String textinput;
	private Integer deactivate;
	private String manifestReportName;
	private String binNo;
	private String exporterHouse;
	private String certificateNo;
	private Date certificateDate;
	private Date validUptoDate;
	private String ifsCode;
	private String stExciseReg;
	private String gstNo;
	private String branchSrNo;
	private String totalBranch;
	private City city;
	private State state;
	private String pinCode;
	private String contactPerson;
	private String phone;
	private String mobile;
	private String email;
	private String commercialTaxRegState;
	private String commercialTaxType;
	private String commercialTaxRegNo;
	private String iecCode;
	private String branchSerialNo;
	private String commissionRate;
	private String division;
	private String range;
	private String name;
	private String branch;
	private String drawBankAccountNo;
	private String bankName;
	private String drawBankAddress;
	private String address;
	private String iecCodeNo;
	private String organization;
	private String panNo;
	private String accountNo;
	private String grBankAdCode;
	private String grBankName;
	private String grBankaddress;
	private String grBankTotalBranch;
	private String iecCodeThirdParty;
	private String branchSrNoThirdParty;
	private String commissionRateThirdParty;
	private String divisionThirdParty;
	private String rangeThirdParty;
	private String nameAddress;
	private String exporterClass;
	private String grBank;
	private Long selectedCityId;
	private Long selectedStateId;
	
	public long getPartyId() {
		return partyId;
	}
	public void setPartyId(long partyId) {
		this.partyId = partyId;
	}
	public AppUser getAppUser() {
		return appUser;
	}
	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
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
	public String getSalesPerson() {
		return salesPerson;
	}
	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}
	public String getAccountPartyName() {
		return accountPartyName;
	}
	public void setAccountPartyName(String accountPartyName) {
		this.accountPartyName = accountPartyName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getOpBalance() {
		return opBalance;
	}
	public void setOpBalance(String opBalance) {
		this.opBalance = opBalance;
	}
	public String getUnderGroup() {
		return underGroup;
	}
	public void setUnderGroup(String underGroup) {
		this.underGroup = underGroup;
	}
	public String getDebitCredit() {
		return debitCredit;
	}
	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}
	public String getStrDirectory() {
		return strDirectory;
	}
	public void setStrDirectory(String strDirectory) {
		this.strDirectory = strDirectory;
	}
	public String getBankChequeReport() {
		return bankChequeReport;
	}
	public void setBankChequeReport(String bankChequeReport) {
		this.bankChequeReport = bankChequeReport;
	}
	public String getRewardDirectory() {
		return rewardDirectory;
	}
	public void setRewardDirectory(String rewardDirectory) {
		this.rewardDirectory = rewardDirectory;
	}
	public String getTextinput() {
		return textinput;
	}
	public void setTextinput(String textinput) {
		this.textinput = textinput;
	}
	public Integer getDeactivate() {
		return deactivate;
	}
	public void setDeactivate(Integer deactivate) {
		this.deactivate = deactivate;
	}
	public String getManifestReportName() {
		return manifestReportName;
	}
	public void setManifestReportName(String manifestReportName) {
		this.manifestReportName = manifestReportName;
	}
	public String getBinNo() {
		return binNo;
	}
	public void setBinNo(String binNo) {
		this.binNo = binNo;
	}
	public String getExporterHouse() {
		return exporterHouse;
	}
	public void setExporterHouse(String exporterHouse) {
		this.exporterHouse = exporterHouse;
	}
	public Date getCertificateDate() {
		return certificateDate;
	}
	public void setCertificateDate(Date certificateDate) {
		this.certificateDate = certificateDate;
	}
	public Date getValidUptoDate() {
		return validUptoDate;
	}
	public void setValidUptoDate(Date validUptoDate) {
		this.validUptoDate = validUptoDate;
	}
	public String getIfsCode() {
		return ifsCode;
	}
	public void setIfsCode(String ifsCode) {
		this.ifsCode = ifsCode;
	}
	public String getStExciseReg() {
		return stExciseReg;
	}
	public void setStExciseReg(String stExciseReg) {
		this.stExciseReg = stExciseReg;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public String getBranchSrNo() {
		return branchSrNo;
	}
	public void setBranchSrNo(String branchSrNo) {
		this.branchSrNo = branchSrNo;
	}
	public String getTotalBranch() {
		return totalBranch;
	}
	public void setTotalBranch(String totalBranch) {
		this.totalBranch = totalBranch;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCommercialTaxRegState() {
		return commercialTaxRegState;
	}
	public void setCommercialTaxRegState(String commercialTaxRegState) {
		this.commercialTaxRegState = commercialTaxRegState;
	}
	public String getCommercialTaxType() {
		return commercialTaxType;
	}
	public void setCommercialTaxType(String commercialTaxType) {
		this.commercialTaxType = commercialTaxType;
	}
	public String getCommercialTaxRegNo() {
		return commercialTaxRegNo;
	}
	public void setCommercialTaxRegNo(String commercialTaxRegNo) {
		this.commercialTaxRegNo = commercialTaxRegNo;
	}
	public String getIecCode() {
		return iecCode;
	}
	public void setIecCode(String iecCode) {
		this.iecCode = iecCode;
	}
	public String getBranchSerialNo() {
		return branchSerialNo;
	}
	public void setBranchSerialNo(String branchSerialNo) {
		this.branchSerialNo = branchSerialNo;
	}
	public String getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDrawBankAccountNo() {
		return drawBankAccountNo;
	}
	public void setDrawBankAccountNo(String drawBankAccountNo) {
		this.drawBankAccountNo = drawBankAccountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getDrawBankAddress() {
		return drawBankAddress;
	}
	public void setDrawBankAddress(String drawBankAddress) {
		this.drawBankAddress = drawBankAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIecCodeNo() {
		return iecCodeNo;
	}
	public void setIecCodeNo(String iecCodeNo) {
		this.iecCodeNo = iecCodeNo;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getGrBankAdCode() {
		return grBankAdCode;
	}
	public void setGrBankAdCode(String grBankAdCode) {
		this.grBankAdCode = grBankAdCode;
	}
	public String getGrBankName() {
		return grBankName;
	}
	public void setGrBankName(String grBankName) {
		this.grBankName = grBankName;
	}
	public String getGrBankaddress() {
		return grBankaddress;
	}
	public void setGrBankaddress(String grBankaddress) {
		this.grBankaddress = grBankaddress;
	}
	public String getGrBankTotalBranch() {
		return grBankTotalBranch;
	}
	public void setGrBankTotalBranch(String grBankTotalBranch) {
		this.grBankTotalBranch = grBankTotalBranch;
	}
	public String getIecCodeThirdParty() {
		return iecCodeThirdParty;
	}
	public void setIecCodeThirdParty(String iecCodeThirdParty) {
		this.iecCodeThirdParty = iecCodeThirdParty;
	}
	public String getBranchSrNoThirdParty() {
		return branchSrNoThirdParty;
	}
	public void setBranchSrNoThirdParty(String branchSrNoThirdParty) {
		this.branchSrNoThirdParty = branchSrNoThirdParty;
	}
	public String getCommissionRateThirdParty() {
		return commissionRateThirdParty;
	}
	public void setCommissionRateThirdParty(String commissionRateThirdParty) {
		this.commissionRateThirdParty = commissionRateThirdParty;
	}
	public String getDivisionThirdParty() {
		return divisionThirdParty;
	}
	public void setDivisionThirdParty(String divisionThirdParty) {
		this.divisionThirdParty = divisionThirdParty;
	}
	public String getRangeThirdParty() {
		return rangeThirdParty;
	}
	public void setRangeThirdParty(String rangeThirdParty) {
		this.rangeThirdParty = rangeThirdParty;
	}
	public String getNameAddress() {
		return nameAddress;
	}
	public void setNameAddress(String nameAddress) {
		this.nameAddress = nameAddress;
	}
	public String getExporterClass() {
		return exporterClass;
	}
	public void setExporterClass(String exporterClass) {
		this.exporterClass = exporterClass;
	}
	public String getGrBank() {
		return grBank;
	}
	public void setGrBank(String grBank) {
		this.grBank = grBank;
	}
	public Long getSelectedCityId() {
		return selectedCityId;
	}
	public void setSelectedCityId(Long selectedCityId) {
		this.selectedCityId = selectedCityId;
	}
	public Long getSelectedStateId() {
		return selectedStateId;
	}
	public void setSelectedStateId(Long selectedStateId) {
		this.selectedStateId = selectedStateId;
	}
	public String getCertificateNo() {
		return certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartyCode() {
		return partyCode;
	}
	public void setPartyCode(String partyCode) {
		this.partyCode = partyCode;
	}
	
}
