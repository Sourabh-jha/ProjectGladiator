<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
<meta charset="ISO-8859-1">
<link href="style/home.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="header">
		<h1>Welcome To Axis Bank</h1>
	</div>

	<div style="overflow: auto">
		<div class="menu">
			<a href="login.jsp"><b>Login</b></a> 
			<a href="register.jsp"><b>Register</b></a>
			<form action="checkLogin.lti" method="post"><input type="submit" value="Open New Account"></form>

		</div>

		<div class="main">
			<h2>Axis</h2>
			<p>Axis Bank is the third-largest of the private-sector banks in
				India offering a comprehensive suite of financial products. The bank
				has its head office in Mumbai, Maharashtra</p>
		</div>

		<div class="right">
			<h2>About Us</h2>
			<p>
				<b>Our Corporate Office.</b>
			</p>
			<p>Axis Bank Limited, Corporate Office, Bombay Dyeing Mills
				Compound, Pandurang Budhkar Marg,Worli, Mumbai - 400 025</p>
			<p>Tel: (022) 2425 2525</p>
		</div>
	</div>

	<div style="background-color: black; color: white; text-align: center; padding: 10px; margin-top: 280px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">Copyright
		© 2019 Axis Bank</div>





</body>
</html>