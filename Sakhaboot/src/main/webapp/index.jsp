 <jsp:include page="home.jsp"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><center>EMPLOYEE DETAILS</center></h1>
<form action="employee" method="post" >
Employee Name:<input type="text" name="empName">
<br><br>
Employee Date of Birth:<input type="date" name="dt">
<br><br>
Employee Salary:<input type="number" name="sal">
<br><br>
Employee Age:<input type="text" name="age">
<br><br>
<input type="submit" value="submit">
</form>
</body>