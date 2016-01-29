<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LogIn</title>
</head>
<body>

	<form action="loginActionServlet" method="post">
		<div class="inputblock">
			<label for="login">Login : </label> 
			<input type="text" name="login"	id="login">
		</div>
		<div class="inputblock">
			<label for="pass">Password : </label> 
			<input type="password" name="pass" id="pass">
		</div>
		<input type="submit" value="Envoyer">
	</form>

</body>
</html>