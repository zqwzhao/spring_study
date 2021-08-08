package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/7 - 08 - 07 - 16:03
 * @Description: com.javaconfig
 * @version: 1.0
 */
@Configuration
public class Config {
    @Bean
    public UserDao userDao(){
        UserDao dao = new UserDao();
        return dao;
    }


    @Bean
    public UserService userService(UserDao userDao) {
        UserService service = new UserService();
        return service;
    }
}
