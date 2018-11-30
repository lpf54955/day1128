<%--
  Created by IntelliJ IDEA.
  User: 54955
  Date: 2018/11/28
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
    <h1>success.jsp</h1>
    <h1>账号:=${u2.uname}</h1>
    <h1>密码:=${u2.upass}</h1>
    <h1>年龄:=${u2.uage}</h1>
    <h1>生日:=${u2.date}</h1>
    <h1>性别:=${sessionScope.u3}</h1>
    <h1>爱好:=${sessionScope.sessionu4}</h1>
    <a href="loginout">退出</a>
</body>
</html>
