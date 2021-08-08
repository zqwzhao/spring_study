package com.bookshop.service;

import com.bookshop.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/1 - 08 - 01 - 9:30
 * @Description: com.bookshop.service
 * @version: 1.0
 */

public class UserService {
    @Value("${metaData}") //读取配置文件中的metaData
    private String metaData;
    private UserDao userDao;

    public UserService() {
        System.out.println("userService已经创建");
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
