
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%  String msg = (String) request.getAttribute("msg"); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Login Here</legend>
		<form action="./adminLogin" method="post">
			<table>
				<tr>
					<td>Admin Id : </td>
					<td><input type="number" name="adminId" required></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br> <input type="submit"
						value="login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	
		<% if(msg != null && !msg.isEmpty()) {  %>
	<h3 style="color: maroon;"><%=msg  %></h3>
	<% } %>
	
	</body>
</html>