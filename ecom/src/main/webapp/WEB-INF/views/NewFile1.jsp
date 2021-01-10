<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>How to iterate list on JSP in Spring MVC</h2>

	<p><b>Simple List:</b><p>
	
	${bookList}
	
	<ol>
		<c:forEach var="emp" items="${bookList}">
		
			<li>${emp.id}</li>
			<li>${emp.titel}</li>
			<li>${emp.auteur}</li>
			<li>${emp.afbeelding}</li>
			<li>${emp.omschrijving}</li>

		</c:forEach>
	</ol>

</body>
</html>