<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Beneficiary</title>
<link rel="stylesheet" type="text/css" href="style/beneficiary.css">
</head>
<body>
<div class="mainDiv">
<div class="main">
<form action="beneficiary.lti" method="post">
<div style="text-align: center;">
 <h1>Add New Beneficiary</h1>
<input type="text"  name="usernameBene" value="${ loggedInUser }" style="margin-top: 20px;" placeholder="Enter User Name" readonly><br> <br /> 
<input type="text" name="beneAccountNoBene" placeholder="Account Number" required><br> <br /> 
<input type="text" name="nicknameBene" placeholder="NickName" required><br> <br /> 
        
<button style="margin-left:0px;"  type="submit" class="submit">Submit</button>

</div>

</form>
</div>
</div>
</body>
</html>
