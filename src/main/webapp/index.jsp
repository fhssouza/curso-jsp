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
		<label>Nome:</label>
		<input name="nome"> 
		<label>Idade:</label>
		<input name="idade"> 
		<input type="submit" value="enviar">
	</form>
</body>
</html>