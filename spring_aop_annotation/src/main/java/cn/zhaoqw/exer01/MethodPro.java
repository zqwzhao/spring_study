package cn.zhaoqw.exer01;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/8 - 08 - 08 - 16:45
 * @Description: cn.zhaoqw.exer01
 * @version: 1.0
 */
@Component
@Aspect
public class MethodPro {

    //@Around("execution(* cn.zhaoqw.exer01.BookShop.*(..))")
    public Object welcome(ProceedingJoinPoint joinPoint) throws Throwable {
        Object proceed = null;
        try {
            System.out.println("欢迎光临小店");
            proceed = joinPoint.proceed();
            System.out.println("欢迎下次光临");
        } catch (Throwable throwable) {
            System.out.println("钱没带够");
            throw new Throwable();
        }

        return proceed;
    }


    @Before("execution(* cn.zhaoqw.exer01.BookShop.*(..))")
    public void preSales(JoinPoint joinPoint) {
        System.out.println("====售前服务=====");
    }

    @After("execution(* cn.zhaoqw.exer01.BookShop.*(..))")
    public void afterSales(JoinPoint joinPoint) {
        System.out.println("====售后服务=====");
    }
}
