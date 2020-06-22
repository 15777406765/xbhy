package com.sxl.controller;

import com.sxl.entity.User;
import com.sxl.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    UserService userService=new UserService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);

        //
        User user1=userService.check(user);

        //判断user1是否为空
        if (user1!=null){
//            request.getRequestDispatcher("/jsp/common/main.jsp").forward(request, response);
            request.getRequestDispatcher("/userList").forward(request, response);

        }else {
            System.out.println("账号密码错误");
            response.sendRedirect("index.jsp");
        }




    }
}
