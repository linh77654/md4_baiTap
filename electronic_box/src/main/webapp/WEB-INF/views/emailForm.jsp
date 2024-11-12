<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Email Settings</title>
</head>
<body>
<form:form modelAttribute="email" action="${pageContext.request.contextPath}/email/emailList" method="post">
    <table>
        <tr>
            <td>Language</td>
            <td>
                <form:select path="language">
                    <form:option value="English">English</form:option>
                    <form:option value="Vietnamese">Vietnamese</form:option>
                    <form:option value="Japanese">Japanese</form:option>
                    <form:option value="Chinese">Chinese</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Page size</td>
            <td>
                <form:select path="pageSize">
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="25">25</form:option>
                    <form:option value="50">50</form:option>
                    <form:option value="100">100</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Spam Filter:</td>
            <td><form:checkbox path="spamFilter"/></td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td><form:textarea path="signature" rows="2" cols="30"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"/></td>
            <td><form:button onclick="location.href='${pageContext.request.contextPath}/email/emailList'">Cancel</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
