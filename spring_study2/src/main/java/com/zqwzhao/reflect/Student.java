package com.zqwzhao.reflect;

import com.zqwzhao.bean.Person;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/28 - 05 - 28 - 13:02
 * @Description: com.zqwzhao.reflect
 * @version: 1.0
 */
public class Student extends Person {
    public String className;
    private String address;

    public Student() {
        super();
    }

    private Student(String name, int age, String className) {
        super(name,age);
        this.setClassName(className);
    }
    public Student(int id,String name, int  age, String gender,String className, String address) {
        super(id,name,age,gender);
        this.className = className;
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }

    private int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}
