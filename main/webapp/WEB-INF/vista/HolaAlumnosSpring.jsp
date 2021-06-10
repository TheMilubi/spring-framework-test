<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/mi-estilo.css"/>

</head>
<body>
<p>
Hola ${param.nombreAlumno}. Bienvenido al curso de Spring.
</p>
<h2>Atención todos</h2>
<p>${mensajeClaro}</p>

<img alt="java" src="${pageContext.request.contextPath}/recursos/imgs/java.jpg">

</body>
</html>