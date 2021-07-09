package com.zqwzhao.factory;

import com.zqwzhao.bean.Person;

/**
 * 静态工厂类
 */
public class PersonStaticFactory {
    public static Person getInstance(String name) {
        Person p = new Person();
        p.setId(1);
        p.setName(name);
        p.setAge(23);
        p.setGender("男");
        return p;
    }
}
