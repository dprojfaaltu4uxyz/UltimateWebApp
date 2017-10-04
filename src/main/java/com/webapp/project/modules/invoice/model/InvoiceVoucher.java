package com.webapp.project.modules.invoice.model;

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
@Table(name="invdetail")
public class InvoiceVoucher implements Serializable{

	
	private long invId;
	private String desc;
	private String currency;
	private double rate;
	private double qty;
	private double exRate;	
	private double rateXqty;	
	private double amount;	
	private String date;
	private double grossWeight ;
	private double netUnit; 
	private double goodsValue ;
	private String natureOfContract; 
	private double freight; 
	private double unit;  
	private double actualFreight; 
	private double insurance; 
	private double insuranceUnit; 
	private double actualInsurance;  
	private double packagingAndMisc;
	private double pmUnit;  
	private double actualPM ;
	private double otherCharges ;
	private double otherUnit ; 
	private double fobValue ;
	private double pmvRate; 
	private double pmvUnit ;
	private double pmvValue; 
		 
	
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
	@Column(name="P_ID",nullable=false)
	public long getInvId() {
		return invId;
	}

	public void setInvId(long invId) {
		this.invId = invId;
	}
	@Column(name="DESCRIPTION", nullable=true)
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Column(name="CURRENCY", nullable=true)
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Column(name="RATE", nullable=true)
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Column(name="QTY", nullable=true)
	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}
	
	@Column(name="EX_RATE", nullable=true)
	public double getExRate() {
		return exRate;
	}

	public void setExRate(double exRate) {
		this.exRate = exRate;
	}
	@Column(name="RATE_X_QTY", nullable=true)
	public double getRateXqty() {
		return rateXqty;
	}

	public void setRateXqty(double rateXqty) {
		this.rateXqty = rateXqty;
	}
	
	@Column(name="AMOUNT", nullable=true)
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

	 
	@Column(name="date", nullable=true)
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	@Column(name="grossWeight", nullable=true)
	public double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(double grossWeight) {
		this.grossWeight = grossWeight;
	}
	@Column(name="netUnit", nullable=true)
	public double getNetUnit() {
		return netUnit;
	}

	public void setNetUnit(double netUnit) {
		this.netUnit = netUnit;
	}
	@Column(name="goodsValue", nullable=true)
	public double getGoodsValue() {
		return goodsValue;
	}

	public void setGoodsValue(double goodsValue) {
		this.goodsValue = goodsValue;
	}
	@Column(name="natureOfContract", nullable=true)
	public String getNatureOfContract() {
		return natureOfContract;
	}

	public void setNatureOfContract(String natureOfContract) {
		this.natureOfContract = natureOfContract;
	}
	@Column(name="freight", nullable=true)
	public double getFreight() {
		return freight;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}
	@Column(name="unit", nullable=true)
	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}
	@Column(name="actualFreight", nullable=true)
	public double getActualFreight() {
		return actualFreight;
	}

	public void setActualFreight(double actualFreight) {
		this.actualFreight = actualFreight;
	}
	@Column(name="insurance", nullable=true)
	public double getInsurance() {
		return insurance;
	}

	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}
	@Column(name="insuranceUnit", nullable=true)
	public double getInsuranceUnit() {
		return insuranceUnit;
	}

	public void setInsuranceUnit(double insuranceUnit) {
		this.insuranceUnit = insuranceUnit;
	}
	@Column(name="actualInsurance", nullable=true)
	public double getActualInsurance() {
		return actualInsurance;
	}

	public void setActualInsurance(double actualInsurance) {
		this.actualInsurance = actualInsurance;
	}
	@Column(name="packagingAndMisc", nullable=true)
	public double getPackagingAndMisc() {
		return packagingAndMisc;
	}

	public void setPackagingAndMisc(double packagingAndMisc) {
		this.packagingAndMisc = packagingAndMisc;
	}
	@Column(name="pmUnit", nullable=true)
	public double getPmUnit() {
		return pmUnit;
	}

	public void setPmUnit(double pmUnit) {
		this.pmUnit = pmUnit;
	}
	@Column(name="actualPM", nullable=true)
	public double getActualPM() {
		return actualPM;
	}

	public void setActualPM(double actualPM) {
		this.actualPM = actualPM;
	}
	@Column(name="otherCharges", nullable=true)
	public double getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(double otherCharges) {
		this.otherCharges = otherCharges;
	}
	@Column(name="otherUnit", nullable=true)
	public double getOtherUnit() {
		return otherUnit;
	}

	public void setOtherUnit(double otherUnit) {
		this.otherUnit = otherUnit;
	}
	@Column(name="fobValue", nullable=true)
	public double getFobValue() {
		return fobValue;
	}

	public void setFobValue(double fobValue) {
		this.fobValue = fobValue;
	}
	@Column(name="pmvRate", nullable=true)
	public double getPmvRate() {
		return pmvRate;
	}

	public void setPmvRate(double pmvRate) {
		this.pmvRate = pmvRate;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		temp = Double.doubleToLongBits(exRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (invId ^ (invId >>> 32));
		result = prime * result
				+ ((modifyDate == null) ? 0 : modifyDate.hashCode());
		temp = Double.doubleToLongBits(qty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rateXqty);
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
		InvoiceVoucher other = (InvoiceVoucher) obj;
		if (Double.doubleToLongBits(amount) != Double
				.doubleToLongBits(other.amount))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (Double.doubleToLongBits(exRate) != Double
				.doubleToLongBits(other.exRate))
			return false;
		if (invId != other.invId)
			return false;
		if (modifyDate == null) {
			if (other.modifyDate != null)
				return false;
		} else if (!modifyDate.equals(other.modifyDate))
			return false;
		if (Double.doubleToLongBits(qty) != Double.doubleToLongBits(other.qty))
			return false;
		if (Double.doubleToLongBits(rate) != Double
				.doubleToLongBits(other.rate))
			return false;
		if (Double.doubleToLongBits(rateXqty) != Double
				.doubleToLongBits(other.rateXqty))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InvoiceVoucher [invId=" + invId + ", desc=" + desc
				+ ", currency=" + currency + ", rate=" + rate + ", qty=" + qty
				+ ", exRate=" + exRate + ", rateXqty=" + rateXqty + ", amount="
				+ amount + ", createDate=" + createDate + ", modifyDate="
				+ modifyDate + "]";
	}

	public InvoiceVoucher(){
		
	}

	public InvoiceVoucher(Integer invId, String desc, String currency,
			double rate, double qty, double exRate, double rateXqty,
			double amount, Date createDate, Date modifyDate) {
		super();
		this.invId = invId;
		this.desc = desc;
		this.currency = currency;
		this.rate = rate;
		this.qty = qty;
		this.exRate = exRate;
		this.rateXqty = rateXqty;
		this.amount = amount;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}
	
}
