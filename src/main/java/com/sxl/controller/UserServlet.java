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

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("user list");
        request.getRequestDispatcher("/jsp/user/userList.jsp").forward(request, response);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("user add");

    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }










}
