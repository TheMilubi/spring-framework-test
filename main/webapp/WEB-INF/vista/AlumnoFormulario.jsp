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
	Nombre: <form:input path="nombre"></form:input> <form:errors path="nombre"></form:errors>
	<br>
	
	<br>
	Apellido: <form:input path="apellido"></form:input>
	<br>
	<br>
	Asignaturas optativas: <form:select path="optativa">
		<form:option value="Diseño">Diseño</form:option>
		<form:option value="Karate">Karate</form:option>
		<form:option value="Comercio">Comercio</form:option>
		<form:option value="Danza">Danza</form:option>
	
	</form:select>
	<br>
	<br>
	Ciudad de Estudios: <br>
	<form:radiobutton path="ciudadEstudios" value="Barcelona"/>Barcelona <br>
	<form:radiobutton path="ciudadEstudios" value="Madrid"/>Madrid <br>
	<form:radiobutton path="ciudadEstudios" value="Valencia"/>Valencia <br>
	<form:radiobutton path="ciudadEstudios" value="Bilbao"/>Bilbao <br>
	<br>
	<br>
	Idiomas: <br>
	<form:checkbox path="idiomas" value="Inglés"/>Inglés <br>
	<form:checkbox path="idiomas" value="Francés"/>Francés <br>
	<form:checkbox path="idiomas" value="Alemán"/>Alemán <br>
	<form:checkbox path="idiomas" value="Chino"/>Chino <br>
	<br>
	<br>
	Edad: <form:input path="edad"/> <form:errors path="edad"></form:errors>
	<br>
	<br>
	Email: <form:input path="email"/> <form:errors path="email"></form:errors>
	<br>
	<br>
	CP: <form:input path="codigoPostal"/> <form:errors path="codigoPostal"></form:errors>
	<br>
	<br>
	<input type="submit" value="Enviar"/>
	</form:form>
	
	
</body>
</html>