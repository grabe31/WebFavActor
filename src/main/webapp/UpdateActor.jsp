<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Actor</title>
</head>
<body>


	<form action="updateActor" method="post">
		New Name: <input type="text" name="newName" size="25" />
		New Birthday: <input type="text" name="birthday" size="25" /> 
		New Academy Awards: <input type="text" name="academyAwards" size="25" /> 
		<br>
		<br>
		Enter the current Actor name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</body>
</html>