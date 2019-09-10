
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Employee</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

<h2><center>All Employee Information</center></h2>
<table class="w3-table w3-bordered w3-striped w3-border">
<tr class="w3-green">
<th>Employee Id</th>
<th>Employee Name</th>
<th>Date of Birth</th>
<th>Salary</th>
<th>Delete</th>
<th>Update</th>
</tr>
<c:forEach items="${empList }" var="emp">
<tr>
<td>${emp.empId}</td>
    <td>${emp.empName}</td>
    <td>${emp.dt}</td>
    <td>${emp.sal}</td>
    <td><a href='delete?empid=${emp.empId}' onclick="return confirm('Are you sure?')">Delete</a></td>
     <td><a href='update?empid=${emp.empId}'>Update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>