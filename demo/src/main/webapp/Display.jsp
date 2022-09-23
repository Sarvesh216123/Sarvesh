<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Employee Details</h1>

<table>
    <c:forEach items="${ee}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.id}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>