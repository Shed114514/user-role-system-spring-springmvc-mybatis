<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增角色</title>
</head>
<body>
<h2>新增角色</h2>
<form method="post" action="${pageContext.request.contextPath}/role/add">
    <label>
        角色ID: <input type="text" placeholder="角色ID" name="rid"><br/>
        名称: <input type="text" placeholder="角色名称" name="roleName"><br/>
        描述: <input type="text" placeholder="角色描述" name="roleDesc"><br/>
        <input type="submit" value="保存">
    </label>
</form>
<a href="${pageContext.request.contextPath}/user/home">点击此处返回首页</a>
</body>
</html>
