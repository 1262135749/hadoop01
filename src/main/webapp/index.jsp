<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/27
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hadoop首页</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.2.1.min.js"></script>
</head>
<body>
欢迎访问，请登录!
<button onclick="login();">登录</button>
</body>

<script type="text/javascript">
    function login() {
        window.location.href = "${pageContext.request.contextPath}/goLogon.do";
    }
</script>
</html>
