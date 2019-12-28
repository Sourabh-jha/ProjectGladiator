<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
<meta charset="ISO-8859-1">
<link href="style/home.css" rel="stylesheet" type="text/css" />
</head>

<body style=background-image:url('images/bank.jpg') >

<div class="a"  style="text-align:center;">
		<h1>Welcome To Hera Pheri Bank</h1>
</div>
	<div style="overflow: auto">
		<div class="topnav">
			<a href="login.jsp"><b>Login</b></a> 
			<a href="register.jsp"><b>Register</b></a>
			<form action="checkLogin.lti" method="post"><input type="submit" value="Open New Account"></form>
			<!-- <form action="checkLogin.lti" method="post"><input type="submit" value="Open New Account"></form> -->
		</div>
	</div>

	<div style="background-color:#0A0644; color: white; text-align: center; padding: 10px; margin-top: 516px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">Copyright
		© 2019 Hera Pheri Bank</div>
</body>
</html>