<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hibernate Demo 1</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<a href="getnewprod">Add Product</a>

	<form action="searchbyproduct" method="get">
		<input type="text" name="product"> <input type="submit"
			value="Search">
	</form>


	<table border="1">
		<c:forEach var="myVar" items="${list}">
			<tr>
				<td>${myVar.id}</td>
				<td>${myVar.firstName}</td>
				<td>${myVar.lastName}</td>

			</tr>

		</c:forEach>

	</table>
</div>
</body>
</html>