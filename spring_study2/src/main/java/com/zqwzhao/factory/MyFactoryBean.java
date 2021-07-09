package com.zqwzhao.factory;

import com.zqwzhao.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/9 - 07 - 09 - 16:13
 * @Description: com.zqwzhao.factory
 * @version: 1.0
 */
public class MyFactoryBean implements FactoryBean<Person> {
    /**
     * 返回获取的bean
     * @return
     * @throws Exception
     */
    @Override
    public Person getObject() throws Exception {
        Person p = new Person();
        p.setId(3);
        p.setName("zhangsan");
        p.setAge(23);
        p.setGender("男");
        return p;
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
