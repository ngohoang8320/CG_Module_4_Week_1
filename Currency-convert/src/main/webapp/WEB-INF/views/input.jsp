<%--
  Created by IntelliJ IDEA.
  User: Bap
  Date: 4/5/2024
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Currency Convert</title>
</head>
<body>
<form action="/convert" method="get">
    <span><input type="number" name="money"></span>
    <span>$</span>
    <button type="submit">Convert to VND</button>
</form>
</body>
</html>
