<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Radosvit Orders</title>
    <link href="styles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="jsp/header.jsp"/>
<div class="maincontent">
    <p>Let's start work with orders</p>
    <h3>Choose Your Language:</h3>
    <form method="post" action="/GetLanguageServlet">
        <!--<label for="language">Choose Your Language:</label>-->
        <select id="language" name="lang">
            <option value="ukr">українська</option>
            <option value="eng">english</option>
        </select><br><br>
        <input type="submit" value="OK">
    </form>
</div>
</body>
</html>
