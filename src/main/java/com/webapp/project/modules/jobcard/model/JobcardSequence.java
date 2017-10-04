package com.webapp.project.modules.jobcard.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "JobcardSequence", catalog = "websystique")
public class JobcardSequence implements java.io.Serializable {

	private long jobCardSequenceId;
	private int sequenceNumber;
	private String sequencePrefix;
	private Date creationDate;
	
	@Id
	@Column(name = "jobCardSequenceId", unique = true, nullable = false)
	public long getJobCardSequenceId() {
		return jobCardSequenceId;
	}
	public void setJobCardSequenceId(long jobCardSequenceId) {
		this.jobCardSequenceId = jobCardSequenceId;
	}
	
	@Column(name = "sequenceNumber")
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	@Column(name = "sequencePrefix", length = 65)
	public String getSequencePrefix() {
		return sequencePrefix;
	}
	public void setSequencePrefix(String sequencePrefix) {
		this.sequencePrefix = sequencePrefix;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_date", nullable = false, length = 19)
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
