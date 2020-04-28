<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/28
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="${pageContext.request.contextPath}/static/vue/vue.js"></script>
    <title>登录</title>
    <script type="text/css">
        .fontclass{
            font-size: 10px;
            color:red;
        }
        .loginMassage{
            font-size: 30px;
            color: red;
        }
    </script>
</head>
<body>

<c:choose>
    <c:when test="${loginMessage != '' and loginMessage != null}">
        <span class="loginMassage">${loginMessage}</span>
    </c:when>
    <c:otherwise>
        <span class="loginfont">登录页面</span>
    </c:otherwise>
</c:choose>

<form action="${pageContext.request.contextPath}/login.do" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td>
                <input type="text" name="loginName" value=""/>
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="text" name="loginPass" value=""/>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit" value="">登录</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
