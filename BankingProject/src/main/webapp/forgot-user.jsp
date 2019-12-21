<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot-User</title>
<link rel="stylesheet" type="text/css" href="style/forgot-user.css">
</head>
<body>	
<form>

<div class="maindiv" >
<p  class="nav" >Forgot User </p>
<div>
<label for="Enter Account Number"><b>Enter Account Number:&nbsp &nbsp &nbsp</b></label>
 <input type="text"  name="enteraccountnumber" required>
</div>

<div>
<label for="OTP"><b>Enter OTP:&nbsp &nbsp &nbsp</b></label>
 <input style="margin-left:85px;" type="text"  name="otp" required>
 </div>
 
 <div>
 <button style="margin-left:100px;"  type="button" class="loginbtn">Proceed</button>&nbsp&nbsp&nbsp&nbsp&nbsp
  <button  type="button" class="loginbtn">Back</button>
</div>

</form>
</div>
</body>
</html>