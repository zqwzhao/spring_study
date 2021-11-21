package com.annotationtest;

import org.springframework.stereotype.Repository;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-11-07 14:13]
 */
@Repository
public class UserDao {
    public void hello() {
        System.out.println("userDao say Hello Spring");
    }
}
