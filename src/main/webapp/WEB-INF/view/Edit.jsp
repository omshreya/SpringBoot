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
	<form:form action="doEdit">
	<table>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr>
			<td>${id}</td>
		</tr>
		<tr>
			<td>${name}</td>
		</tr>
		<tr>
			<td>${salary}</td>
		</tr>
		<tr>
			<td>${dept}</td>
		</tr>
		<tr>
			<td>${age}</td>
		</tr>
	</table>
	<input type="submit" value="Edit" />
	<br/><br/>
	${message}
	</form:form>
</body>
</html>