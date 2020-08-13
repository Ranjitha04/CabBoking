<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:form action="/cab/addusers" method="post" modelAttribute="user">
		<table style="with: 80%">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>PhoneNO</td>
				<td><input type="text" name="phoneNo" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" /></td>
			</tr>
		</table>
		<input type="submit" value="Register" />
	</c:form>
</body>
</html>