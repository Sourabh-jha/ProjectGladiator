<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
<link rel="stylesheet" href="style/styles.css">
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
</style>
</head>
<body>
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
<h2>Initiate NEFT Payment</h2>
<table class="detailTable">
<tr>
<td class="tdWidth">From Account</td>
<td><input type="text" name="fromAccount"></td>
</tr>
<tr>
<td class="tdWidth">To Account</td>
<td><input type="text" name="toAccount"></td>
</tr>
<tr>
<td class="tdWidth">Amount</td>
<td><input type="number" name="Amount"></td>
</tr>
<tr>
<td class="tdWidth">Transaction Date</td>
<td><input type="date" name="transDate"></td>
</tr>
<tr>
<td class="tdWidth">Remark</td>
<td><input type="text" name="remark"></td>
</tr>
</table>
</div>
</div>
</div>
<div class="footer">
  <p>&copy; copyright by <b>HERI PHERI BANK</b></p>
</div>
</body>
</html>