<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

<%--<a href="/login">登录</a>--%>
<form action="/login" method="post">
    账号：<input type="text" name="username" value=""> <br>
    密码：<input type="text" name="password" value=""> <br>

    <%--<select name="selectDay">--%>
    <%--<option value="1">每次都需要登录</option>--%>
    <%--<option value="2">10天</option>--%>
    <%--<option value="3">30天</option>--%>
    <%--</select> <br><br>--%>
    <input type="submit" value="登录post">
</form>

</body>
</html>
