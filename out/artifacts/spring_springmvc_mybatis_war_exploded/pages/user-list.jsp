<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>用户列表</title>
</head>

<script>
    function deleteUser(userId) {
        if (confirm("确定删除该用户吗?")) {
            location.href="${pageContext.request.contextPath}/user/delete/" + userId ;
        }
    }
    function addRole(userId) {
        location.href="${pageContext.request.contextPath}/user/role/add/" + userId ;
    }
</script>

<body>
    <h2>用户列表</h2>
    <table border="1">
        <tr>
            <th>账号</th>
            <th>密码</th>
            <th>用户名</th>
            <th>出生日期</th>
            <th>具有的角色</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.uid}</td>
                <td>${user.password}</td>
                <td>${user.username}</td>
                <td><fmt:formatDate value="${user.birthday}" var="birthday" pattern="yyyy-MM-dd"/>${birthday}</td>
                <td>
                    <c:forEach items="${user.roles}" var="role">
                        &nbsp;${role.roleName}
                    </c:forEach>&nbsp;
                </td>
                <td>
                    <input type="button" value="删除" onclick="deleteUser('${user.uid}')"/>
                    <input type="button" value="添加角色" onclick="addRole('${user.uid}')"/>
                </td>
            </tr>
        </c:forEach>
    </table><br/>
    <a href="${pageContext.request.contextPath}/user/home">点击此处返回首页</a>
</body>
</html>
