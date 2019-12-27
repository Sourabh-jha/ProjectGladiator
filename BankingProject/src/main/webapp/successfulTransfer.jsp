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
</div>
</div>
</div>
<div class="footer">
  <p>&copy; copyright by <b>HERI PHERI BANK</b></p>
</div>
</body>
</html>