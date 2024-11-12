<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/11/2024
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Trang danh sách </h1>
<a href="/students/create">Thêm mới học sinh</a>

<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Detal1</td>
        <td>Detal2</td>
    </tr>
    <c:forEach items="${studentList}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
<%--            <td>--%>
<%--                <a href="/students/detail?id=${s.id}">Detail</a>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="/students/${s.id}/detail">Detail</a>--%>
<%--            </td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
