<%@page import="com.bcits.empwebservlet.bean.BeanClass"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	List <BeanClass> employeeList = (List <BeanClass>) request.getAttribute("employeeLists");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		if (employeeList != null) {
	%>
	<table border="1" style="width: 80%"></table>
	<thead style="background: navy; color: white;">
		<tr style="height: 35px">
			<th>Employee ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Designation</th>
		</tr>
	</thead>

	<tbody>
	<% for(BeanClass empInfo : employeeList ) %>
	<%-- <tr><%=empInfo.g %>
 --%>



	</tbody>

	<%
		} else {
	%>
	<h2 style="color: red">No Records to Display</h2>
	<%
		}
	%>>
</body>
</html>