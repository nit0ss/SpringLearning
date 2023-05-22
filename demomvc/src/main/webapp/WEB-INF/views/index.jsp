<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.cris.model.User" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ejemplo de página JSP</title>
</head>
<body>
    <h1>Hola ${user.name}</h1>
	<h1>Información del usuario:</h1>
	<p>Nombre: ${user.name}</p>
	<p>Email: ${user.mail}</p>

</body>
</html>
