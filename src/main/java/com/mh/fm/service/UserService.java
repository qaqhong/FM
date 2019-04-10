package com.mh.fm.service;



import com.mh.fm.po.User;

import java.util.List;


public interface UserService {

    /***
     * 用户信息的业务逻辑层
     * @param user 用户的信息
     * @return 返回用户的信息
     */
    public List<User> selectUser(User user);

    /***
     * 用户插入信息的方法
     * @param user 用户的信息
     * @return
     */
    public boolean insertUser(User user);

    /***
     * 修改的方法
     * @param user
     * @return
     */
    public boolean updateUser(User user);

   /* **
     *
     * @param id
     * @return*/
    public User getUserId(User user);


    /*
     * 删除，可做假删除，也可以做真删除
     * @param userid
     * @return
     */
    public boolean deleteUser(User user);

    /***
     * 用户登陆操作的业务逻辑层
     * @param user
     * @return
     */
    public User login(User user);

    /***
     * 账号异步验证
     * @param user
     * @return
     */
    public User loginAjax(User user);

}
