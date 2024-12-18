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

      <tr>
        <td>${email.language}</td>
        <td>${email.pageSize}</td>
        <td>${email.spamFilter ? 'Enabled' : 'Disabled'}</td>
        <td>${email.signature}</td>
      </tr>
  </table>
  </body>
</html>
