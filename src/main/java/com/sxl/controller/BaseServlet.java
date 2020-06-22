package com.sxl.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/*
 * @author sxl
 * @description
 * @date 2020/6/22
 */
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取传过来的路径
        String uri = req.getRequestURI();
        //  user list
        //分割两个数组   数组不用转义
        String[] uriArr = uri.split("/");
        //得到 list或add或delete
        //method数组，最后一个数组
        String method = uriArr[uriArr.length - 1];


        //获取字节码对象有三种方式
//        Class clazz = userServlet.getClass();
//        Class clazz = deptServlet.getClass();

        //这里的this不是BaseServlet，谁调用service()就是谁
        //重点理解这里的this
        Class clazz = this.getClass();
        try {
            // （方法名成，参数1，参数2）
            Method m = clazz.getDeclaredMethod(method, HttpServletRequest.class, HttpServletResponse.class);
            //暴力反射
            m.setAccessible(true);
            //执行方法
            m.invoke(this, req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
