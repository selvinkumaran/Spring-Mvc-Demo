<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentForm</title>
</head>
<body>
<h1>All User details<h1>
	<h2>Name: ${user.name}</h2>
	<h2>Email: ${user.email}</h2>
	<h2>Password: ${user.password}</h2>
	<h2>BloodGroup: ${user.bloodGroup}</h2>
	<h2>Operating System: ${user.os}</h2>
	<h2>Favorite Language:</h2>
	<ul>
		<c:forEach var="lan" items="${user.language}">
			<li>${lan}</li>
		</c:forEach>
	</ul>
	<a href="login">Go Back</a>
</body>
</html>