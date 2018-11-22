<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="cmd" action="saveemp">
		<center>
		<table border="2px">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Salary</td>
			<td>Department</td>
			<td>Age</td>
		</tr>
		<c:forEach var="d" items="${empList}">
		<tr>
			<td>${d.id}</td>
			<td>${d.name}</td>
			<td>${d.salary}</td>
			<td>${d.dept}</td>
			<td>${d.age}</td>
			<td><a href="doDelete?id=${d.id}">Delete</a></td>
			<td><a href="doEdit?id=${d.id}">Edit</a></td>
		</tr>
		</c:forEach>
		</table>
		<br/><br/><br/><br/>
		<input type="submit" value="Insert"><a href="doSearch">Search Record</a>
		</center>
	</form:form>
</body>
</html>