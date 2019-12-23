package com.bank.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTION")
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transactionID")
	@SequenceGenerator(name = "transactionID", sequenceName = "TRANSACTIONID_SEQ", allocationSize = 10)
	@Column(name = "TRANSACTIONID")
	private int transID;
	
	@ManyToOne
	@JoinColumn(name = "FROMACCOUNTNO")
	UserDetails fromAccount;
//	private int fromAccount;
	
	@ManyToOne
	@JoinColumn(name = "TOACCOUNTNO")
	UserDetails toAccount;
//	private int toAccout;
	
	@Column(name = "TRANSACTIONDATE")
	private LocalDate transDate;
	
	@Column(name = "AMOUNT")
	private int amount;
	
	@Column(name = "TRANSACTIONMODE")
	private String transMode;
	
	@Column(name = "REMARK")
	private String remark;

	@Column(name = "APPROVED")
	private String approved;
	
	public int getTransID() {
		return transID;
	}

	public void setTransID(int transID) {
		this.transID = transID;
	}

	public UserDetails getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(UserDetails fromAccount) {
		this.fromAccount = fromAccount;
	}

	public UserDetails getToAccount() {
		return toAccount;
	}

	public void setToAccount(UserDetails toAccount) {
		this.toAccount = toAccount;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public LocalDate getTransDate() {
		return transDate;
	}

	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTransMode() {
		return transMode;
	}

	public void setTransMode(String transMode) {
		this.transMode = transMode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
