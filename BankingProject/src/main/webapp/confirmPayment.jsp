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
    <h1>Confirm Payment</h1>
    	<form action="fundTransfer.lti" method="post">
    		<input type="text"  name="fromAccountNo" value="${ details.get(0) }" style="margin-top: 20px;" readonly><br> <br /> 
    		<input type="text"  name="toAccountNo" value="${ details.get(1) }" readonly><br> <br /> 
            <input type="number" name="amount" value="${ details.get(2) }" readonly><br> <br />
            <input type="hidden" name="transferMode" value="WithinBank" readonly><br> <br />
            <input type="hidden" name="remark" value="WithinBank Transfer" readonly><br> <br />
            <button type="submit" name="confirm" class="submit">Confirm</button>
    	</form>
    </div>
 </div>

</body>
</html>