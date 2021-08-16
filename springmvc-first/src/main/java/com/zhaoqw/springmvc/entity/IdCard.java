package com.zhaoqw.springmvc.entity;

import java.util.Date;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/18 - 08 - 18 - 16:38
 * @Description: com.zhaoqw.springmvc.entity
 * @version: 1.0
 */
public class IdCard {
    private String name;
    private String idno;
    private Date expire;

    public IdCard(String name, String idno, Date expire) {
        this.name = name;
        this.idno = idno;
        this.expire = expire;
    }

    public IdCard() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "name='" + name + '\'' +
                ", idno='" + idno + '\'' +
                ", expire=" + expire +
                '}';
    }
}
