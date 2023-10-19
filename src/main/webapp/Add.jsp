<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <!-- Author: Ruth Ann Aakre  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Actor</title>
</head>
<body>
	<form action = "addActor" method = "post">
		Actor Name:<input
			type = "text" name = "name" size = "25"/>
			Birthday:<input
			type = "text" name = "birthday" size = "25"/>
			Academy Awards:<input
			type = "text" name = "academyAwards" size = "25"/>
			<input type="submit" value="Add Actor" />
	</form>
</body>
</html>