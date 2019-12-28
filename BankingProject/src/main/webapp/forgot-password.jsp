<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot-Password</title>
<link rel="stylesheet" type="text/css" href="style/forgot-password.css">
</head>
<body>

<div class="mainDiv">
		<div class="main">
			<h1>${ changes }</h1>
			<form action="forgotloginPassword.lti" method="post">
			<div style="text-align: center;">
				<img src="images/password.png" width="75" height="90">
				<h1>Forgot Password</h1>
				<input type="text" name="username" value="${ loggedInUser }" placeholder="${ loggedInUser }" readonly><br> <br /> 
				<input type="password" name="password" placeholder="Enter Password" required><br> <br />
				<input type="password" name="repassword" placeholder="Re-Enter Password" required><br> <br />
				<button style="margin-left: 20px;" type="submit" class="submit">Proceed</button>
				</div>
			</form>
		</div>
</div>

</body>
</html>
