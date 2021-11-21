package com.annotationtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-11-07 14:15]
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void hello() {
        userService.hello();
        System.out.println("userController say Hello Spring");
    }
}