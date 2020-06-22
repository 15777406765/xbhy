package com.sxl.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * @author sxl
 * @description
 * @date 2020/6/22
 */
@WebFilter("/*")
public class SysFilter  implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        //两种中文
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //放行
        filterChain.doFilter(req, resp);
    }
}
