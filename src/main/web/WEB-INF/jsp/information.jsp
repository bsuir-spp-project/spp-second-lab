<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Information</title>
</head>
<body>
    <c:set var="data" value="${requestScope.result}" />
    <%--<c:set var="list" value="${data.elements}" />
    <c:forEach items="${list}" var="item">
        ${data.toString()}
    </c:forEach>--%>

    <br><br>
    <hr>
    ${data.toString()}
</body>
</html>
