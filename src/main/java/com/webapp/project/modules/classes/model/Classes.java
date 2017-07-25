package com.webapp.project.modules.classes.model;

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
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.webapp.project.modules.teacher.model.Teacher;

@Entity
@Table(name="CLASSES")
public class Classes implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CLASSESID", nullable=false)
	@org.springframework.data.annotation.Id
	private Integer classesId;
	
	@NotEmpty
	@Column(name="CLASSES", nullable=false)
	private String classes;
	
	@NotNull
	@Column(name="CLASSES_NUMERIC", nullable=false)
	private Integer classesNumeric;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "teacherId")
	private Teacher teacher; 
	
	
	@NotEmpty
	@Column(name="NOTE", nullable=false)
	private String note;
	
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;
	
	@Column(name="MODIFY_DATE", nullable=false)
	private Date modifyDate;
	
	@Column(name="CREATE_USERID", nullable=false)
	private Date createUserId;
	
	@Column(name="CREATE_USERNAME", nullable=false)
	private String createUserName;
	
	@Column(name="CREATE_USERTYPE", nullable=false)
	private String createUserType;

	public Integer getClassesId() {
		return classesId;
	}

	public void setClassesId(Integer classesId) {
		this.classesId = classesId;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public Integer getClassesNumeric() {
		return classesNumeric;
	}

	public void setClassesNumeric(Integer classesNumeric) {
		this.classesNumeric = classesNumeric;
	}


	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

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

	public Date getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Date createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getCreateUserType() {
		return createUserType;
	}

	public void setCreateUserType(String createUserType) {
		this.createUserType = createUserType;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Classes(Integer classesId,String classes){
		this.classesId = classesId;
		this.classes = classes;
	}
	
	public Classes(){
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classes == null) ? 0 : classes.hashCode());
		result = prime * result + ((classesId == null) ? 0 : classesId.hashCode());
		result = prime * result + ((classesNumeric == null) ? 0 : classesNumeric.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
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
		Classes other = (Classes) obj;
		if (classes == null) {
			if (other.classes != null)
				return false;
		} else if (!classes.equals(other.classes))
			return false;
		if (classesId == null) {
			if (other.classesId != null)
				return false;
		} else if (!classesId.equals(other.classesId))
			return false;
		if (classesNumeric == null) {
			if (other.classesNumeric != null)
				return false;
		} else if (!classesNumeric.equals(other.classesNumeric))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return classes ;
		
	}

}
