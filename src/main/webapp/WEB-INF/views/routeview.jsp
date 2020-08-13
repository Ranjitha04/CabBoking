<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	

		<table style="with: 80%">
			<tr>
				<th>Source</th>
				<th>Destination</th>
				<th>Action</th>
			</tr>
		
			<c:forEach items="${rList}" var="route">
				<tr>
					<td>${route.source}</td>
					<td>${route.destination}</td>
				</tr>
			</c:forEach>

		</table>


</body>
</html>