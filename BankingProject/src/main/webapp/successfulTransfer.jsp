 <%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
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
.sidebtn{
cursor: pointer;
padding-left; 
margin-top: 0px;
padding : 5px;
border-radius: 5px;
border: none;
background-color: white;
}
</style>
<body>
<div class="Mainheader" style="background-image: linear-gradient(to right, #f3751f , #292e7d);">
<img src="images/lti_logo.jpeg">
</div>
<div class="mainContent">
<div class="leftsidenav">
<div class="navOptions"><form action="dashboardaccDetail.lti" method="post"><input class="sidebtn" type="submit" name="submit" value="Account Detail"></form></div>
<div class="navOptions"><form action="dashboardaccSummary.lti" method="post"><input class="sidebtn" type="submit" name="submit" value="Account Summary"></form></div>
<div class="navOptions"><form action="dashboardfundTransfer.lti" method="post"><input class="sidebtn" type="submit" name="submit" value="Fund Transfer"></form></div>
<div class="navOptions"><form action="dashboardaccStatement.lti" method="post"><input class="sidebtn" type="submit" name="submit" value="Account Statement"></form></div>
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
      <a href="accountDetail.jsp">Account Details</a>
    </div>
  </div> 
  <div class="dropdown">
    <button class="dropbtn">Change UserId Password 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="forgot-password.jsp">Forgot Password</a>
    </div>
  </div>
</div>
<div class="content">
<h2>Transfer Successful</h2>
<table class="detailTable">
<tr>
<td class="tdWidth">Reference Id</td>
<td colspan="2">${ transaction.getTransID() }</td>
</tr>
<tr>
<td class="tdWidth">Mode</td>
<td colspan="2">${ transaction.getTransMode() }</td>
</tr>
<tr>
<td class="tdWidth">Paid to Account</td>
<td colspan="2">${ transaction.getToAccount().getAccountNo() }</td>
</tr>
<tr>
<td class="tdWidth">Amount</td>
<td colspan="2">${ transaction.getAmount() }</td>
</tr>
<tr>
<td class="tdWidth">From Account</td>
<td colspan="2">${ transaction.getFromAccount().getAccountNo() }</td>
</tr>
<tr>
<td class="tdWidth">On</td>
<td colspan="2">${ transaction.getTransDate() }</td>
</tr>
<tr>
<td class="tdWidth">Remarks</td>
<td colspan="2">${ transaction.getRemark() }</td>
</tr>
</table>
<%
String url = "http://localhost/?";
URL obj = new URL(url);
HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
conn.setInstanceFollowRedirects(true);  //you still need to handle redirect manully.
HttpURLConnection.setFollowRedirects(true);
%>
</div>
</div>
</div>
<div class="footer" style="background-image: linear-gradient(to right, #f3751f , #292e7d);">
  <p>&copy; copyright by <b>HERI PHERI BANK</b></p>
</div>
</body>
</html>