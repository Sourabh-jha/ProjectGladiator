<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
<link rel="stylesheet" href="style/styles.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<style>
.submitbtn{
margin-top: 10px;
padding: 10px;
border: 1px solid #f1f1f1;
border-radius: 5px;
background-color: #292e7d;
color: #f1f1f1;
cursor: pointer;
}
</style>
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
<div class="Mainheader" style="background-image: linear-gradient(to right, #f3751f , #292e7d);">
<img src="images/lti_logo.png">
</div>
<div class="mainContent">
<div class="leftsidenav">
<div class="navOptions"><a href="accountDetail.jsp" >Account Detail</a></div>
<div class="navOptions"><a href="accountSummary.jsp">Account Summary</a></div>
<div class="navOptions"><a href="fundTransfer.jsp">Fund Transfer</a></div>
<div class="navOptions" style="background-color: #292e7d; border-radius: 5px; border: 1px solid #f1f1f1;"><a href="accountStatement.jsp" style="color: #f1f1f1;">Account Statement</a></div>
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
<form action="accountStatement.lti" method="post">
From Date: <input type="date" name="fromDate" required>
To Date: <input type="date" name="toDate" required><br /><br />
<table class="detailTable">
<tr>
<th>Select</th>
<th>Account Number</th>
<th>Account Name</th>
<th>Account Type</th>
<th>Balance</th>
</tr>
<%
String SQL = "SELECT * FROM USER_DETAILS";
StringBuffer strHTML = new StringBuffer();

try {
PreparedStatement pstat = conn.prepareStatement(SQL);

ResultSet rs = pstat.executeQuery();
while (rs.next()) {
int accNo = rs.getInt("ACCOUNTNO");
int bal = rs.getInt("BALANCE");
String name = rs.getString("FNAME");
%>
<tr>
<td><input type="radio" name="accountNo" value="<%= accNo %>"></td>
<td><%= accNo %></td>
<td><%= name %></td>
<td>Savings</td>
<td><%= bal %></td>
</tr>
<%
}
%>
<%
rs.close();
} catch (SQLException e) {
e.printStackTrace();
}
%>
</table>
<input class="submitbtn" type="submit" value="Get Statement">
</form>
</div>
</div>
</div>
<div class="footer" style="background-image: linear-gradient(to right, #f3751f , #292e7d);">
  <p>&copy; copyright by <b>HERI PHERI BANK</b></p>
</div>
</body>
</html>