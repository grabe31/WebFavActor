<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Roles</title>
</head>
<body>
	List of all Roles:
	<table>
		<c:forEach items="${requestScope.allRoles}" var="currentRole">
			<tr>
				<td>${currentRole.actor}|</td>
				<td>${currentRole.charName}|</td>
				<td>${currentRole.movieName}|</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="Index.jsp">Home</a>

</body>
</html>