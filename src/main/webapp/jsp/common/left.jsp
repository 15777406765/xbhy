<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>登录</title>
</head>

<style>
    #left {
        height: 90%;
        width: 10%;
        border: 1px solid red;
        float: left;
    }

    #right {
        margin-left: 5px;
        height: 90%;
        width: 89%;
        border: 1px solid red;
        float: left;
    }

    li {
        list-style: none;
    }

</style>
<script>
    window.onload=function (ev) {
        // $.ajax({
        //     url:"/menu",
        //     type:"get",
        //     data:"",
        //     dataType:"json",
        //     success:function (data) {
        //         // alert(123);
        //         var html='';
        //         //此时这个循环里面有5条数据
        //         //外层循环
        //         for (var i = 0; i <data.length ; i++) {
        //             var menu_1=data[i];
        //             if (menu_1.type==1){
        //                 html+=menu_1.name;
        //                 html+='<ul>';
        //                 for (var j = 0; j <data.length ; j++) {
        //                     var menu_2=data[j];
        //                     //判断一级菜单和二级菜单是一组
        //                     if (menu_2.pId==menu_1.id){
        //                         html+='<li><a href="' + menu_2.url + '">'+menu_2.name+'</a></li>';
        //                     }
        //                 }
        //                 html+='</ul>';
        //             }
        //         }
        //         $("#left").append(html);
        //     }
        // });
        $.ajax({
            url: "/menu",
            type: "get",
            data: "",
            dataType: "json",
            success: function (data) {
                var parent = data.parent;
                var son = data.son;
                var html = '';
                for (var i = 0; i < parent.length; i++) {
                    html += parent[i].name;
                    html += '<ul>';
                    for (var j = 0; j < son.length; j++) {
                        if (son[j].pId == parent[i].id) {
                            html += '<li><a href="' + son[j].url + '">' + son[j].name + '</a></li>';
                        }
                    }
                    html += '</ul>';
                }
                $("#left").append(html);
            }
        });
    }

</script>
<body>
<div id="left">
    <%--系统管理--%>
    <%--<ul>--%>
        <%--<li><a href="/jsp/user/userList.jsp">用户管理</a></li>--%>
        <%--<li><a href="/jsp/dept/dept.jsp">部门管理</a></li>--%>
    <%--</ul>--%>

    <%--权限管理--%>
    <%--<ul>--%>
        <%--<li><a href="">角色管理</a></li>--%>
        <%--<li><a href="">权限管理</a></li>--%>
    <%--</ul>--%>
</div>

</body>
</html>
