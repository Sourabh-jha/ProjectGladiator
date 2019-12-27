<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Beneficiary</title>
</head>
<body>
<div class="maindiv"> 
<form action="beneficiary.lti" method="post">
<link rel="stylesheet" type="text/css" href="style/login.css">
 
<p  class="nav" >Beneficiary </p>

<div>
<label for="UserName"><b>UserName:&nbsp &nbsp &nbsp &nbsp</b></label>
 <input style="margin-left:76px;" type="text"  name="usernameBene" required>
</div>

<div>
<label for="AccountNo"><b>AccountNo: &nbsp &nbsp &nbsp</b></label>
 <input style="margin-left:76px;" type="text"  name="beneAccountNoBene" required>
</div>


<div>
<label for="NickName"><b>NickName:&nbsp &nbsp &nbsp &nbsp</b></label>
 <input style="margin-left:76px;" type="text"  name="nicknameBene" required>
</div>

<div>
<label for="BankName"><b>BankName:&nbsp &nbsp &nbsp &nbsp</b></label>
 <input style="margin-left:76px;" type="text"  name="bankName" required>
</div>


<button style="margin-left:150px;"  type="submit" class="loginbtn" name ="submit">Save As Beneficiary</button>

</form>
</div>
</body>
</html>