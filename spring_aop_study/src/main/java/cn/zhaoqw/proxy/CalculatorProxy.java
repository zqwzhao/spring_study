package cn.zhaoqw.proxy;

import cn.zhaoqw.service.Calculator;
import cn.zhaoqw.util.LogUitl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 必须要有接口，如果没有接口，不能使用
 */
public class CalculatorProxy {
    public static Calculator getCalculator(final Calculator calculator) {
        ClassLoader loader = calculator.getClass().getClassLoader();

        //被代理对象的所有接口
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        //具体处理类，用来执行被代理类需要执行的方法
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("Invoke 开始执行");
                    LogUitl.start();
                    result= method.invoke(calculator, args);
                }catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    System.out.println(method.getName() + " 方法获取到结果");
                }
                LogUitl.stop();
                return result;
            }
        };
        Object o = Proxy.newProxyInstance(loader, interfaces, handler);
        return (Calculator)o;
    }
}
