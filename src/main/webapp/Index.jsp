<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Actors Welcome!</title>
</head>
<body>
	<h1>Here is the actor information!</h1>
 
	<form action="showRoles" method="get">
		<input type="submit" value="Show Roles" />
		</form>

	
	<a href= "Add.jsp">Add Actor</a>
	<a href= "AddRole.jsp">Add Role</a>
	<a href= "updateRole.jsp">Update Role</a>
	<a href = "RemoveRole.jsp">Remove Role</a>
	
	<br>
	<br>
	<form action="ShowActors" method="get">
		<input type="submit" value="Show Actors" />
	</form>
	<a href= "Add.jsp">Add Actor</a>
	<a href = "UpdateActor.jsp">Update Actor</a>
	<a href = "RemoveActor.jsp">Remove Actor</a>
	
</body>
</html>