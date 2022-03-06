<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>角色列表</title>
</head>

<script>
    function deleteRole(roleId) {
        if (confirm("确定删除该角色吗?")) {
            location.href="${pageContext.request.contextPath}/role/delete/" + roleId
        }
    }
</script>

<body>
<h2>角色列表</h2>
<table border="1">
    <tr>
        <th>角色ID</th>
        <th>名称</th>
        <th>描述</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${roleList}" var="role">
        <tr>
            <td>${role.rid}</td>
            <td>${role.roleName}</td>
            <td>${role.roleDesc}</td>
            <td>
                <input type="button" value="删除" onclick="deleteRole('${role.rid}')"/>
            </td>
        </tr>
    </c:forEach>
</table><br/>
<a href="${pageContext.request.contextPath}/user/home">点击此处返回首页</a>
</body>
</html>
