<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户首页</title>
</head>
<body>
    <h2>欢迎来到用户首页</h2>

    当前用户: <b>${user.username}</b><br/>
    <br/>
    <a href="${pageContext.request.contextPath}/role/addUI">添加角色</a><br/>
    <br/>
    <a href="${pageContext.request.contextPath}/user/list">查看用户列表</a><br/>
    <br/>
    <a href="${pageContext.request.contextPath}/role/list">查看角色列表</a><br/>
    <br/>
    <a href="${pageContext.request.contextPath}/logout">用户登出</a><br/>
</body>
</html>
