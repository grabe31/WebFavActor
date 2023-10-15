<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Role</title>
</head>
<body>
		<form action = "addRole" method = "post">
		Actor Name: <input type = "text" name = "actor" size = "25"/>
		Character Name:<input type = "text" name = "charName" size = "25"/>
			Movie Name<input type = "text" name = "movieName" size = "25"/>
			<input type="submit" value="Add Role!" />
	</form>
</body>
</html>