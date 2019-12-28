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
<body>
<div class="Mainheader"style="background-image: linear-gradient(to right, #f3751f , #292e7d);">
<img src="images/lti_logo.png">
</div>
<div class="mainContent">
<div class="leftsidenav">
<div class="navOptions" style="background-color: #292e7d; border-radius: 5px; border: 1px solid #f1f1f1;"><a href="accountDetail.jsp" style="color: #f1f1f1;">Account Detail</a></div>
<div class="navOptions"><a href="accountSummary.jsp">Account Summary</a></div>
<div class="navOptions"><a href="fundTransfer.jsp">Fund Transfer</a></div>
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
<table class="detailTable">
<tr>
<th style="width: 250px;">Credentials</th>
<th>Entered Details</th>
</tr>
<tr>
<td>Name</td>
<td></td>
</tr>
<tr>
<td>Mobile Number</td>
<td></td>
</tr>
<tr>
<td>Email ID</td>
<td></td>
</tr>
<tr>
<td>Aadhar Card Number</td>
<td></td>
</tr>
<tr>
<td>DOB</td>
<td></td>
</tr>
</table>
</div>
</div>
</div>
<div class="footer"style="background-image: linear-gradient(to right, #f3751f , #292e7d);">
  <p>&copy; copyright by <b>HERI PHERI BANK</b></p>
</div>
</body>
</html>