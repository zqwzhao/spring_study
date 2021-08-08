package cn.zhaoqw.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/8 - 08 - 08 - 10:24
 * @Description: cn.zhaoqw.aspect
 * @version: 1.0
 */
@Component
public class MethodCheck {
    //ProceedingJoinPoint 是  JoinPoint的升级版，可以控制目标方法是否执行
    public Object check(ProceedingJoinPoint joinPoint) throws Throwable {
        Object proceed = null;
        try {
            long start = System.currentTimeMillis();
            proceed = joinPoint.proceed();//执行目标方法
            long end = System.currentTimeMillis();

            long duration = end - start;

            if (duration > 1000) {
                String className = joinPoint.getTarget().getClass().getName();
                String methodName = joinPoint.getSignature().getName();
                System.out.println("========  " + className + ": " + methodName + " execution time:"  + duration);
            }
        } catch (Throwable throwable) {
            System.out.println("Execution message: " + throwable.getMessage());
            throw throwable;
        }


        return proceed;
    }
}
