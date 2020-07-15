<%--
  Created by IntelliJ IDEA.
  User: Radomyr
  Date: 6/4/2020
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${sessionScope.language}"/>
<fmt:setBundle basename="resources"/>

<html lang="${language}">
<head>
    <meta charset="UTF-8">
    <title>header</title>
    <link href="../styles.css" rel="stylesheet">
</head>
<body>
<div class="header">
    <div class="header_content_3pc"></div>

    <a href="/GetIndexPageServlet" title="go to start page">
        <div class="header_content_3pc"><span id="logo_text">Orders Application</span><br>
            <span id="text_under_the_logo"> Dear friend! Let's work with orders</span>
        </div>

    </a>
    <!--<div class="header_content_3pc">

        <a href="/LogoutServlet">
            <div id="logout_container"><span id="text_right_the_logo"> ${message_for_logout}</span></div>
        </a>
        <div id="near_logout_container"><span class="text_right_the_logo4">${message_with_name_of_user}${actual_user.name}</span><br>
            <a href="/GetAdminPageServlet"><div id="admin_page_container"><span id="text_right_the_logo2">${admin_role}</span></div></a>
        </div>


    </div>-->
</div>

</body>
</html>
