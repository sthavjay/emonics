<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="emonics.hr.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<form action="EmployeeController" method="post">
			<p><b>Id:</b> &nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="id" value=${emp.id}> </p>
			<p><b>firstName:</b><input type="text" name="fname" value=${emp.fname}> </p>
			<p><b>lastName:</b><input type="text" name="lname" value=${emp.lname}> </p>
			<p><b>Salary:</b><input type="text" name="sal" value=${emp.salary}> </p>
			<input type="submit" name="b1" value="Save"> &nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" name="b1" value="FindById"> &nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" name="b1" value="Update">&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" name="b1" value="Delete">  &nbsp;&nbsp;&nbsp;&nbsp;
	</form>
	
</body>
</html>