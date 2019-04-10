package com.mh.fm.controller;

import com.mh.fm.po.User;
import com.mh.fm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/select", method = {RequestMethod.POST, RequestMethod.GET})
    public String UserSelect(User user,Model model,HttpServletRequest request){

        List<User> list = userService.selectUser(user);


        model.addAttribute("list", list);
        //为了提高用户体验，搜索之后依旧显示在显示框
        model.addAttribute("user", user);
        //获取前台提交的标识mark
        model.addAttribute("mark", request.getParameter("mark"));

        return "userinfo/userinfo_list";
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET})
    public String UserInsert(User user,Model model){
        return "userinfo/userinfo_add";
    }

    @RequestMapping(value = "/insertSubmit", method = {RequestMethod.POST})
    public String UserInsertSubmit(User user,Model model){
        boolean mark =userService.insertUser(user);

        String url = "user/select";
        model.addAttribute("url", url);
        model.addAttribute("mark", mark);

        return "show_info";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET})
    public String UserUpdate(User user,Model model){
        User users = userService.getUserId(user);
        model.addAttribute("user", users);

        return "userinfo/userinfo_update";
    }

    @RequestMapping(value = "/updateSubmit", method = {RequestMethod.POST})
    public String UserUpdateSubmit(User user,Model model){

        boolean mark = userService.updateUser(user);
        model.addAttribute("mark", mark);

        String url = "user/select";
        model.addAttribute("url", url);

        return "show_info";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET})
    public String UserDelete(User user,Model model){
        boolean mark =userService.deleteUser(user);

        String url = "user/select";
        model.addAttribute("url", url);
        model.addAttribute("mark", mark);

        return "show_info";
    }



    @RequestMapping(value = "/myupdate", method = {RequestMethod.GET})
    public String UserMyUpdate(User user,Model model,HttpServletRequest request){

        return "userinfo/myuserinfo_update";
    }

    @RequestMapping(value = "/myupdateSubmit", method = {RequestMethod.POST})
    public String UserMyUpdateSubmit(User user,Model model,HttpServletRequest request){
        User user2 = userService.getUserId(user);

        user2.setUsername(user.getUsername());

        user2.setUserpassword(user.getUserpassword());
        boolean mark = userService.updateUser(user2);
        model.addAttribute("mark", mark);
        if(mark){
            //先查询出现在登陆的是谁，然后再进行修改个人信息操作
            HttpSession session = request.getSession();
            session.setAttribute("userLogin", user2);

        }
        return "userinfo/myuserinfo_update";

    }

    @RequestMapping(value = "/ajax", method = {RequestMethod.POST})
    public void UserAjax(HttpServletResponse response,User user){
        User userAjax =userService.loginAjax(user);

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //如果查询的结果不为空
        if(userAjax != null){
            //那么显示账号已经被注册册了
            out.println("sorry,这个账号已经被注册了~~~");
        }else{
            //否则显示账号可以注册
            out.println("<font style='color:green;'>恭喜您，账号可以被注册哦~~~</font>");
        }
        //刷新流
        out.flush();
        //关闭流
        out.close();
    }


}
