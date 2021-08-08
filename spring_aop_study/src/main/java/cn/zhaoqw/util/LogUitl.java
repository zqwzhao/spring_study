package cn.zhaoqw.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
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
     * 切入点表达式
     *   最精确的匹配方式，
     *     public Integer cn.zhaoqw.service.MyCalculator.add(Integer, Integer))
     *   实际工作过程中，更多使用统配符的方式
     *      *
     *          1.可以匹配一到多个字符
     *          execution(public Integer   cn.zhaoqw.service.MyCalculator.*(Integer, Integer))
     *          2.可以匹配任意类型参数
     *          execution(public Integer   cn.zhaoqw.service.MyCalculator.*(Integer, *))
     *          3. *在匹配的时候只能匹配一层路径，不能匹配多层
     */

    @Pointcut("execution(public Integer   cn.zhaoqw.service.MyCalculator.*(Integer,*))")
    public void MyPointCut(){}

    @Pointcut("execution(public Integer   cn.zhaoqw.service.MyCalculator.*(Integer, Integer))")
    public void MyPointCut1(){}
    @Before("MyPointCut()")
    public static void start(JoinPoint joinPoint){

        Signature signature = joinPoint.getSignature();
        //获取参数信息
        Object[] args = joinPoint.getArgs();
        System.out.println(signature.getName() + " 方法开始执行，参数是" + Arrays.asList(args));

    }

    @AfterReturning(value = "MyPointCut1()",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName() +  " 方法结束执行，结果是" + result);
    }

    @AfterThrowing("execution(public Integer   cn.zhaoqw.service.MyCalculator.*(Integer, *))")
    public static void logException(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName() + "方法产生异常，异常信息:" );
    }


    @After("execution( * *.*(Integer, Integer))")
    public static void logFinally(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "方法执行结束");
    }

    @Around("MyPointCut()")
    public Object around(ProceedingJoinPoint point) {
        Signature signature = point.getSignature();
        Object[] args = point.getArgs();
        Object result = null;
        try {
            System.out.println("环绕通知开始start：" + signature.getName() + " 方法开始执行，参数为" + Arrays.asList(args));
            result = point.proceed(args);
            System.out.println("环绕通知开始stop：" + signature.getName() + " 方法执行结束，参数为" + Arrays.asList(args));
        } catch (Throwable throwable) {
            System.out.println("环绕异常通知：" + signature.getName() + "出现异常");
            throwable.printStackTrace();
        }finally {
            System.out.println("环绕返回通知：" + signature.getName() + "方法返回结果是：" + result);
        }

        return result;
    }

}
