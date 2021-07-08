package com.zqwzhao.bean;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/25 - 05 - 25 - 21:59
 * @Description: com.zqwzhao.bean
 * @version: 1.0
 */

public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;

    public Person() {
        System.out.println("person被创建");
    }
    public Person(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }
    public Person(String name, String gender) {
        this.setName(name);
        this.setGender(gender);
    }
    public Person(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
