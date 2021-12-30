<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Title</title>
</head>
<body>
<h3>
    发生错误了（您可能还没有登陆呢...），3s后将为您跳转到首页....
</h3>
<script>
    setTimeout(function () {
        window.location.href='http://localhost:8080/goodSSM'
    },3000);
</script>
</body>
</html>
