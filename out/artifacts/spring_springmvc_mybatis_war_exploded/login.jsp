<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<h2>用户登录</h2>
<form method="post" action="${pageContext.request.contextPath}/login">
    <label>
        账号: <input type="text" placeholder="请输入账号..." name="uid"><br/>
        密码: <input type="password" placeholder="请输入密码..." name="password"><br/>
        <input type="submit" value="登录">
    </label>
</form>
<a href="${pageContext.request.contextPath}/registration.jsp">点击此处注册账号</a>
</body>
</html>
