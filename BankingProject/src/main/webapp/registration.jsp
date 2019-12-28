<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Internet Banking </title>
<link rel="stylesheet" type="text/css" href="style/registrationInternetBanking.css">
</head>
<body>


<div class="mainDiv">
<div class="main">
<form action="/action_page.php" >
<div style="text-align: center;">
 <h1>Registration</h1>
<input type="text"  name="accountnumber" style="margin-top: 20px;" placeholder="Enter Account Number" required><br> <br /> 
<input type="password" name="setloginpassword" placeholder="Set Login Password" required><br> <br /> 
<input type="password" name="confirmloginpassword" placeholder="Confirm Login Password" required><br> <br /> 
<input type="password" name="settransactionpassword" placeholder="Set Transaction Password" required><br> <br /> 
<input type="password" name="confirmtransactionpassword" placeholder="Comfirm Transaction Password" required><br> <br /> 
<input type="text" name="otp" placeholder="Enter OTP" required><br> <br /> 
         
<button style="margin-left:20px;"  type="button" class="submit">Submit</button>

</div>

</form>
</div>
</div>
</body>
</html>