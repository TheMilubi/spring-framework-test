<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro del alumno</title>
</head>
<body>
El alumno con nombre ${alumno.nombre}, apellido ${alumno.apellido}, edad ${alumno.edad} años, email ${alumno.email} y domicilio en el CP ${alumno.codigoPostal} se ha registrado con éxito.
<br>
La asignatura escogida es: ${alumno.optativa}
<br>
La ciudad donde iniciará los estudios el alumno es: ${alumno.ciudadEstudios}
<br>
El alumno ha escogido realizar sus estudios en estos idiomas: ${alumno.idiomas}
</body>
</html>