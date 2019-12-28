<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Gateway</title>
<link rel="stylesheet" type="text/css" href="style/paymentGateway.css">
</head>
<body>
<%@page import="java.io.*, java.util.*, java.sql.*"%>
<%!
private Connection conn = null;
public void jspInit(){
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "banking", "banking");
	System.out.println("Connected:" + conn);
	} catch (ClassNotFoundException e) {
	System.err.println("ShowLogin_Servlet->unable to load the JDBC Driver...");
	} catch (SQLException e) {
	System.err.println("ShowLogin_Servlet->unable to establish the database connection...");
	}
}
%>
<div class="mainDiv">
    <div class="main">
    <div style="width: 100%; text-align: right;">
            <a href="#"><p class="closebtn">+</p></a>
    </div>
    <h1>Payment Gateway</h1>
    <%
    int accountNo = Integer.parseInt(request.getParameter("AccountNo"));
    int amount = Integer.parseInt(request.getParameter("amount"));
	String SQL = "SELECT * FROM USER_DETAILS where ACCOUNTNO=?";
	StringBuffer strHTML = new StringBuffer();

	try {
	PreparedStatement pstat = conn.prepareStatement(SQL);
	pstat.setInt(1, accountNo);

	ResultSet rs = pstat.executeQuery();
	String name = rs.getString("FNAME");
	%>
    	<form action="paymentGateway.lti" method="post">
    		<input type="text"  name="fromAccount" style="margin-top: 20px;" placeholder="Enter Account No"><br> <br /> 
    		<input type="text"  name="toAccount" value="<%= accountNo %>" placeholder="<%= name %>"><br> <br /> 
            <input type="number" name="amount" value="<%= amount %>" placeholder="Enter Amount"><br> <br />
            <button type="submit" name="confirm" class="submit">Get OTP</button>
    	</form>
    <%
	rs.close();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	%>
    </div>
 </div>

</body>
</html>