package com.webapp.project.modules.product.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Table(name="productdetail")
public class ProductDetails implements Serializable{
	
	private long pdtId;	
	private String productName;
	private String desc;	 
	private String accessories;
	private String pkgDetails;
	private String ritcNo;
	private String schemeCode;
	private String category;
	private String invoiceNo;
	private String invDate ;
	private double qty;
	private double  unit; 	
	private double itemRate;		
	private double per;
	private double goodsValue ;
	private double  pmvUnit ;
	private double pmvValue; 
	private double grossWeight ;
	private double netWeight;
	private double perUnit;
	private double noOfPackages; 
	private double noOfPackPerUnit;
	private double  fobValue ;
	private double dbkSrNo;
	private double onWt;
	private double dbkPerUnit;
	private double onFOB;
	private double dbkQuantity;
	private double dbkQtyPerUnit;
	private double stateFOB;
	private double statePerQty;
	private double stateWt;
	private double stateAmt;
	private String jobNotificationNo;
	private String  itemCodeStr;
	private String  itemCodeReward;
	private double stateFOBWt;
	private String endUse;
	private String accessoryState;
	private String hawbNo;
	private double totalPackage;
	private String igstPaymentStatus;
	private double  taxableValue;
	private double igstAmount;	
	private Date createDate;
	private Date modifyDate;

