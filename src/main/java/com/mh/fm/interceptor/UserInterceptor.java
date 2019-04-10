package com.mh.fm.interceptor;

import com.mh.fm.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        //判断session
        HttpSession session = request.getSession();
        //从session中取出用户身份信息
        User userLogin = (User) session.getAttribute("userLogin");

        if (userLogin.getUsermark().equals("1")) return true;

        request.getSession().setAttribute("info", "您的权限不足!");
        request.getRequestDispatcher("/view/system/main/login.jsp").forward(request, response);

        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
