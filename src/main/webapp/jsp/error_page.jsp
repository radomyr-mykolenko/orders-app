<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 7/28/2020
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Orders Application - error page</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../jsp/header.jsp"/>
<div class="maincontent">
    <h2>Something gone wrong ${requestScope.type_of_error}</h2>

</div>
</body>
</html>
