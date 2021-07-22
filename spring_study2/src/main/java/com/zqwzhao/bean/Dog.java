package com.zqwzhao.bean;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/22 - 07 - 22 - 16:59
 * @Description: com.zqwzhao.bean
 * @version: 1.0
 */
public class Dog {
    private String dname;
    private Integer age;

    public Dog() {
    }

    public Dog(String dname, Integer age) {
        this.dname = dname;
        this.age = age;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dname='" + dname + '\'' +
                ", age=" + age +
                '}';
    }
}
