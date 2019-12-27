<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="style/login.css">
</head>
<body>
<div class="mainDiv">
    <div class="main">
    <div class="leftdiv">
        <img src="images/loginIcon.jpg">
    </div>
    <div class="rightdiv">
        <div style="width: 100%; text-align: right;">
            <a href="#"><p class="closebtn">+</p></a>
        </div>
        <div style="text-align: center;">
        <h1>Login</h1>
        <form action="login.lti" method="post">
            <input type="text"  name="username" style="margin-top: 20px;" placeholder="Username" required><br> <br /> 
            <input type="password" name="password" placeholder="Password" required><br> <br /> 
            <input type="submit" name="submit" value="Login" class="submit"> 
        </form>
        <div class="gap"><span>First time User?</span> <a href="#">Register</a></div>
        <div class="gap">
        <span>Forgot</span>
        <a href="#">Username/ Password?</a>
        </div>
            </div>
    </div>
    </div>
 </div>
</body>
</html>