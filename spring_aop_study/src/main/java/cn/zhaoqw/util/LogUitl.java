package cn.zhaoqw.util;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/16 - 07 - 16 - 21:07
 * @Description: cn.zhaoqw.util
 * @version: 1.0
 */

@Component
@Aspect
public class LogUitl {

    /**
     *  通知注解有一下几种类型
     * @Before 前置通知，在方法执行前完成
     * @After   后置通知，在方法执行完成后执行
     * @AfterReturning 返回通知：返回结果之后运行
     * @AfterThrowing  异常通知：出现异常的时候使用
     * @Around 环绕通知
     * 在方法的参数列表中不要随便添加参数值，会有异常信息
     */
    @Before("execution(public Integer   cn.zhaoqw.service.MyCalculator.add(Integer, Integer))")
    public static void start(){
        System.out.println( " 方法开始执行，参数是" );

    }

    @AfterReturning("execution(public Integer   cn.zhaoqw.service.MyCalculator.add(Integer, Integer))")
    public static void stop(){
        System.out.println( " 方法结束执行，结果是" );
    }

    @AfterThrowing("execution(public Integer   cn.zhaoqw.service.MyCalculator.add(Integer, Integer))")
    public static void logException() {
        System.out.println( "方法产生异常，异常信息:" );
    }


    @After("execution(public Integer cn.zhaoqw.service.MyCalculator.add(Integer, Integer))")
    public static void logFinally() {
        System.out.println("方法执行结束");
    }
}
