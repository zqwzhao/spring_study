package com.zhaoqw.springmvc.entity;

import java.util.List;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/17 - 08 - 17 - 20:42
 * @Description: com.zhaoqw.springmvc.entity
 * @version: 1.0
 */
public class Form {
    private String name;
    private String course;
    private List<Integer> purpose;

    public Form() {
    }

    public Form(String name, String course, List<Integer> purpose) {
        this.name = name;
        this.course = course;
        this.purpose = purpose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Integer> getPurpose() {
        return purpose;
    }

    public void setPurpose(List<Integer> purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", purpose=" + purpose +
                '}';
    }
}
