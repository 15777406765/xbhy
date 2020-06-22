<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息界面</title>
</head>
<body>
<%@include file="../common/top.jsp" %>
<%@include file="../common/left.jsp" %>

<div id="right">

    <a href="userAdd.jsp">添加</a>
    <table style="width: 80%;" border="1px" cellpadding="0" cellspacing="0">
        <tr>
            <td>序号</td>
            <td>用户名</td>
            <td>邮箱</td>
            <td>真实姓名</td>
            <td>年龄</td>
            <td>手机号</td>
            <td>性别</td>
            <td>部门编号</td>
            <td>部门名称</td>
            <td>操作</td>
        </tr>
        <c:forEach  items="${list}" var="list"  varStatus="status">
            <tr>
                <td>${status.index+1}</td>
                <td>${list.username}</td>
                <td>${list.email}</td>
                <td>${list.realName}</td>
                <td>${list.age}</td>
                <td>${list.phone}</td>
                <td>${list.gender}</td>
                <td>${list.deptId}</td>
                <td>${list.deptName}</td>
                <td>
                    <a href="/toUpdate?id={list.id}">修改</a>
                    <a href="/toDelete?id={list.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
