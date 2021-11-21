package com.zqwzhao.service;

import com.zqwzhao.dao.UserDao;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-11-07 11:31]
 */
public class UserService {
    private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void hello() {
        userDao.hello();
        System.out.println("userService say Hello Spring");
    }
}
