package com.zhaoqw.bean;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/24 - 07 - 24 - 10:54
 * @Description: com.zhaoqw.bean
 * @version: 1.0
 */
public class Apple {
    private String title;
    private String color;
    private String origin;

    public Apple() {
        System.out.println("Apple对象已经被创建" + this);
    }

    public Apple(String title, String color, String origin) {
        this.title = title;
        this.color = color;
        this.origin = origin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
