<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>

<fmt:setLocale value="vi_VN"/>
<fmt:setBundle basename="codes.gui" scope="request"/>

<body>
<fmt:formatNumber type="currency" value="${newMoney}" currencySymbol=""/> VND
<%--${newMoney} VND--%>
</body>
</html>
