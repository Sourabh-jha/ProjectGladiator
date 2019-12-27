<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Gateway</title>
</head>
<body>

<div class="mainDiv">
    <div class="main">
    	<form action="#">
    		<input type="text"  name="fromAccount" style="margin-top: 20px;" placeholder="Enter Account No." required><br> <br /> 
    		<input type="text"  name="toAccount" style="margin-top: 20px;" placeholder="To Account" readonly><br> <br /> 
            <input type="number" name="amount" placeholder="Amount" readonly><br> <br />
            <button>Get OTP</button>
            <input type="text" name="otp" value="" required> 
            <input type="submit" name="submit" value="Pay" class="submit"> 
    	</form>
    </div>
 </div>

</body>
</html>