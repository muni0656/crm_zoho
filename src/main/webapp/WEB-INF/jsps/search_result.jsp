<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Location</title>
</head>
<body>
<h2>All location List</h2>
<table>
<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Code</th>
		<th>Type</th>
		<th>Delete</th>
		<th>Update</th>
		
  </tr>
 <c:forEach items="${location}" var="location">
 <tr>
			 <td>${location.id}</td>
			 <td>${location.name}</td>
			 <td>${location.code}</td>
			 <td>${location.type}</td>
			 <td><a href="delete?id=${location.id}">delete</a></td>
			  <td><a href="update?id=${location.id}">update</a></td>
			 </tr>
 </c:forEach>
</table>

</body>
</html>