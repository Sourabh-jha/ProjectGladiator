package com.bank.dto;

import java.time.LocalDate;

public class UserDetailsDto {

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
	//private boolean UsernetBanking;
	private String Useraddress1;
	private String Useraddress2;
	private String Userlandmark;
	private String Userstate;
	private String Usercity;
	private int Userpincode;
	private String UseraddType;
	public String getUserOccupation() {
		return UserOccupation;
	}
	public void setUserOccupation(String userOccupation) {
		UserOccupation = userOccupation;
	}
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
	public int getUserincome() {
		return Userincome;
	}
	public void setUserincome(int userincome) {
		Userincome = userincome;
	}

	/*
	 * public String getUsername() { return Username; } public void
	 * setUsername(String username) { Username = username; }
	 */
	/*
	 * public boolean isUsernetBanking() { return UsernetBanking; } public void
	 * setUsernetBanking(boolean usernetBanking) { UsernetBanking = usernetBanking;
	 * }
	 */
	public String getUseraddress1() {
		return Useraddress1;
	}
	public void setUseraddress1(String useraddress1) {
		Useraddress1 = useraddress1;
	}
	public String getUseraddress2() {
		return Useraddress2;
	}
	public void setUseraddress2(String useraddress2) {
		Useraddress2 = useraddress2;
	}
	public String getUserlandmark() {
		return Userlandmark;
	}
	public void setUserlandmark(String userlandmark) {
		Userlandmark = userlandmark;
	}
	public String getUserstate() {
		return Userstate;
	}
	public void setUserstate(String userstate) {
		Userstate = userstate;
	}
	public String getUsercity() {
		return Usercity;
	}
	public void setUsercity(String usercity) {
		Usercity = usercity;
	}
	public int getUserpincode() {
		return Userpincode;
	}
	public void setUserpincode(int userpincode) {
		Userpincode = userpincode;
	}
	public String getUseraddType() {
		return UseraddType;
	}
	public void setUseraddType(String useraddType) {
		UseraddType = useraddType;
	}
}
