package com.zqwzhao.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/27 - 05 - 27 - 19:35
 * @Description: com.zqwzhao.lambda
 * @version: 1.0
 */
public class LambdaTest {
    public static void main(String[] args) throws Exception {
        Runnable runn1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable1.....");
            }
        };
        runn1.run();

        Runnable runn2 = () -> {
            System.out.println("runnable2...");
        };
        runn2.run();

        Runnable runn3 = () -> System.out.println("runnable2...");
        runn3.run();


        Callable c1 = new Callable() {
            @Override
            public String call() throws Exception {
                return "callable1";
            }
        };
        System.out.println(c1.call());

        Callable<String> c2 = () -> "Callable2";
        Callable<String> c3 = () -> {return "callable3";};
        System.out.println(c2.call());
        System.out.println(c3.call());
        System.out.println("=============================");

        //用自定义的函数式接口
        StudentDao dao1 = new StudentDao() {
            @Override
            public void insert(Student student) {
                System.out.println("insert");
            }
        };
        dao1.insert(new Student());

        StudentDao dao2 = (student) -> System.out.println("Lambda Insert");
        dao2.insert(new Student());

        StudentDao dao3 = stu -> System.out.println("Lambda Insrt:" + stu);
        dao3.insert(new Student());

        TeacherDao teach = new TeacherDao() {
            @Override
            public Teacher get(Teacher t) {
                return new Teacher();
            }
        };
        System.out.println(teach.get(new Teacher()));


        TeacherDao teach2 = (teacher) -> 2;
        System.out.println(teach2.get(new Teacher()));


        Function function = (str) -> Integer.parseInt((String)str);

        Function<String,Integer> function2 = (str) -> {return str.length();};
        Object apply = function.apply("1212");
        System.out.println(apply);

        System.out.println(function2.apply("121212"));


        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("asdfsaf");

        Consumer<String> con2 = (str) -> System.out.println(str);
        con2.accept("aadfaddfeasdfasdf");



        LambdaInterface li1 = () -> get();
        //LambdaInterface li2 = () -> find();


        BiFunction<String,String,Integer> list = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s, String s2) {
                return s.length() + s2.length();
            }
        };
        System.out.println(list.apply("aaaa", "bdde"));

        BiFunction<String,String,Integer> list2 = (str1, str2) -> str1.length() + str2.length();
        System.out.println(list2.apply("aaaadfa", "dsefsaf"));


        List<String> strings = Arrays.asList("a", "b", "c");
        strings.forEach((str) -> System.out.print(str + " "));
        strings.forEach(System.out::print);
    }


    static int get() {
        return 1;
    }


    static String find() {
        return "find";
    }
}
