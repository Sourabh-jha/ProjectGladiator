package com.bank.dto;

import java.time.LocalDate;

public class UserDetailsDto {

	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String Usertitle;
	private String Userfirstname;
	private String Usermiddlename;
	private String Userlastname;
	private String Userfathername;
	private long UsermobileNo;
	private String UseremailId;
	private long UseraadharNo;
	private LocalDate Userdob;
	private String UserOccupation;
	private int Userincome;
	//	private String Username;
	private String UsernetBanking;
	public String getUsertitle() {
		return Usertitle;
	}
	public void setUsertitle(String usertitle) {
		Usertitle = usertitle;
	}
	public String getUserfirstname() {
		return Userfirstname;
	}
	public void setUserfirstname(String userfirstname) {
		Userfirstname = userfirstname;
	}
	public String getUsermiddlename() {
		return Usermiddlename;
	}
	public void setUsermiddlename(String usermiddlename) {
		Usermiddlename = usermiddlename;
	}
	public String getUserlastname() {
		return Userlastname;
	}
	public void setUserlastname(String userlastname) {
		Userlastname = userlastname;
	}
	public String getUserfathername() {
		return Userfathername;
	}
	public void setUserfathername(String userfathername) {
		Userfathername = userfathername;
	}
	public long getUsermobileNo() {
		return UsermobileNo;
	}
	public void setUsermobileNo(long usermobileNo) {
		UsermobileNo = usermobileNo;
	}
	public String getUseremailId() {
		return UseremailId;
	}
	public void setUseremailId(String useremailId) {
		UseremailId = useremailId;
	}
	public long getUseraadharNo() {
		return UseraadharNo;
	}
	public void setUseraadharNo(long useraadharNo) {
		UseraadharNo = useraadharNo;
	}
	public LocalDate getUserdob() {
		return Userdob;
	}
	public void setUserdob(LocalDate userdob) {
		Userdob = userdob;
	}
	public String getUserOccupation() {
		return UserOccupation;
	}
	public void setUserOccupation(String userOccupation) {
		UserOccupation = userOccupation;
	}
	public int getUserincome() {
		return Userincome;
	}
	public void setUserincome(int userincome) {
		Userincome = userincome;
	}
	public String getUsernetBanking() {
		return UsernetBanking;
	}
	public void setUsernetBanking(String usernetBanking) {
		UsernetBanking = usernetBanking;
	}
	
	
}