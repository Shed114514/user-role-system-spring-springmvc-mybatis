<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加用户角色</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/user/role/add">
        <table border="1">
            <tr>
                <th>用户</th>
                <th>角色</th>
            </tr>
            <tr>
                <td>
                    <input type="hidden" name="uid" value="${userId}">${userId}
                </td>
                <td>
                    <c:forEach items="${roleList}" var="role">
                        <input type="checkbox" name="rids" value="${role.rid}">${role.roleName}
                    </c:forEach>
                </td>
            </tr>
        </table>
        <input type="submit" value="保存">
    </form>
    <a href="${pageContext.request.contextPath}/user/list">点击此处返回用户列表</a>
</body>
</html>
