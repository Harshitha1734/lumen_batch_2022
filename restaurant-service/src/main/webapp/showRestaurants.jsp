<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Students</title>
<style>
table,tr,td,th{
border:2px solid black;
margin-left:auto;
margin-right:auto;
border-collapse:collapse;
}
h1{
text-align:center;
}
</style>
</head>
<body>
<h1>Restaurants</h1>
<table>
	<thead>
		<tr>
			<th>Restaurant ID</th>
			<th>Restaurant Name</th>
			<th>Pincode</th>
			<th>Cuisine</th>
		</tr>
	</thead>
<tbody>
<c:forEach items="${list}" var="each">
<tr>
		<td>${each.id}</td>
		<td>${each.restaurantName}</td>
		<td>${each.pincode}</td>
		<td>${each.cuisine}</td>
		
	</tr>
</c:forEach>
	
</tbody>
</table>
</body>
</html>