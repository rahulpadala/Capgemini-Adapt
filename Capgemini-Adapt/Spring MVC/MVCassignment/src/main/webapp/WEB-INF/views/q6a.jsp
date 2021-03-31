<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>

<body>
	<form:errors path="ob.*" />
	<form action="/MVCassignment/q6an" method="post">
		<table>
			<tr>
				<td>User Name: <input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>password : <input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>email: <input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>Contact : <input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>City : <select name="city">
						<option value="pune">Pune</option>
						<option value="chennai">Chennai</option>
						<option value="hyd">Hyderabad</option>
						<option value="Bng">Banglore</option>
						<option value="mumbai">Mumbai</option>
				</select></td>
			</tr>
			<tr>
				<td>Zipcode: <input type="text" name="zipcode" /></td>
			</tr>
		</table>

		<p>
			<input type="submit" value="Register">
		</p>
		
	</form>
</body>
</html>