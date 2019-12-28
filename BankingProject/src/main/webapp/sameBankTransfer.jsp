<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
<link rel="stylesheet" href="style/styles.css">
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
input{
width: 100%;
height: 25px;
border-radius: 3px;
border: 1px solid #f1f1f1;
}
.tdWidth{
width: 150px;
}
.content{
margin-top: 0;
}
</style>
</head>
<body>
<%@page import="java.io.*, java.util.*, java.sql.*"%>
<%!
private Connection conn = null;
public void jspInit(){
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "banking", "banking");
	System.out.println("Connected:" + conn);
	} catch (ClassNotFoundException e) {
	System.err.println("ShowLogin_Servlet->unable to load the JDBC Driver...");
	} catch (SQLException e) {
	System.err.println("ShowLogin_Servlet->unable to establish the database connection...");
	}
}
%>
<div class="Mainheader">
<img src="images/lti_logo.png">
</div>
<div class="mainContent">
<div class="leftsidenav">
<div class="navOptions"><a href="accountDetail.jsp" >Account Detail</a></div>
<div class="navOptions"><a href="accountSummary.jsp">Account Summary</a></div>
<div class="navOptions" style="background-color: #292e7d; border-radius: 5px; border: 1px solid #f1f1f1;"><a href="fundTransfer.jsp" style="color: #f1f1f1;">Fund Transfer</a></div>
<div class="navOptions"><a href="accountStatement.jsp">Account Statement</a></div>
</div>
<div class="rightsidenav">
<div class="navbar">
  <a href="#home">Account Statement</a>
  <div class="dropdown">
    <button class="dropbtn">Fund Transfer 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">IMPS</a>
      <a href="#">NEFT</a>
      <a href="#">RTGS</a>
    </div>
  </div> 
  <div class="dropdown">
    <button class="dropbtn">User Profile 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Link 1</a>
      <a href="#">Link 2</a>
      <a href="#">Link 3</a>
    </div>
  </div> 
  <div class="dropdown">
    <button class="dropbtn">Change UserId Password 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Link 1</a>
      <a href="#">Link 2</a>
      <a href="#">Link 3</a>
    </div>
  </div>
</div>
<div class="content">
<h2>Initiate Payment</h2>
<form action="fundTransafer.lti" method="post" id="fundTransfer">
<table class="detailTable">
<tr>
<td class="tdWidth">Mode</td>
<td colspan="2"><input type="text" name="transferMode" value="WithinBank" readonly></td>
</tr>
<tr>
<td class="tdWidth">From Account</td>
<td colspan="2"><input type="number" name="fromAccountNo"></td>
</tr>
<tr>
<td class="tdWidth">To Account</td>
<td>
<select name="toAccountNo" style="width: 100%;">
<%
String SQL = "SELECT * FROM BENEFICIARY";
StringBuffer strHTML = new StringBuffer();

try {
PreparedStatement pstat = conn.prepareStatement(SQL);

ResultSet rs = pstat.executeQuery();
while (rs.next()) {
int accNo = rs.getInt("BENEFICIARYACCOUNTNO");
String holderName = rs.getString("USERNAME");
%>
<option value="<%= accNo %>" style="width: 100%;"><%= accNo %> (<%= holderName %>)</option>
<%
}
%>
<%
rs.close();
} catch (SQLException e) {
e.printStackTrace();
}
out.println(strHTML.toString());
%>
</select>
</td>
<td style="width:150px;"><button><i class="fa fa-plus" aria-hidden="true"></i><a href="beneficiary.jsp">Add Account</a></button></td>
</tr>
<tr>
<td class="tdWidth">Amount</td>
<td colspan="2"><input type="number" name="amount"></td>
</tr>
<tr>
<td class="tdWidth">Remark</td>
<td colspan="2"><textarea name="remark" style="width: 100%;" form="fundTransfer"></textarea></td>
</tr>
</table>
<button type="reset">Reset</button>
<button type="submit">Transfer</button>
</form>
</div>
</div>
</div>
<div class="footer">
  <p>&copy; copyright by <b>HERI PHERI BANK</b></p>
</div>
</body>
</html>