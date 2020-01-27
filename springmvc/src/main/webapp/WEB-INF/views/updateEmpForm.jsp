<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String msg = (String) request.getAttribute("msg");
	String errMsg = (String) request.getAttribute("errMsg");
	
%>
<jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<h2 style="color: orange;">
		<%=errMsg%></h2>
	<%
		}
	%>
	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h2 style="color: orange;">
		<%=msg%></h2>
	<%
		}
	%>

	<fieldset style="width: 300px">
		<legend>Update Employee Record</legend>
		<div style="text-align: center;">
			<form action="./updateEmp" method="post">
				<table>


					<tr>
						<td>Employee ID</td>
						<td>:</td>
						<td><input type="number" name="empId" ></td>
					</tr>


					<tr>
						<td>Employee Name</td>
						<td>:</td>
						<td><input type="text" name="empName" ></td>
					</tr>

					<tr>
						<td>Designation</td>
						<td>:</td>
						<td><input type="text" name="designation" ></td>
					</tr>


					<tr>
						<td>Salary</td>
						<td>:</td>
						<td><input type="text" name="salary"></td>
					</tr>
					
						<tr>
						<td>Blood Group</td>
						<td>:</td>
						<td><input type="text" name="bloodgrp"></td>
					</tr>
					
						<tr>
						<td>Email Id</td>
						<td>:</td>
						<td><input type="email" name="mailId"></td>
					</tr>
					

					<tr>
						<td>Mobile Number</td>
						<td>:</td>
						<td><input type="number" name="empMobileNo"></td>
					</tr>
					
					<tr>
						<td>Manger ID</td>
						<td>:</td>
						<td><input type="number" name="managerId" ></td>
					</tr>
					
					<tr>
						<td>Department Id</td>
						<td>:</td>
						<td><input type="number" name="deptId" ></td>
					</tr>
					
						<tr>
						<td>Date of Birth</td>
						<td>:</td>
						<td><input type="date" name="dob" ></td>
					</tr>
					
						<tr>
						<td>Date of Join</td>
						<td>:</td>
						<td><input type="date" name="doj" required></td>
					</tr>

					<tr>
						<td><input type="submit" value="Add"
							style="margin-left: 98px; width: 100px"></td>
					</tr>
				</table>
			</form>
		</div>
	</fieldset>
</body>
</html>

<jsp:include page="footer.jsp"></jsp:include>