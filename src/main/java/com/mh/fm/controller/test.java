package com.mh.fm.controller;

import com.mh.fm.po.Pptphone;
import com.mh.fm.service.PPTService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    private ApplicationContext applicationContext;

    //    获取不到值
    //    @Autowired
    //    private UsersService usersService;

    @Before
    public void setUp() throws Exception {
      applicationContext =  new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
//        applicationContext =  new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");

    }

    @Test
    public void test() throws Exception {
        /*User users = new User();
        users.setUserpassword("zjm");
        users.setUsername("999");

        UserService usersService = (UserService) applicationContext.getBean("usersService");

        User users1 = usersService.login(users);

        System.out.println(users1);
        boolean x = usersService.insertUser(users);*/
        PPTService pptService = (PPTService) applicationContext.getBean("pptService");
        List<Pptphone> listphone = pptService.selectPptphone();
        System.out.println(listphone);
    }
}
