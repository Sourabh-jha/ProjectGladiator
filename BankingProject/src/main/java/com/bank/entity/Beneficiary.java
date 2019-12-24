package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BENEFICIARY")
public class Beneficiary {

	@Id
	@Column(name = "BENEFICIARYID")
	private int beneId;
	
	@ManyToOne
	@JoinColumn(name = "USERNAME")
	Login username;
	
	@Column(name = "NICKNAME")
	private String nickname;
	
	@ManyToOne
	@JoinColumn(name = "BENEFICIARYACCOUNTNO")
	UserDetails beneAccountNo;
	
	@Column(name = "BANKNAME")
	private String bankName;

	public int getBeneId() {
		return beneId;
	}

	public void setBeneId(int beneId) {
		this.beneId = beneId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Login getUsername() {
		return username;
	}

	public void setUsername(Login username) {
		this.username = username;
	}

	public UserDetails getBeneAccountNo() {
		return beneAccountNo;
	}

	public void setBeneAccountNo(UserDetails beneAccountNo) {
		this.beneAccountNo = beneAccountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
}
