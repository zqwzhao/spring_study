package com.zqwzhao.test;

import com.zqwzhao.bean.Person;
import com.zqwzhao.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/25 - 05 - 25 - 21:15
 * @Description: com.zqwzhao.test
 * @version: 1.0
 *
 * 容器中的Person对象是什么时候创建的？
 * 容器中的对象在容器在容器创建完成之前就已经把对象创建好了
 */
public class MyTest {
    public static void main(String[] args) {

        //ApplicationContext 表示ioc容器的入口，想要创建对象，必须创建该类
        /*
            该类有两个读取配置文件的实现类
            ClassPathXmlApplicationContext：表示从classpath中读取数据
            FileSystemXmlApplicationContext：表示从当前文件系统中读取数据
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

        Person person = (Person)context.getBean("person");
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person);
        System.out.println(person1);


        ApplicationContext context1 = new ClassPathXmlApplicationContext("ioc.xml");
        Person person2 = (Person)context1.getBean("person2");

        Person person21 = context1.getBean("person2", Person.class);
        System.out.println(person2);
        System.out.println(person21);


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.hello();
    }
}
