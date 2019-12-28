<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style/openAccount.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="header">
		<h1>Open a Savings Account</h1>
	</div>
	<div id="nav">
		<h3>Personal details</h3>
	</div>
	<div class="form">
		<form action="openAccount.lti" method="POST">
			<table align="center" cellpadding="15">
				<tr>
					<td><b>Title :</b>
					<td><select name="Usertitle">
							<option value="Mr" name="Usertitle">Mr</option>
							<option value="Ms" name="Usertitle">Ms</option>
							<option value="Mrs" name="Usertitle">Mrs</option>
					</select></td>
				</tr>
				<tr>
					<td><b>FirstName:</b></td>
					<td><input type="text" placeholder="FirstName"
						name="Userfirstname" size="20" required><br></td>
				</tr>

				<tr>
					<td><b>Enter MiddleName:</b></td>
					<td><input type="text" placeholder="MiddleName"
						name="Usermiddlename" size="20"><br></td>
					
				</tr>
				<tr>
					<td><b>Enter LastName:</b></td>
					<td><input type="text" placeholder="LastName" name="Userlastname"
						size="20" required><br></td>
				</tr>
				<tr>
					<td><b>FathersName:</b></td>
					<td><input type="text" placeholder="Enter FatherName"
						name="Userfathername" size="20" required></td>
				</tr>
				<tr>
					<td><b>Mobile Number:</b></td>
					<td><input type="number" placeholder="Enter MobileNumber"
						name="UsermobileNo" size="20" required><br></td>					
				</tr>
				<tr>
					<td><b>Email Id:</b></td>
					<td><input type="email" placeholder="Enter EmailId"
						name="UseremailId" size="20" required><br></td>
				</tr>
				<tr>
					<td><b>AdharCard Number:</b></td>
					<td><input type="text" placeholder="Enter AdharCard Number"
						name="UseraadharNo" size="20" required><br></td>
				</tr>
				<tr>
				<td><b>Date-Of-Birth :</b></td>
				<td><input type="date" name="Userdob" size="20" required><br></td>
				</tr>
				<!-------------------------------------------------------------------- -------------------------- -->
				
				<tr>
					<td><b><u>Residential Address:</u></b></td>
				</tr>


				<tr>
					<td><b> Address Line 1:</b></td>
					<td><input type="text" placeholder="Enter FlatNo. and Building Name"
						name="addressLine1" size="50" required></td>
				</tr>
				
				<tr>
					<td><b> Address Line 2:</b></td>
					<td><input type="text" placeholder="Enter Locality"
						name="addressLine2" size="50" required></td>
				</tr>
				
				<tr>
					<td><b> Landmark</b></td>
					<td><input type="text" placeholder="Enter Landmark"
						name="landmark" size="30" required></td>
				</tr>
				
				<tr>
					<td>
					<b>State :</b>
					<td><select>
							
							
	<option value="Andaman and Nicobar Islands" name="state">Andaman and Nicobar Islands</option>
	<option value="Andhra Pradesh" name="state">Andhra Pradesh</option>
	<option value="Arunachal Pradesh" name="state">Arunachal Pradesh</option>
	<option value="Assam" name="state">Assam</option>
	<option value="Bihar" name="state">Bihar</option>
	<option value="Chandigarh" name="state">Chandigarh</option>
	<option value="Chhattisgarh" name="state">Chhattisgarh</option>
	<option value="Dadra and Nagar Haveli" name="state">Dadra and Nagar Haveli</option>
	<option value="Daman and Diu" name="state">Daman and Diu</option>
	<option value="Delhi" name="state">Delhi</option>
	<option value="Goa" name="state">Goa</option>
	<option value="Gujarat" name="state">Gujarat</option>
	<option value="Haryana" name="state">Haryana</option>
	<option value="Himachal Pradesh" name="state">Himachal Pradesh</option>
	<option value="Jammu and Kashmir" name="state">Jammu and Kashmir</option>
	<option value="Jharkhand" name="state">Jharkhand</option>
	<option value="Karnataka" name="state">Karnataka</option>
	<option value="Kerala" name="state">Kerala</option>
	<option value="Lakshadweep" name="state">Lakshadweep</option>
	<option value="Madhya Pradesh" name="state">Madhya Pradesh</option>
	<option value="Maharashtra" name="state">Maharashtra</option>
	<option value="Manipur" name="state">Manipur</option>
	<option value="Meghalaya" name="state">Meghalaya</option>
	<option value="Mizoram" name="state">Mizoram</option>
	<option value="Nagaland" name="state">Nagaland</option>
	<option value="Orissa" name="state">Orissa</option>
	<option value="Pondicherry" name="state">Pondicherry</option>
	<option value="Punjab" name="state">Punjab</option>
	<option value="Rajasthan" name="state">Rajasthan</option>
	<option value="Sikkim" name="state">Sikkim</option>
	<option value="Tamil Nadu" name="state">Tamil Nadu</option>
	<option value="Telangana" name="state">Telangana</option>
	<option value="Tripura" name="state">Tripura</option>
	<option value="Uttaranchal" name="state">Uttaranchal</option>
	<option value="Uttar Pradesh" name="state">Uttar Pradesh</option>
	<option value="West Bengal" name="state">West Bengal</option>
								
					</select></td></tr>
					
					
					<tr>
					</td>
				
				<tr>
					<td>
					<b>City:</b>					
					<td><input type="text" placeholder="Enter City"
						name="city" size="30" required><br></td>
					</td>
				</tr>
				
				
				<tr>
					<td>
					<b>PiNCode:</b>
					<td><input type="number" placeholder="Enter Pincode"
						name="pincode" size="20" required><br></td>
					</td>
				</tr>
				<!-------------------------------------------------------------------- -------------------------- -->

				<tr>
					<td><b><u>Occupation Details:</u></b></td>
				</tr>
				<tr>
					<td>
					<b>OccupationType:</b></td>
					<td><input type="text" placeholder="Enter OccupationType"
						name="UserOccupation" size="20" required><br></td>
				</tr>
				<tr>
					<td><b>Gross Annual Income:</b></td>
					<td><input type="number" placeholder="Enter Income"
						name="Userincome" size="20" required><br></td>
				</tr>
				
				<tr></tr>

				<tr>
					<td><b><u>Debit/Atm Card </u></b></td>
				</tr>

				<tr>
					<td><input type="checkbox" name="UsernetBanking"
						value="YES"> &nbsp <b>Opt For Net Banking
					</b></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="agree" value="agree">
						&nbsp <b>I agree</b></td>
				</tr>





				<!--  			<tr>
					<td><b>Gender:</b>
					<td><input type="radio" name="gender" value="Male" size="20">Male
						<input type="radio" name="gender" value="Female" size="20">Female<br></td>
				</tr>
-->
			</table>

			<button class="button" style="vertical-align: middle">
				<span>Submit </span>
			</button>
		</form>
	</div>

	<div
		style="background-color: black; color: white; text-align: center; padding: 10px; margin-top: 800px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">Copyright
		© 2019 Axis Bank</div>



</body>
</html>