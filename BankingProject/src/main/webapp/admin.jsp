<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link rel="stylesheet" href="style/styles.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
.submitbtn{
margin-top: 10px;
margin-left: 50%;
padding: 10px;
border: 1px solid #f1f1f1;
border-radius: 5px;
background-color: #292e7d;
color: #f1f1f1;
cursor: pointer;
}
</style>
</head>
<body>
<div class="Mainheader" style="background-image: linear-gradient(to right, #f3751f , #292e7d);">
<img src="images/lti_logo.png">
</div>
<div class="mainContent">
<h1>${ approved }</h1>
<form action="approve.lti" method="post">
<table class="detailTable">
<tr>
<th>Select</th>
<th>Name</th>
<th>Mobile</th>
<th>DOB</th>
<th>Aadhar Number</th>
<th>Income</th>
<th>Document</th>
</tr>
<c:forEach items="${ NotApproved }" var="users">
<tr>
<td><input type="radio" name="accountNo" value="${ users.accountNo }"></td>
<td>${ users.firstname }</td>
<td>${ users.mobileNo }</td>
<td>${ users.dob }</td>
<td>${ users.aadharNo }</td>
<td>${ users.income }</td>
<td><a href="document/${ users.documentname }">${ users.documentname }</a></td>
</tr>
</c:forEach>
</table>
<input type="submit" class="submitbtn" name="submit" value="Approve">
</form>
</div>
<div class="footer" style="background-image: linear-gradient(to right, #f3751f , #292e7d);">
  <p>&copy; copyright by <b>HERI PHERI BANK</b></p>
</div>
</body>
</html>