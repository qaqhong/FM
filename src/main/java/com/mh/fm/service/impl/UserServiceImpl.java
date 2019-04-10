package com.mh.fm.service.impl;

import com.mh.fm.mapper.UserMapper;
import com.mh.fm.po.User;
import com.mh.fm.po.UserExample;
import com.mh.fm.service.UserService;
import com.mh.fm.util.MarkUstils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {



    @Autowired
    UserMapper userMapper;

    public List<User> selectUser(User user) {
        UserExample userExample = new UserExample();

        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsermarkEqualTo(MarkUstils.USER_YES);
        userExample.setOrderByClause("userId asc");
        if(user.getUsername() != null){
            criteria.andUsernameLike("%"+user.getUsername()+"%");
        }
        return userMapper.selectByExample(userExample);
    }

    public boolean insertUser(User user) {
        int x = 0;
        user.setUsermark("1");
        user.setUserrole("超级管理员");
        if(user != null){
            x = userMapper.insertSelective(user);
        }
        if (x > 0) return true;

        return false;
    }

    public boolean updateUser(User user) {

        if (userMapper.updateByPrimaryKeySelective(user) > 0)
            return true;
        else
            return false;

    }

    public User getUserId(User user) {

        if(user != null )
            return userMapper.selectByPrimaryKey(user.getUserid());

        return null;
    }

    public boolean deleteUser(User user) {
        if (userMapper.deleteByPrimaryKey(user.getUserid()) > 0)
            return true;
        else
            return false;
    }

    public User login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andUserpasswordEqualTo(user.getUserpassword());
        List<User> list = userMapper.selectByExample(userExample);
        if (!list.isEmpty()) return (User) list.get(0);
        return null;
    }

    public User loginAjax(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();

        if(user != null && user.getUsername() != null){
            criteria.andUsernameEqualTo(user.getUsername());
            List<User> list = userMapper.selectByExample(userExample);
            if (!list.isEmpty()) return (User) list.get(0);
        }

        return null;
    }


}
