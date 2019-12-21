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
<form action="login.lti" method="post">
<div class="maindiv" >
 <p class="nav">Login Form </p>

<div>
<label for="UserName"><b>UserName:&nbsp &nbsp &nbsp</b></label>
 <input type="text"  name="username" required>
</div>
 
 <div>
<label for="password"><b>Password:</b></label>
    <input    style="margin-left:28px;"   type="password"  name="password" required>
</div>
</div>

<div style="margin-left:592px;">
<button type="submit" class="loginbtn">Login</button>
 <div >
    <p><i>FirstTimeUser? <a href="#">Register</a></i></p>
    </div>
     <div >
    <p> <i><a href="#">Forgot User Id?</a></i></p>
    </div>
     <div >
    <p> <i><a href="#">Forgot password?</a></i></p>
    </div>
   
   </div>

</form>
</body>














</body>
</html>