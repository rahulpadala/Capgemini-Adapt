<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/MVCassignment/q3an" method="post">
		<table>
			<tr>
				<td>User Name: <input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>Password : <input type="password" name="password"/></td>
			</tr>
			<tr>
				<td>E-Mail : <input type="email" name="email"/></td>
			</tr>
		</table>
		
		<p><input type="submit" value="Log In"/></p>

	</form>
</body>
</html>