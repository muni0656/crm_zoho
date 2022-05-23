<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create | location</title>
</head>
<body>
	<h2>create | location</h2>
	<hr>
	<form action="saveLocation" method="post">
	<pre>
      Id <input type="text" name="id"/>
	  Name <input type="text" name="name"/>
	  Code <input type="text" name="code"/>
	  Type:
	  urban <input type="radio" value="urban"name="type"/>
	  rural <input type="radio" value="rural"name="type"/>
	  <input type ="submit" value="save"/>
	
	
	</pre>
	
	
</form>
${msg}
	
	
</body>
</html>