package com.zhaoqw.bean;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/24 - 07 - 24 - 10:56
 * @Description: com.zhaoqw.bean
 * @version: 1.0
 */
public class Child {
    private String name;
    private Apple apple;

    public Child() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", apple=" + apple +
                '}';
    }
}
