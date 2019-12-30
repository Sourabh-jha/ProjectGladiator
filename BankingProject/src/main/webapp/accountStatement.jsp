<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
<div class="navOptions" style="background-color: #292e7d;"><form action="dashboardaccStatement.lti" method="post"><input class="sidebtn" type="submit" name="submit" value="Account Statement"></form></div>
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
<c:forEach items="${ userdetails }" var="users">
<tr>
<td><input type="radio" name="accountNo" value="${ users.accountNo }"></td>
<td>${ users.accountNo }</td>
<td>${ users.firstname }</td>
<td>Savings</td>
<td>${ users.balance }</td>
</tr>
</c:forEach>
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