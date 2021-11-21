package com.annotationtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-11-07 14:14]
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void hello() {
        userDao.hello();
        System.out.println("userService say Hello Spring");
    }
}
