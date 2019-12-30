<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
      <a href="imps.jsp">IMPS</a>
      <a href="neft.jsp">NEFT</a>
      <a href="rtgs.jsp">RTGS</a>
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
<div class="content" style="text-align: left;">
<h1>Welcome to <b>HERA PHERI BANK</b></h1>
<p>No need to visit any branch to create an account.</p>
<p>Transfer money through 3 different modes:</p>
<p>-> IMPS</p>
<p>-> NEFT </p>
<p>-> RTGS</p>
<p>Check transactions from anywhere, anytime.</p>
<p>Payment Gateway compatible with various other services.</p>
</div>
</div>
</div>
<div class="footer" style="background-image: linear-gradient(to right, #f3751f , #292e7d);">
  <p>&copy; copyright by <b>HERI PHERI BANK</b></p>
</div>
</body>
</html>