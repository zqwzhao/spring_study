package cn.zhaoqw.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/10 - 08 - 10 - 9:27
 * @Description: cn.zhaoqw.proxy
 * @version: 1.0
 */
public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("huahuahuahuahua......");
    }

    public static void main(String[] args) {
        Tank t = new Tank();
        Movable move = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(),new Class[]{Movable.class},new LogHandler(t));
        move.move();
    }
}

class LogHandler implements InvocationHandler{
    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("===" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS").format(new Date()) +"===");
        String name = method.getName();
        System.out.println(name + " method is invoking !");
        method.invoke(target,args);
        System.out.println("===" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS").format(new Date()) +"===");
        return null;
    }
}


