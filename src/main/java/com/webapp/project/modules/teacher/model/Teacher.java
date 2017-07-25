package com.webapp.project.modules.teacher.model;
// Generated Jul 9, 2017 5:31:29 PM by Hibernate Tools 4.3.1.Final


import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.webapp.project.framework.model.AppUser;
import com.webapp.project.modules.classes.model.Classes;

/**
 * Teacher generated by hbm2java
 */
@Entity
@Table(name="teacher"
    ,catalog="websystique"
)
public class Teacher  implements java.io.Serializable {


     private Long teacherId;
     private AppUser appUser;
     private String firstName;
     private String middleName;
     private String lastName;
     private String designation;
     private Date dob;
     private String gender;
     private String religion;
     private String email;
     private String phone;
     private String address;
     private Date jod;
     private String photo;
     private String username;
     private String password;
     private String usertype;
     private Date createDate;
     private Date modifyDate;
     private Integer createUserId;
     private String createUsername;
     private String createUsertype;
     private int teacheractive;
     private Set<Classes> classeses = new HashSet<Classes>(0);

    public Teacher() {
    }
    public Teacher(Long teacherId, String firstName) {
    	this.teacherId=teacherId;
    	this.firstName=firstName;
    }
	
    public Teacher(String lastName, String designation, Date dob, String gender, Date jod, Date createDate, Date modifyDate, String createUsername, String createUsertype, int teacheractive) {
        this.lastName = lastName;
        this.designation = designation;
        this.dob = dob;
        this.gender = gender;
        this.jod = jod;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.createUsername = createUsername;
        this.createUsertype = createUsertype;
        this.teacheractive = teacheractive;
    }
    public Teacher(AppUser appUser, String firstName, String middleName, String lastName, String designation, Date dob, String gender, String religion, String email, String phone, String address, Date jod, String photo, String username, String password, String usertype, Date createDate, Date modifyDate, Integer createUserId, String createUsername, String createUsertype, int teacheractive, Set<Classes> classeses) {
       this.appUser = appUser;
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.designation = designation;
       this.dob = dob;
       this.gender = gender;
       this.religion = religion;
       this.email = email;
       this.phone = phone;
       this.address = address;
       this.jod = jod;
       this.photo = photo;
       this.username = username;
       this.password = password;
       this.usertype = usertype;
       this.createDate = createDate;
       this.modifyDate = modifyDate;
       this.createUserId = createUserId;
       this.createUsername = createUsername;
       this.createUsertype = createUsertype;
       this.teacheractive = teacheractive;
       this.classeses = classeses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="teacherID", unique=true, nullable=false)
    public Long getTeacherId() {
        return this.teacherId;
    }
    
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="userId")
    public AppUser getAppUser() {
        return this.appUser;
    }
    
    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    
    @Column(name="first_name", length=60)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="middle_name", length=60)
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    
    @Column(name="last_name", nullable=false, length=60)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="designation", nullable=false, length=128)
    public String getDesignation() {
        return this.designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dob", nullable=false, length=10)
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    
    @Column(name="gender", nullable=false, length=10)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Column(name="religion", length=25)
    public String getReligion() {
        return this.religion;
    }
    
    public void setReligion(String religion) {
        this.religion = religion;
    }

    
    @Column(name="email", length=40)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="phone")
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="address", length=65535)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="jod", nullable=false, length=10)
    public Date getJod() {
        return this.jod;
    }
    
    public void setJod(Date jod) {
        this.jod = jod;
    }

    
    @Column(name="photo", length=200)
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    
    @Column(name="username", length=40)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", length=128)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="usertype", length=20)
    public String getUsertype() {
        return this.usertype;
    }
    
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", nullable=false, length=19)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modify_date", nullable=false, length=19)
    public Date getModifyDate() {
        return this.modifyDate;
    }
    
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    
    @Column(name="create_userID")
    public Integer getCreateUserId() {
        return this.createUserId;
    }
    
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    
    @Column(name="create_username", nullable=false, length=40)
    public String getCreateUsername() {
        return this.createUsername;
    }
    
    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    
    @Column(name="create_usertype", nullable=false, length=20)
    public String getCreateUsertype() {
        return this.createUsertype;
    }
    
    public void setCreateUsertype(String createUsertype) {
        this.createUsertype = createUsertype;
    }

    
    @Column(name="teacheractive", nullable=false)
    public int getTeacheractive() {
        return this.teacheractive;
    }
    
    public void setTeacheractive(int teacheractive) {
        this.teacheractive = teacheractive;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="teacher")
    public Set<Classes> getClasseses() {
        return this.classeses;
    }
    
    public void setClasseses(Set<Classes> classeses) {
        this.classeses = classeses;
    }




}


