package com.zhaoqw.springmvc.entity;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/16 - 08 - 16 - 19:07
 * @Description: com.zhaoqw.springmvc.entity
 * @version: 1.0
 */
public class User {
    private String username;
    private Long password;


    public User() {
    }

    public User(String username, Long password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