	@Column(name="CREATE_DATE", nullable=true)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name="MODIFY_DATE", nullable=true)
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	 
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PdtID",nullable=true)
	public long getPdtId() {
		return pdtId;
	}

	public void setPdtId(long pdtId) {
		this.pdtId = pdtId;
	}
	@Column(name="DESCRIPTION", nullable=true)
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	@Column(name="productName", nullable=true)
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Column(name="accessories", nullable=true)
	public String getAccessories() {
		return accessories;
	}

	public void setAccessories(String accessories) {
		this.accessories = accessories;
	}
	@Column(name="pkgDetails", nullable=true)
	public String getPkgDetails() {
		return pkgDetails;
	}

	public void setPkgDetails(String pkgDetails) {
		this.pkgDetails = pkgDetails;
	}
	@Column(name="ritcNo", nullable=true)
	public String getRitcNo() {
		return ritcNo;
	}

	public void setRitcNo(String ritcNo) {
		this.ritcNo = ritcNo;
	}
	@Column(name="schemeCode", nullable=true)
	public String getSchemeCode() {
		return schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}
	@Column(name="category", nullable=true)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	@Column(name="invoiceNo", nullable=true)
	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	@Column(name="invDate", nullable=true)
	public String getInvDate() {
		return invDate;
	}

	public void setInvDate(String invDate) {
		this.invDate = invDate;
	}
	@Column(name="qty", nullable=true)
	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}
	@Column(name="unit", nullable=true)
	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}
	@Column(name="itemRate", nullable=true)
	public double getItemRate() {
		return itemRate;
	}

	public void setItemRate(double itemRate) {
		this.itemRate = itemRate;
	}
	@Column(name="per", nullable=true)
	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
	@Column(name="goodsValue", nullable=true)
	public double getGoodsValue() {
		return goodsValue;
	}

	public void setGoodsValue(double goodsValue) {
		this.goodsValue = goodsValue;
	}
	@Column(name="pmvUnit", nullable=true)
	public double getPmvUnit() {
		return pmvUnit;
	}

	public void setPmvUnit(double pmvUnit) {
		this.pmvUnit = pmvUnit;
	}
	@Column(name="pmvValue", nullable=true)
	public double getPmvValue() {
		return pmvValue;
	}

	public void setPmvValue(double pmvValue) {
		this.pmvValue = pmvValue;
	}
	@Column(name="grossWeight", nullable=true)
	public double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(double grossWeight) {
		this.grossWeight = grossWeight;
	}
	@Column(name="netWeight", nullable=true)
	public double getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(double netWeight) {
		this.netWeight = netWeight;
	}
	@Column(name="perUnit", nullable=true)
	public double getPerUnit() {
		return perUnit;
	}

	public void setPerUnit(double perUnit) {
		this.perUnit = perUnit;
	}
	@Column(name="noOfPackages", nullable=true)
	public double getNoOfPackages() {
		return noOfPackages;
	}

	public void setNoOfPackages(double noOfPackages) {
		this.noOfPackages = noOfPackages;
	}
	@Column(name="noOfPackPerUnit", nullable=true)
	public double getNoOfPackPerUnit() {
		return noOfPackPerUnit;
	}

	public void setNoOfPackPerUnit(double noOfPackPerUnit) {
		this.noOfPackPerUnit = noOfPackPerUnit;
	}
	@Column(name="fobValue", nullable=true)
	public double getFobValue() {
		return fobValue;
	}

	public void setFobValue(double fobValue) {
		this.fobValue = fobValue;
	}
	@Column(name="dbkSrNo", nullable=true)
	public double getDbkSrNo() {
		return dbkSrNo;
	}

	public void setDbkSrNo(double dbkSrNo) {
		this.dbkSrNo = dbkSrNo;
	}
	@Column(name="onWt", nullable=true)
	public double getOnWt() {
		return onWt;
	}

	public void setOnWt(double onWt) {
		this.onWt = onWt;
	}
	@Column(name="dbkPerUnit", nullable=true)
	public double getDbkPerUnit() {
		return dbkPerUnit;
	}

	public void setDbkPerUnit(double dbkPerUnit) {
		this.dbkPerUnit = dbkPerUnit;
	}
	@Column(name="onFOB", nullable=true)
	public double getOnFOB() {
		return onFOB;
	}

	public void setOnFOB(double onFOB) {
		this.onFOB = onFOB;
	}
	@Column(name="dbkQuantity", nullable=true)
	public double getDbkQuantity() {
		return dbkQuantity;
	}

	public void setDbkQuantity(double dbkQuantity) {
		this.dbkQuantity = dbkQuantity;
	}
	@Column(name="dbkQtyPerUnit", nullable=true)
	public double getDbkQtyPerUnit() {
		return dbkQtyPerUnit;
	}

	public void setDbkQtyPerUnit(double dbkQtyPerUnit) {
		this.dbkQtyPerUnit = dbkQtyPerUnit;
	}
	@Column(name="stateFOB", nullable=true)
	public double getStateFOB() {
		return stateFOB;
	}

	public void setStateFOB(double stateFOB) {
		this.stateFOB = stateFOB;
	}
	@Column(name="statePerQty", nullable=true)
	public double getStatePerQty() {
		return statePerQty;
	}

	public void setStatePerQty(double statePerQty) {
		this.statePerQty = statePerQty;
	}
	@Column(name="stateWt", nullable=true)
	public double getStateWt() {
		return stateWt;
	}

	public void setStateWt(double stateWt) {
		this.stateWt = stateWt;
	}
	@Column(name="stateAmt", nullable=true)
	public double getStateAmt() {
		return stateAmt;
	}

	public void setStateAmt(double stateAmt) {
		this.stateAmt = stateAmt;
	}
	@Column(name="jobNotificationNo", nullable=true)
	public String getJobNotificationNo() {
		return jobNotificationNo;
	}

	public void setJobNotificationNo(String jobNotificationNo) {
		this.jobNotificationNo = jobNotificationNo;
	}
	@Column(name="itemCodeStr", nullable=true)
	public String getItemCodeStr() {
		return itemCodeStr;
	}

	public void setItemCodeStr(String itemCodeStr) {
		this.itemCodeStr = itemCodeStr;
	}
	@Column(name="itemCodeReward", nullable=true)
	public String getItemCodeReward() {
		return itemCodeReward;
	}

	public void setItemCodeReward(String itemCodeReward) {
		this.itemCodeReward = itemCodeReward;
	}
	@Column(name="stateFOBWt", nullable=true)
	public double getStateFOBWt() {
		return stateFOBWt;
	}

	public void setStateFOBWt(double stateFOBWt) {
		this.stateFOBWt = stateFOBWt;
	}
	@Column(name="endUse", nullable=true)
	public String getEndUse() {
		return endUse;
	}

	public void setEndUse(String endUse) {
		this.endUse = endUse;
	}
	@Column(name="accessoryState", nullable=true)
	public String getAccessoryState() {
		return accessoryState;
	}

	public void setAccessoryState(String accessoryState) {
		this.accessoryState = accessoryState;
	}
	@Column(name="hawbNo", nullable=true)
	public String getHawbNo() {
		return hawbNo;
	}

	public void setHawbNo(String hawbNo) {
		this.hawbNo = hawbNo;
	}
	@Column(name="totalPackage", nullable=true)
	public double getTotalPackage() {
		return totalPackage;
	}

	public void setTotalPackage(double totalPackage) {
		this.totalPackage = totalPackage;
	}
	@Column(name="igstPaymentStatus", nullable=true)
	public String getIgstPaymentStatus() {
		return igstPaymentStatus;
	}

	public void setIgstPaymentStatus(String igstPaymentStatus) {
		this.igstPaymentStatus = igstPaymentStatus;
	}
	@Column(name="taxableValue", nullable=true)
	public double getTaxableValue() {
		return taxableValue;
	}

	public void setTaxableValue(double taxableValue) {
		this.taxableValue = taxableValue;
	}
	@Column(name="igstAmount", nullable=true)
	public double getIgstAmount() {
		return igstAmount;
	}

	public void setIgstAmount(double igstAmount) {
		this.igstAmount = igstAmount;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accessories == null) ? 0 : accessories.hashCode());
		result = prime * result
				+ ((accessoryState == null) ? 0 : accessoryState.hashCode());
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(dbkPerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dbkQtyPerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dbkQuantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dbkSrNo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((endUse == null) ? 0 : endUse.hashCode());
		temp = Double.doubleToLongBits(fobValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(goodsValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(grossWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hawbNo == null) ? 0 : hawbNo.hashCode());
		temp = Double.doubleToLongBits(igstAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((igstPaymentStatus == null) ? 0 : igstPaymentStatus
						.hashCode());
		result = prime * result + ((invDate == null) ? 0 : invDate.hashCode());
		result = prime * result
				+ ((invoiceNo == null) ? 0 : invoiceNo.hashCode());
		result = prime * result
				+ ((itemCodeReward == null) ? 0 : itemCodeReward.hashCode());
		result = prime * result
				+ ((itemCodeStr == null) ? 0 : itemCodeStr.hashCode());
		temp = Double.doubleToLongBits(itemRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((jobNotificationNo == null) ? 0 : jobNotificationNo
						.hashCode());
		result = prime * result
				+ ((modifyDate == null) ? 0 : modifyDate.hashCode());
		temp = Double.doubleToLongBits(netWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(noOfPackPerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(noOfPackages);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(onFOB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(onWt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (pdtId ^ (pdtId >>> 32));
		temp = Double.doubleToLongBits(per);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(perUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((pkgDetails == null) ? 0 : pkgDetails.hashCode());
		temp = Double.doubleToLongBits(pmvUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pmvValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(qty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ritcNo == null) ? 0 : ritcNo.hashCode());
		result = prime * result
				+ ((schemeCode == null) ? 0 : schemeCode.hashCode());
		temp = Double.doubleToLongBits(stateAmt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(stateFOB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(stateFOBWt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(statePerQty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(stateWt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(taxableValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalPackage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(unit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDetails other = (ProductDetails) obj;
		if (accessories == null) {
			if (other.accessories != null)
				return false;
		} else if (!accessories.equals(other.accessories))
			return false;
		if (accessoryState == null) {
			if (other.accessoryState != null)
				return false;
		} else if (!accessoryState.equals(other.accessoryState))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (Double.doubleToLongBits(dbkPerUnit) != Double
				.doubleToLongBits(other.dbkPerUnit))
			return false;
		if (Double.doubleToLongBits(dbkQtyPerUnit) != Double
				.doubleToLongBits(other.dbkQtyPerUnit))
			return false;
		if (Double.doubleToLongBits(dbkQuantity) != Double
				.doubleToLongBits(other.dbkQuantity))
			return false;
		if (Double.doubleToLongBits(dbkSrNo) != Double
				.doubleToLongBits(other.dbkSrNo))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (endUse == null) {
			if (other.endUse != null)
				return false;
		} else if (!endUse.equals(other.endUse))
			return false;
		if (Double.doubleToLongBits(fobValue) != Double
				.doubleToLongBits(other.fobValue))
			return false;
		if (Double.doubleToLongBits(goodsValue) != Double
				.doubleToLongBits(other.goodsValue))
			return false;
		if (Double.doubleToLongBits(grossWeight) != Double
				.doubleToLongBits(other.grossWeight))
			return false;
		if (hawbNo == null) {
			if (other.hawbNo != null)
				return false;
		} else if (!hawbNo.equals(other.hawbNo))
			return false;
		if (Double.doubleToLongBits(igstAmount) != Double
				.doubleToLongBits(other.igstAmount))
			return false;
		if (igstPaymentStatus == null) {
			if (other.igstPaymentStatus != null)
				return false;
		} else if (!igstPaymentStatus.equals(other.igstPaymentStatus))
			return false;
		if (invDate == null) {
			if (other.invDate != null)
				return false;
		} else if (!invDate.equals(other.invDate))
			return false;
		if (invoiceNo == null) {
			if (other.invoiceNo != null)
				return false;
		} else if (!invoiceNo.equals(other.invoiceNo))
			return false;
		if (itemCodeReward == null) {
			if (other.itemCodeReward != null)
				return false;
		} else if (!itemCodeReward.equals(other.itemCodeReward))
			return false;
		if (itemCodeStr == null) {
			if (other.itemCodeStr != null)
				return false;
		} else if (!itemCodeStr.equals(other.itemCodeStr))
			return false;
		if (Double.doubleToLongBits(itemRate) != Double
				.doubleToLongBits(other.itemRate))
			return false;
		if (jobNotificationNo == null) {
			if (other.jobNotificationNo != null)
				return false;
		} else if (!jobNotificationNo.equals(other.jobNotificationNo))
			return false;
		if (modifyDate == null) {
			if (other.modifyDate != null)
				return false;
		} else if (!modifyDate.equals(other.modifyDate))
			return false;
		if (Double.doubleToLongBits(netWeight) != Double
				.doubleToLongBits(other.netWeight))
			return false;
		if (Double.doubleToLongBits(noOfPackPerUnit) != Double
				.doubleToLongBits(other.noOfPackPerUnit))
			return false;
		if (Double.doubleToLongBits(noOfPackages) != Double
				.doubleToLongBits(other.noOfPackages))
			return false;
		if (Double.doubleToLongBits(onFOB) != Double
				.doubleToLongBits(other.onFOB))
			return false;
		if (Double.doubleToLongBits(onWt) != Double
				.doubleToLongBits(other.onWt))
			return false;
		if (pdtId != other.pdtId)
			return false;
		if (Double.doubleToLongBits(per) != Double.doubleToLongBits(other.per))
			return false;
		if (Double.doubleToLongBits(perUnit) != Double
				.doubleToLongBits(other.perUnit))
			return false;
		if (pkgDetails == null) {
			if (other.pkgDetails != null)
				return false;
		} else if (!pkgDetails.equals(other.pkgDetails))
			return false;
		if (Double.doubleToLongBits(pmvUnit) != Double
				.doubleToLongBits(other.pmvUnit))
			return false;
		if (Double.doubleToLongBits(pmvValue) != Double
				.doubleToLongBits(other.pmvValue))
			return false;
		if (Double.doubleToLongBits(qty) != Double.doubleToLongBits(other.qty))
			return false;
		if (ritcNo == null) {
			if (other.ritcNo != null)
				return false;
		} else if (!ritcNo.equals(other.ritcNo))
			return false;
		if (schemeCode == null) {
			if (other.schemeCode != null)
				return false;
		} else if (!schemeCode.equals(other.schemeCode))
			return false;
		if (Double.doubleToLongBits(stateAmt) != Double
				.doubleToLongBits(other.stateAmt))
			return false;
		if (Double.doubleToLongBits(stateFOB) != Double
				.doubleToLongBits(other.stateFOB))
			return false;
		if (Double.doubleToLongBits(stateFOBWt) != Double
				.doubleToLongBits(other.stateFOBWt))
			return false;
		if (Double.doubleToLongBits(statePerQty) != Double
				.doubleToLongBits(other.statePerQty))
			return false;
		if (Double.doubleToLongBits(stateWt) != Double
				.doubleToLongBits(other.stateWt))
			return false;
		if (Double.doubleToLongBits(taxableValue) != Double
				.doubleToLongBits(other.taxableValue))
			return false;
		if (Double.doubleToLongBits(totalPackage) != Double
				.doubleToLongBits(other.totalPackage))
			return false;
		if (Double.doubleToLongBits(unit) != Double
				.doubleToLongBits(other.unit))
			return false;
		return true;
	}

	public ProductDetails() {
	 
	}

	public ProductDetails(long pdtId, String desc, String accessories,
			String pkgDetails, String ritcNo, String schemeCode,
			String category, String invoiceNo, String invDate, double qty,
			double unit, double itemRate, double per, double goodsValue,
			double pmvUnit, double pmvValue, double grossWeight,
			double netWeight, double perUnit, double noOfPackages,
			double noOfPackPerUnit, double fobValue, double dbkSrNo,
			double onWt, double dbkPerUnit, double onFOB, double dbkQuantity,
			double dbkQtyPerUnit, double stateFOB, double statePerQty,
			double stateWt, double stateAmt, String jobNotificationNo,
			String itemCodeStr, String itemCodeReward, double stateFOBWt,
			String endUse, String accessoryState, String hawbNo,
			double totalPackage, String igstPaymentStatus, double taxableValue,
			double igstAmount, Date createDate, Date modifyDate) {
		super();
		this.pdtId = pdtId;
		this.desc = desc;
		this.accessories = accessories;
		this.pkgDetails = pkgDetails;
		this.ritcNo = ritcNo;
		this.schemeCode = schemeCode;
		this.category = category;
		this.invoiceNo = invoiceNo;
		this.invDate = invDate;
		this.qty = qty;
		this.unit = unit;
		this.itemRate = itemRate;
		this.per = per;
		this.goodsValue = goodsValue;
		this.pmvUnit = pmvUnit;
		this.pmvValue = pmvValue;
		this.grossWeight = grossWeight;
		this.netWeight = netWeight;
		this.perUnit = perUnit;
		this.noOfPackages = noOfPackages;
		this.noOfPackPerUnit = noOfPackPerUnit;
		this.fobValue = fobValue;
		this.dbkSrNo = dbkSrNo;
		this.onWt = onWt;
		this.dbkPerUnit = dbkPerUnit;
		this.onFOB = onFOB;
		this.dbkQuantity = dbkQuantity;
		this.dbkQtyPerUnit = dbkQtyPerUnit;
		this.stateFOB = stateFOB;
		this.statePerQty = statePerQty;
		this.stateWt = stateWt;
		this.stateAmt = stateAmt;
		this.jobNotificationNo = jobNotificationNo;
		this.itemCodeStr = itemCodeStr;
		this.itemCodeReward = itemCodeReward;
		this.stateFOBWt = stateFOBWt;
		this.endUse = endUse;
		this.accessoryState = accessoryState;
		this.hawbNo = hawbNo;
		this.totalPackage = totalPackage;
		this.igstPaymentStatus = igstPaymentStatus;
		this.taxableValue = taxableValue;
		this.igstAmount = igstAmount;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}

	@Override
	public String toString() {
		return "ProductDetails [pdtId=" + pdtId + ", desc=" + desc
				+ ", accessories=" + accessories + ", pkgDetails=" + pkgDetails
				+ ", ritcNo=" + ritcNo + ", schemeCode=" + schemeCode
				+ ", category=" + category + ", invoiceNo=" + invoiceNo
				+ ", invDate=" + invDate + ", qty=" + qty + ", unit=" + unit
				+ ", itemRate=" + itemRate + ", per=" + per + ", goodsValue="
				+ goodsValue + ", pmvUnit=" + pmvUnit + ", pmvValue="
				+ pmvValue + ", grossWeight=" + grossWeight + ", netWeight="
				+ netWeight + ", perUnit=" + perUnit + ", noOfPackages="
				+ noOfPackages + ", noOfPackPerUnit=" + noOfPackPerUnit
				+ ", fobValue=" + fobValue + ", dbkSrNo=" + dbkSrNo + ", onWt="
				+ onWt + ", dbkPerUnit=" + dbkPerUnit + ", onFOB=" + onFOB
				+ ", dbkQuantity=" + dbkQuantity + ", dbkQtyPerUnit="
				+ dbkQtyPerUnit + ", stateFOB=" + stateFOB + ", statePerQty="
				+ statePerQty + ", stateWt=" + stateWt + ", stateAmt="
				+ stateAmt + ", jobNotificationNo=" + jobNotificationNo
				+ ", itemCodeStr=" + itemCodeStr + ", itemCodeReward="
				+ itemCodeReward + ", stateFOBWt=" + stateFOBWt + ", endUse="
				+ endUse + ", accessoryState=" + accessoryState + ", hawbNo="
				+ hawbNo + ", totalPackage=" + totalPackage
				+ ", igstPaymentStatus=" + igstPaymentStatus
				+ ", taxableValue=" + taxableValue + ", igstAmount="
				+ igstAmount + ", createDate=" + createDate + ", modifyDate="
				+ modifyDate + "]";
	}
	
}
