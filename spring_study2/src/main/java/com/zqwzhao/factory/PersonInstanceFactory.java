package com.zqwzhao.factory;

import com.zqwzhao.bean.Person;

/**
 * 实例工厂
 */
public class PersonInstanceFactory {
    public Person getInstance(String name) {
        Person p = new Person();
        p.setId(2);
        p.setName(name);
        p.setAge(23);
        p.setGender("男");
        return p;
    }
}
