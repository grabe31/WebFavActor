<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Role</title>
</head>
<body>


	<form action="updateRole" method="post">
		New Character Name: <input type="text" name="charName" size="25" />
		New Movie Name: <input type="text" name="movieName" size="25" /> 
		New Actor Name: <input type="text" name="actorName" size="25" /> <br>
		<br>
		Enter the current character name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</body>
</html>