package com.zqwzhao.reflect;

import com.zqwzhao.bean.Person;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/28 - 05 - 28 - 12:49
 * @Description: com.zqwzhao.reflect
 * @version: 1.0
 */
public class ClassClassObject {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.zqwzhao.bean.Person");
        System.out.println(clazz.getPackage());
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getCanonicalName());
        Class<Person> personClass = Person.class;

        Class<Integer> type = Integer.TYPE;


    }
}
