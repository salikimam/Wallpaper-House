<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- Success message (e.g. after logout) --%>
<c:if test="${not empty message}">
    <p style="color:green;">${message}</p>
</c:if>
	<form action="/login" method="POST">
	    <input type="text" name="username" placeholder="Enter username" required/><br>
	    <input type="password" name="password" placeholder="Enter password" required/><br>
	    <button type="submit">Login</button>
	</form>
	<p>Don't have an account?</p><a href="/register-page">Register here</a>
<%-- Error message(e.g. wrong again) --%>
<c:if test="${not empty error}">
	<p style="color:red;">${error}</p>
</c:if>
</body>
</html>