package com.zqwzhao.controller;

import com.zqwzhao.dao.UserDao;
import com.zqwzhao.service.UserService;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-11-07 11:34]
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void hello() {
        userService.hello();
        System.out.println("userController say Hello Spring");
    }
}
