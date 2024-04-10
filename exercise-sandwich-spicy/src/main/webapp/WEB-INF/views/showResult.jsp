<%--
  Created by IntelliJ IDEA.
  User: Bap
  Date: 4/10/2024
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>You've chosen:</h1>
<c:forEach items="${customer.chosen}" var="choose">
    <span>${choose}, </span>
</c:forEach>
</body>
</html>
