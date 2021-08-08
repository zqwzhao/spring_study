package cn.zhaoqw.util;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/8 - 08 - 08 - 8:32
 * @Description: cn.zhaoqw.util
 * @version: 1.0
 */

public class MyPointCut01 {
    public void pointCutMethod(JoinPoint joinPoint) {
        String name = joinPoint.getTarget().getClass().getName();
        String method = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("方法开始执行： " + name + ":" + method + "  args: " + Arrays.toString(args));
    }

    public void doAfter(JoinPoint joinPoint) {
        System.out.println("触发后置通知");

    }

    public void doAfterReturning(JoinPoint joinPoint,Object obj) {
        System.out.println("return 返回后通知: " + obj);
    }

    public void doAfterThrowing(JoinPoint joinPoint, Throwable throwable) {
        System.out.println("异常通知，" + throwable.getMessage());
    }
}
