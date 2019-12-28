<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Verify OTP</title>
<link rel="stylesheet" type="text/css" href="style/verifyOtp.css">
</head>
<body>

<div class="mainDiv">
    <div class="main">
    <h1>Verification</h1>
    	<form action="verifyOtp.lti" method="post">
    		<input type="hidden" name="correctOtp" value="${ otpIs }">
    		<input type="hidden" name="fromAccount" value="${ details.get(0) }">
    		<input type="hidden" name="toAccount" value="${ details.get(1) }">
    		<input type="hidden" name="amount" value="${ details.get(2) }">
    		<input type="text"  name="enteredOtp" placeholder="Enter OTP" required><br> <br /> 
            <button type="submit" name="submit" class="verify">Verify OTP</button>
    	</form>
    </div>
 </div>


</body>
</html>