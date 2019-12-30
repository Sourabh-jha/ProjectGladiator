<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
<meta charset="ISO-8859-1">
<link href="style/home.css" rel="stylesheet" type="text/css" />
</head>
<style>
.openbtn{
cursor: pointer;
padding-left; 
margin-top: 0px;
padding : 12px;
border-radius: 5px;
border: none;
background-color: #0A0644;
color: #f1f1f1;
font-size:25px;
font-family: Verdana,sans-serif;
border: 1px solid #f1f1f1;
border-radius: 5px;
}
a{
border: 1px solid #f1f1f1;
border-radius: 5px;
}
</style>

<body style=background-image:url('images/bank.jpg') >

<div class="a"  style="text-align:center;">
		<h1>Welcome To Hera Pheri Bank</h1>
</div>
	<div style="overflow: auto; padding: 8px;">
		<div class="topnav">
			<a href="login.jsp">Login</a> 
			<a href="registrationUser.jsp">Register</a>
			<form action="checkLogin.lti" method="post"><input class="openbtn" type="submit" value="Open New Account"></form>
			<!-- <form action="checkLogin.lti" method="post"><input type="submit" value="Open New Account"></form> -->
		</div>
	</div>
	
	<div class="main" style="background-color: #f1f1f1;">
			<h2>About</h2>
			<p>Hera Pheri Bank is one of the leading private banks in India and was among the first to receive approval from the Reserve Bank of India (RBI) to set up a private sector bank in 1994.</p>

			<p>Today, Hera Pheri Bank has a banking network of 49 branches spread across 27 cities and towns.</p>
			
			<p>The Bank has three full fledged Overseas Branches one each at Kolkata, New Delhi and Mumbai. Operations of all the branches have since been computerized and Electronic Fund Transfer System came to be implemented in the Bank's branches across the country.</p>
			
			<br><br>
			
			<p><h2>Our Vision</h2></p>
			<p>Positioning the Bank in a competitive market by adopting IT solutions, providing basic services to mass population at their doorstep, adopt effective IT models to deliver those services, increase flow of credit to agriculture, to achieve a quantum jump in savings bank deposit mobilization and pursue the best practices for delivering the value added service to our customers by transforming the branches into the most preferred banking outlet in rural areas.</p>
			
		</div>

		<div class="right" style="margin-left: 20px;">
			<h2>About Us</h2>
			<p>
				<b>Our Corporate Office.</b>
			</p>
			<p>Hera Pheri Bank Limited, Corporate Office, Bombay Dyeing Mills
				Compound, Pandurang Budhkar Marg,Worli, Mumbai - 400 025</p>
			<p>Tel: (022) 2425 2525</p>
		</div>
	

	<div style="background-color:#0A0644; color: white; text-align: center; padding: 10px; margin-top: 516px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">Copyright
		© 2019 Hera Pheri Bank</div>
</body>
</html>