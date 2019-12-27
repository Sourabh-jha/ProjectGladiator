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
    	<form action="#" method="post">
    		<input type="text"  name="fromAccount" style="margin-top: 20px;" placeholder="Enter Account No." required><br> <br /> 
    		<input type="text"  name="toAccount" placeholder="To Account" readonly><br> <br /> 
            <input type="number" name="amount" placeholder="Amount" readonly><br> <br />
            <button type="submit">Get OTP</button>
    	</form>
    </div>
 </div>

</body>
</html>