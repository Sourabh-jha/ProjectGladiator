package com.bank.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="USER_DETAILS")

public class UserDetails{




@Id
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
private int income;

@ManyToOne
@JoinColumn(name="USERNAME")
Login username;

@Column(name="NETBANKING")
private String netBanking;

@Column(name= "BALANCE")
private int balance;


@Column(name= "APPROVED")
private String approved;


@Column(name = "OCCUPATION")
private String occupation;



public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
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

public int getIncome() {
return income;
}

public void setIncome(int income) {
this.income = income;
}

public Login getUsername() {
	return username;
}

public void setUsername(Login username) {
	this.username = username;
}

public String getNetBanking() {
	return netBanking;
}

public void setNetBanking(String netBanking) {
	this.netBanking = netBanking;
}

public String getApproved() {
	return approved;

}

public void setApproved(String approved) {
	this.approved = approved;
}

public String getOccupation() {
	return occupation;
}

public void setOccupation(String occupation) {
	this.occupation = occupation;
}


 




}