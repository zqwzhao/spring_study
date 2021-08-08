package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/7 - 08 - 07 - 16:05
 * @Description: com.javaconfig
 * @version: 1.0
 */
public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);
        System.out.println(userDao);
    }
}
