<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/12/2024
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Email List</title>
  </head>
  <body>
  <table border="1">
    <tr>
      <th>Language</th>
      <th>Page Size</th>
      <th>Spam Filter</th>
      <th>Signature</th>
    </tr>
    <c:forEach var="emails" items="${emailList}">
      <tr>
        <td>${emails.language}</td>
        <td>${emails.pageSize}</td>
        <td>${emails.spamFilter ? 'Enabled' : 'Disabled'}</td>
        <td>${emails.signature}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
