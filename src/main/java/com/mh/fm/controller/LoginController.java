package com.mh.fm.controller;


import com.mh.fm.exception.FmException;
import com.mh.fm.po.Menu;
import com.mh.fm.po.User;
import com.mh.fm.service.UserService;
import com.mh.fm.util.MarkUstils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {



    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String Login(HttpSession session, User user, Model model,HttpServletRequest request) throws Exception {

        User login = null;
        System.out.println("登录账号:" + user.getUsername() + " 密码:" + user.getUserpassword());
        if (user != null && user.getUsername() != null && user.getUserpassword()!= null
                && !"".equals(user.getUsername()) && !"".equals(user.getUserpassword()) ) {
            login = userService.login(user);
        }
        System.out.println(user.getUsername()+" "+user.getUserpassword());
        if(login == null){
            model.addAttribute("info", "登录失败，请输入正确的账号密码!");
            return "info";
        }
        session.setAttribute("userLogin", login);
        request.setAttribute("userLogin", login);

        if(MarkUstils.AUTH_ADMIN.equals(login.getUserrole())){
            request.setAttribute("mlogin", admin());
        }

        return "main/index";
    }

    @RequestMapping(value = "/Out")
    public String LoginOut(HttpSession session, Model model) throws FmException, IOException {
        session.invalidate();
        return "main/login";
    }


    @RequestMapping("/show")
    public String Show(Model model, HttpServletRequest request) throws Exception {
        model.addAttribute("user", (User) request.getSession().getAttribute("userLogin"));
        return "userinfo/userinfo_detail";
    }


    public List<Menu> getData(){
        /**
         * 1系统管理 0
         5用户管理  1
         6费用管理  1
         7个人信息修改  1
         8我的薪资（薪资查询） 1

         2报销管理 0
         9报销单 2
         10（报销单）经理审批2
         11报销单查询2
         12我的报销单2

         3财务工作台 0
         13（报销单）财务审批 3
         14 薪资发放 3

         4预算管理0
         15预算单4
         16（预算单）经理审批4
         17预算单查询4
         18我的预算单4
         */
        List<Menu> list = new ArrayList<Menu>();
        //Menu的构造方法的编号 名称 url 父级id
        list.add(new Menu(1,"系统管理","",0));
        list.add(new Menu(2,"各主页资源显示管理","",0));


        //系统管理
        list.add(new Menu(5,"用户管理","/user/select",1));
        list.add(new Menu(6,"PPT","ppt/select",2));

        list.add(new Menu(7,"个人信息修改","user/myupdate",1));
        list.add(new Menu(8,"安装环境","inen/select",2));
        list.add(new Menu(9,"配套视频资源","video/select",2));
        list.add(new Menu(10,"实训项目单","docu/select",2));
        list.add(new Menu(11,"实训项目文档","table/select",2));
        list.add(new Menu(12,"源码","sourcecode/select",2));
        //list.add(new Menu(8,"我的薪资[薪资查询]","payment/paymentManage/paymentmy",1));

        //报销管理


        return list;
    }

    //提取公共的从权限里面获取权限
    public List<Menu> getAuth(int[] arr){
        //先获取所有的数据，即后台权限的数据
        List<Menu> list = getData();
        //再创建一个集合，用于遍历和所有权限进行匹配操作
        List<Menu> ordinaryList = new ArrayList<Menu>();

        //首先获取全部进行循环，然后拿出数组里面的进行循环
        //如果相等，那么就添加到普通员工的集合中
        for(int i = 0;i < list.size();i++){
            for(int j = 0;j < arr.length;j++){
                //权限匹配的原理，深刻理解掌握
                if(list.get(i).getMid().equals(arr[j])){
                    ordinaryList.add(list.get(i));
                }
            }
        }
        //返回普通员工的集合，里面即是普通员工的权限
        return ordinaryList;
    }

    //超级管理员的权限,超级管理员具有所有的权限
    public List<Menu> admin(){
        //超级管理员，直接赋给所有的权限
        return getData();
    }


}
