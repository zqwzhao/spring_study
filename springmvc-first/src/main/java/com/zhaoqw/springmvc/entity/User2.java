package com.zhaoqw.springmvc.entity;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/18 - 08 - 18 - 16:37
 * @Description: com.zhaoqw.springmvc.entity
 * @version: 1.0
 */

public class User2 {
    private String username;
    private String password;
    private IdCard idCard = new IdCard();

    public User2() {
    }

    public User2(String username, String password, IdCard idCard) {
        this.username = username;
        this.password = password;
        this.idCard = idCard;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "User2{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", idCard=" + idCard +
                '}';
    }
}
