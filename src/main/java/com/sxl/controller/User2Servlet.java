package com.sxl.controller;

import com.sxl.entity.User;
import com.sxl.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userList")
public class User2Servlet extends HttpServlet {
    UserService userService=new UserService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        List<User> list=userService.list();

        request.setAttribute("list",list);
        request.getRequestDispatcher("/jsp/user/userList.jsp").forward(request,response);









    }
}
