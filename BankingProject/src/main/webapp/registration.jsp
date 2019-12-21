<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="style/login.css">
</head>
<body>
<form action="/action_page.php" >

<div class="maindiv">
<p  class="nav" >Registration </p>

<div>
<label for="Account Number"><b>Account Number:&nbsp &nbsp &nbsp &nbsp</b></label>
 <input style="margin-left:88px;" type="text"  name="accountnumber" required>
</div>

<div>
<label for="Set Login Password"><b>Set Login Password: &nbsp &nbsp &nbsp</b></label>
 <input style="margin-left:76px;" type="password"  name="setloginpassword" required>
</div>

<div>
<label for="Confirm Login Password"><b>Confirm Login Password: </b></label>
 <input style="margin-left:62px;"type="password"  name="confirmloginpassword" required>
</div>

<div>
<label for="Set Transaction Password"><b>Set Transaction Password: &nbsp &nbsp</b></label>
 <input style="margin-left:42px;"type="password"  name="settransactionpassword" required>
</div>


<div>
<label for="Comfirm Transaction Password"><b>Confirm Transaction Password:&nbsp &nbsp &nbsp</b></label>
 <input type="password"  name="confirmtransactionpassword" required>
</div>

<div>
<label for="OTP"><b>Enter OTP:&nbsp &nbsp &nbsp</b></label>
 <input style="margin-left:139px;" type="text"  name="otp" required>
</div>

<button style="margin-left:150px;"  type="submit" class="loginbtn">Submit</button>

</form>
</div>
</body>
</html>