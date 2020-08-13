<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:form action="/cab/login" method="post" modelAttribute="cred">
		<table style="with: 80%">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><input type="date" name="date" pattern="dd-MM-yyyy"/></td>
			</tr>
		</table>
		<input type="submit" value="Login" />
	</c:form>

</body>
</html>