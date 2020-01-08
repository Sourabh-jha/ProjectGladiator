<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
margin: 0;
background-color: #f1f1f1;
width: 100%;
height: 100%;
}
.mainContainer{
position: absolute;
width: 100%;
height: 625px;
background-image: url('images/background.jpg');
}
.nav{
width: 100%;
height:100px;
}
.logo>p{
color: #fc3f1e;
font-size: 100px;
margin: 0;
margin-left: 20px;
opacity: 0.8;
 -webkit-animation: lgspin 5s infinite;
  animation: lgspin 5s infinite;
}
.logo{
width: 20%; 
padding: 0;
float: left;
}
@-webkit-keyframes lgspin {
 0%{ color: #fc3f1e;  }
 50%{ color: #f1f1f1; }
 100%{ color: #fc3f1e; } 
}

@keyframes lgspin {
  0%{ color: #fc3f1e;  }
 50%{ color: #f1f1f1; }
 100%{ color: #fc3f1e; } 
}
.navdiv{
float: left;
width: 78%;
margin-top: 40px;
margin-left: 20px;
text-align: center;
}
.navOp{
float: left;
padding-left: 20px;
font-size: 20px;
padding-right: 20px;
}
.navLink:hover{
font-size: 30px;
color: #fc3f1e;
}
.navLink{
text-decoration: none;
color: white;
-webkit-transition: font-size 1s; /* For Safari 3.1 to 6.0 */
  transition: font-size 1s;
}
.about{
margin-top: 100px;
width: 50%;
}
.about>h2,p{
color: white;
}
hr{
color: #fc3f1e;
background-color: #fc3f1e;
width: 80%;
height: 0.2px;
}
.open{
border: none;
border-radius: 5px;
padding: 10px 30px 10px 30px;
background-color: #fc3f1e;
color: black;
font-size: 20px;
cursor: pointer;
}
.open:hover{
background-color: #f1f1f1;
}
.opendiv{
margin-top: 30px;
margin-left: 44%;
}
/*Loader*/

.loader {
  visibility: hidden;
  margin-top: 120px;
  margin-left: 45%;
  margin-bottom: 5%;
  border: 16px solid #f3f3f3;
  border-radius: 50%;
  border-top: 16px solid blue;
  border-right: 16px solid green;
  border-bottom: 16px solid red;
  width: 120px;
  height: 120px;
  -webkit-animation: spin 2s linear infinite;
  animation: spin 2s linear infinite;
}

@-webkit-keyframes spin {
  0% { -webkit-transform: rotate(0deg); }
  100% { -webkit-transform: rotate(360deg); }
}

@keyframes spin {
  0% { transform: rotate(0deg); }
  100% { transform: rotate(360deg); }
}

/* /Loader */
.content>h2,p{
color: black;
}
.content{
display: none;
width: 50%;
height: 65%;
top: 15%;
left: 23%;
text-align: center;
color: black;
padding: 15px;
position: absolute;
border-radius: 8px;
background-color: white;
}
.close{
float: right;
right: 0%;
cursor: pointer;
font-size: 30px;
transform: translate(0%, -50%);
}
.maindiv{
widht: 80%;
height: 50px;
}
.leftdiv{
float: left;
margin-left: 25px;
margin-top: 30px;
width: 50%;
}
.slogan{
float: left;
width: 50%;
position: absolute;
top: 30%;
left: 40%;
bottom: 30%;
}
</style>
<script>
function myFunction() {
	document.getElementById("loader").style.visibility="visible";
	var adu = document.getElementById("golmaal");
	adu.play();
    setTimeout(function(){ window.location.href = "openAccount.jsp"; }, 10000);
}
function displayAbout(){
	document.getElementById("about").style.display="block";
	document.getElementById("mainContainer").style.filter="brightness(30%)";
	document.getElementById("navLink").href="";
}
function closebtn(){
	document.getElementById("about").style.display="none";
	document.getElementById("mainContainer").style.filter="brightness(100%)";
}
</script>
<body>

<!-- MAIN CONTAINER -->
<div class="mainContainer" id="mainContainer">
<div class="nav">
<div class="logo"><p>HPB</p></div>
<div class="navdiv">
<div class="navOp"><a class="navLink" href="index.jsp">Home</a></div>
<div class="navOp"><a class="navLink" href="#about" onclick="displayAbout()">About</a></div>
<div class="navOp"><a class="navLink" href="login.jsp">Login</a></div>
<div class="navOp"><a class="navLink" href="registrationUser.jsp">Register</a></div>
</div>
</div>
<hr>

<!-- SLOGAN DIV -->
<div class="maindiv">
<div class="leftdiv">
<video width="420" height="340" controls loop>
  <source src="video/25din.mp4" type="video/mp4">
 </video> 
 </div>
<div class="slogan">
<p style="color: #f1f1f1; font-size: 300%; line-height: 0.9;"><span><strong style="font-size: 180%; color: #f1f1f1;">"</strong><strong style="font-size: 180%; color: #fc3f1e;">25</strong></span>Din<br />
Me Paisa Double<strong style="font-size: 180%; color: #fc3f1e;">"</strong></p>
</div>
</div>
<!-- /SLOGAN DIV -->

<!-- LOADER DIV -->
<div class="loader" id="loader"></div>
<!-- /LOADER DIV -->
<audio style="display: none;" id="golmaal" controls>
  <source src="audio/Golmaal.mp3" type="audio/mpeg">
</audio>
<!-- OPEN ACCOUNT DIV -->
<div class="opendiv"><button class="open" onclick="myFunction()">Open Account</button></div>
<!-- /OPEN ACCOUNT DIV -->

</div>
<!-- /MAIN CONTAINER -->

<!-- ABOUT BLOCK -->
<div class="content" id="about">
<a onclick="closebtn()"><span class="close">&times;</span></a>
<h2>About</h2>
<hr style="height: 0.5px; color: #f1f1f1;">
<p>Ek Mast Scheme hai hamare paas..."25 din me paisa double"</p>
<h4 style="color: red;">Paisa ho to kuch nai ho sakta hai bhau...</h4>
<p><h2>Our Vision</h2></p>
<img src="images/baburao.jpg" width="12%" height="20%">
<h2 style="color: #fc3f1e;">"Pehle ek aankh bechunga, phir ek kidney...phir ek aankh ek kidney"</h2>
<h3>"Is tarah pura shareer bech dunga..."</h3>
</div>
<!-- /ABOUT BLOCK -->

</body>
</html>