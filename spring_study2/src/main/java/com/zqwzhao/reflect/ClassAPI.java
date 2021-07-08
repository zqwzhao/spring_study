package com.zqwzhao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/28 - 05 - 28 - 12:59
 * @Description: com.zqwzhao.reflect
 * @version: 1.0
 */
public class ClassAPI {
    //获取成员变量
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class clazz = Class.forName("com.zqwzhao.reflect.Student");
        //获取成员变量, 只能获取public 类型的属性
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());
        }

        //此方法返回的是当前类的所有属性，不受限于修饰符，所有修饰符 修饰的属性都能获取到
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            System.out.println(declaredField.getName());
            System.out.println(declaredField.getType());
        }

        System.out.println("----------------------------------");

        //reflect 在一定层度上破坏了封装性，需要合理使用
        Field address = clazz.getDeclaredField("address");
        //设置私有属性可以访问
        address.setAccessible(true);
        System.out.println(address);
        System.out.println(address.getName());


        Object o = clazz.newInstance();

        address.set(o,"北京市");
        System.out.println(((Student)o).getAddress());



        //获取该对象的普通方法,当前类和其父类的公共方法，只能是公共方法
        Method[] methods = clazz.getMethods();
        for (Method method:methods) {
            System.out.println(method.getName());
        }

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method: declaredMethods) {
            System.out.println(method.getName());
        }
        System.out.println("--------------------------");

        Method add = clazz.getDeclaredMethod("add", int.class, int.class);
        add.setAccessible(true);
        Object o1 = clazz.newInstance();
        add.invoke(o1,1,2);


        //获取构造方法,只能获取共有的构造方法
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
        }

        //获取所有的构造方法
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }

        //如何调用私有构造方法呢？
        Constructor con = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        con.setAccessible(true);
        Student o2 =(Student) con.newInstance("牛叠为", 23, "java");
        System.out.println(o2);

    }

}
