package com.bank.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="USER_DETAILS")
public class UserDetails {

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "accountNo_seq")
@SequenceGenerator(sequenceName = "accountNo_seq", name = "ACCOUNTNO_SEQ", allocationSize = 1)
@Column(name="ACCOUNTNO")
private int accountNo;

@Column(name="TITLE")
private String title;

@Column(name="FNAME")
private String firstname;

@Column(name="MNAME")
private String middlename;

@Column(name="LNAME")
private String lastname;

@Column(name="FATHERNAME")
private String fathername;

@Column(name="MOBILE")
private long mobileNo;

@Column(name="EMAIL")
private String emailId;

@Column(name="AADHARNO")
private long aadharNo;

@DateTimeFormat
@Column(name="DOB")
private LocalDate dob;

@Column(name="INCOME")
private double income;

@ManyToOne
@JoinColumn(name="USERNAME")
Login username;

@Column(name="NETBANKING")
private boolean netBanking;

@Column(name= "APPROVED")
private boolean approved;

public boolean isApproved() {
return approved;
}

public void setApproved(boolean approved) {
this.approved = approved;
}

public int getAccountNo() {
return accountNo;
}

public void setAccountNo(int accountNo) {
this.accountNo = accountNo;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getFirstname() {
return firstname;
}

public void setFirstname(String firstname) {
this.firstname = firstname;
}

public String getMiddlename() {
return middlename;
}

public void setMiddlename(String middlename) {
this.middlename = middlename;
}

public String getLastname() {
return lastname;
}

public void setLastname(String lastname) {
this.lastname = lastname;
}

public String getFathername() {
return fathername;
}

public void setFathername(String fathername) {
this.fathername = fathername;
}

public long getMobileNo() {
return mobileNo;
}

public void setMobileNo(long mobileNo) {
this.mobileNo = mobileNo;
}

public String getEmailId() {
return emailId;
}

public void setEmailId(String emailId) {
this.emailId = emailId;
}

public long getAadharNo() {
return aadharNo;
}

public void setAadharNo(long aadharNo) {
this.aadharNo = aadharNo;
}

public LocalDate getDob() {
return dob;
}

public void setDob(LocalDate dob) {
this.dob = dob;
}

public double getIncome() {
return income;
}

public void setIncome(double income) {
this.income = income;
}

public Login getUsername() {
	return username;
}

public void setUsername(Login username) {
	this.username = username;
}

public boolean isNetBanking() {
	return netBanking;
}

public void setNetBanking(boolean netBanking) {
	this.netBanking = netBanking;
}


 

/*public Address getAddress() {
return address;
}

 

public void setAddress(Address address) {
this.address = address;
}

 

@OneToMany(mappedBy="address")
private Address address;*/



 


}