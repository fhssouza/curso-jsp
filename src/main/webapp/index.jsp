<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso JSP</title>
</head>
<body>

	<h1>Bem vindo ao curso do JSP</h1>

	<form action="ServletLogin" method="post">
	<input type="hidden" value="<%= request.getParameter("url")%>" name="url">
		<table>
			<tr>
				<td><label>Login:</label></td>
			</tr>
			<tr>
				<td><input name="Login" type="text"></td>
			</tr>
			<tr>
				<td><label>Senha:</label></td>
			</tr>
			<tr>
				<td><input name="Senha" type="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="enviar"></td>
			</tr>
		</table>
	</form>
	<h4>${msg}</h4>
</body>
</html>