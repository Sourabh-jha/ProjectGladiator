<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Gateway</title>
<link rel="stylesheet" type="text/css" href="style/paymentGateway.css">
</head>
<body>

<div class="mainDiv">
    <div class="main">
    <div style="width: 100%; text-align: right;">
            <a href="#"><p class="closebtn">+</p></a>
    </div>
    <h1>Initiate Payment</h1>
    	<form action="paymentGateway.lti" method="post">
    	<%
    	// int fromAccount = Integer.parseInt(request.getParameter("fromAccount"));
    	// int amount = Integer.parseInt(request.getParameter("amount"));
    	%>
    		<input type="text"  name="fromAccount" style="margin-top: 20px;" placeholder="Enter Account No." required><br> <br /> 
    		<input type="text"  name="toAccount" placeholder="To Account" required><br> <br /> 
            <input type="number" name="amount" placeholder="Amount" required><br> <br />
            <button type="submit" name="submit" class="submit">Get OTP</button>
    	</form>
    </div>
 </div>

</body>
</html>