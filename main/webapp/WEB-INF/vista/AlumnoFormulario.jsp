<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Registro de alumnos</title>
</head>
<body>
	<form:form action="procesarFormulario" modelAttribute="alumno">
	Nombre:<form:input path="nombre"></form:input>
	<br>
	<br>
	Apellido:<form:input path="apellido"></form:input>
	<br>
	<br>
	<input type="submit" value="Enviar"/>
	</form:form>
</body>
</html>