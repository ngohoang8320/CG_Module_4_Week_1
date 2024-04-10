<%--
  Created by IntelliJ IDEA.
  User: Bap
  Date: 4/10/2024
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="param" action="/calculator" method="get">
    <form:input path="num1"></form:input>
    <form:input path="num2"></form:input><br>
    <form:button name="button" value="add">Add(+)</form:button>
    <form:button name="button" value="sub">Sub(-)</form:button>
    <form:button name="button" value="mul">Mul(X)</form:button>
    <form:button name="button" value="div">Div(/)</form:button>
</form:form>

<span>Result: ${result}</span>
</body>
</html>
