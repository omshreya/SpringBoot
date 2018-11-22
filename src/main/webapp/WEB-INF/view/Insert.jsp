<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="Emp" action="saveemp">
	<table>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr>
			<td><form:label path="name">Name</form:label></td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td><form:label path="salary">Salary</form:label></td>
			<td><form:input path="salary" /></td>
		</tr>
		<tr>
			<td><form:label path="dept">Department</form:label></td>
			<td><form:input path="dept" /></td>
		</tr>
		<tr>
			<td><form:label path="age">Age</form:label></td>
			<td><form:input path="age" /></td>
		</tr>
	</table>
	<input type="submit" value="Add Employee" />
	<br/><br/>
	${message}
	</form:form>
</body>
</html>