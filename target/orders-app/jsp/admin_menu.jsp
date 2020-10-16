<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 7/15/2020
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${sessionScope.language}"/>
<fmt:setBundle basename="admin_page_msg"/>

<html>
<head>
    <meta charset="UTF-8">
    <title>Orders App - admin menu</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<div class="maincontent_menu">
    <H3>Admin menu</H3>
    <ul>
        <li><a href="/CreateClientsTableServlet">Create table CLIENTS</a></li>
        <li><a href="/CreateUsersTableServlet">Create table USERS</a></li>
        <li><a href="/InsertTestDataClientsTableServlet">Fill in table Clients</a></li>
        <li><a href="/InsertTestDataUsersTableServlet">Fill in Users Table</a></li>
        <li><a href="/jsp/user_page.jsp">Show user's page</a></li>

    </ul>
</div>
</body>
</html>
