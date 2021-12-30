<%--
  Created by IntelliJ IDEA.
  User: LsCat
  Date: 2021/12/29
  Time: 14:19
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎您</title>
</head>
<body>
<h3>
    欢迎您...
    <span>${user.username}</span><br/>
    1s后将为您跳转到首页
</h3>
<script>
    setTimeout(function () {
        window.location.href='http://localhost:8080/goodSSM'
    },3000);
</script>
</body>
</html>
