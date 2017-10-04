package com.webapp.project.modules.invoice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invdetail")
public class InvoiceVoucherold implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="P_ID", nullable=false)
	private Integer invId;
	
		
	@Column(name="DESCRIPTION", nullable=false)
	private String desc;
	
	@Column(name="CURRENCY", nullable=false)
	private String currency;
	
	
	@Column(name="RATE", nullable=false)
	private double rate;
	
	@Column(name="QTY", nullable=false)
	private double qty;
	
	@Column(name="EX_RATE", nullable=false)
	private double exRate;
	
	@Column(name="RATE_X_QTY", nullable=false)
	private double rateXqty;
	
	@Column(name="AMOUNT", nullable=false)
	private double amount;
		 
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;
	
	@Column(name="MODIFY_DATE", nullable=false)
	private Date modifyDate;

	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Integer getInvId() {
		return invId;
	}

	public void setInvId(Integer invId) {
		this.invId = invId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public double getExRate() {
		return exRate;
	}

	public void setExRate(double exRate) {
		this.exRate = exRate;
	}

	public double getRateXqty() {
		return rateXqty;
	}

	public void setRateXqty(double rateXqty) {
		this.rateXqty = rateXqty;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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
		result = prime * result + ((invId == null) ? 0 : invId.hashCode());
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
		InvoiceVoucherold other = (InvoiceVoucherold) obj;
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
		if (invId == null) {
			if (other.invId != null)
				return false;
		} else if (!invId.equals(other.invId))
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

	public InvoiceVoucherold(){
		
	}

	public InvoiceVoucherold(Integer invId, String desc, String currency,
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
