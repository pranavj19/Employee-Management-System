 <jsp:include page="home.jsp"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
Employee Id:<input type="text" value=${empId } name="empId">
<br>
Employee Name:<input type="text" name="empName">
<br>
Employee Date:<input type="date" name="dt">
<br>
Employee Salary:<input type="number" name="sal">
<br>
Age:<input type="text" name="age">
<br>
<input type="submit" value="submit">


</form>

</body>
</html>