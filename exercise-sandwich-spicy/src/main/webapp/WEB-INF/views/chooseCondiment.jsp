<%--
  Created by IntelliJ IDEA.
  User: Bap
  Date: 4/10/2024
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Show</title>
</head>
<body>
<form:form modelAttribute="customer" action="/choose/result">
    <h1>Sandwich Condiments</h1>
    <form:checkboxes path="chosen" items="${sandwichList}"></form:checkboxes><br>
    <hr>
    <button type="submit">Save</button>
</form:form>
</body>
</html>
