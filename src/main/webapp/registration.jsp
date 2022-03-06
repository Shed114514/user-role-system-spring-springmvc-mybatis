<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新用户注册页面</title>
</head>
<body>
<h2>新用户注册</h2>
<form method="post" action="${pageContext.request.contextPath}/register">
    <label>
        账号: <input type="text" placeholder="账号" name="uid"><br/>
        密码: <input type="password" placeholder="密码" name="password"><br/>
        用户名: <input type="text" placeholder="真实姓名" name="username"><br/>
        出生日期: <input type="date" placeholder="出生日期" name="birthday"><br/>
        <input type="submit" value="点击注册">
    </label>
</form>
<a href="${pageContext.request.contextPath}/login.jsp">点击此处返回登录页面</a>
</body>
</html>
