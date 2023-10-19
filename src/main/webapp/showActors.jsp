<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Actors</title>
</head>
<body>
	List of all Actors and Roles:
	<table>
		<c:forEach items="${requestScope.allActors}" var="currentActor">
			<tr>
				<td>${currentActor.name}|</td>
				<td>${currentActor.birthday}</td>
				<td>${currentActor.academyAwards}</td>
				
				
			</tr>
			<c:forEach items="${currentActor.roles}" var="currentRole">
					<tr>
						<td>${currentHero.charName}|</td>
						<td>${currentHero.movieName}|</td>
					</tr>
				</c:forEach>
		</c:forEach>
	</table>
	<br />
	<a href="Index.jsp">Home</a>

</body>
</html>