<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/register" method="post">
		<input type="text" name="username" placeholder="Enter Username" required><br>
		<input type="password" name="password" placeholder="Enter Password" required><br>
		<button type="submit">Register</button>
	</form>
</body>
</html>