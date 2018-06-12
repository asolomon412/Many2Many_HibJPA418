<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update</title>
</head>
<body>

	<h1>Update Person</h1>
	<form action="formupdate" method="post">
		ID: ${id} <br> 
		<input type="hidden" name="id" value="${id }"><br> 
		Name: <input type="text" name="name"><br> 
		Location: <input type="text" name="loc"><br> 
		<input type="submit" value="Submit">
	</form>
</body>
</html>