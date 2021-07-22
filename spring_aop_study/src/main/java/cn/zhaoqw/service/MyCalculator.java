package cn.zhaoqw.service;

import cn.zhaoqw.util.LogUitl;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/16 - 07 - 16 - 20:42
 * @Description: cn.zhaoqw.service
 * @version: 1.0
 */
@Service
public class MyCalculator implements Calculator{

    @Override
    public Integer add(Integer a, Integer b) throws NoSuchMethodException {
//        Method add = MyCalculator.class.getMethod("add", Integer.class, Integer.class);
//        LogUitl.start(add,a,b);

        Integer result = a + b;
//        LogUitl.stop(add,result);
        return result;
    }

    @Override
    public Integer sub(Integer a, Integer b) throws NoSuchMethodException {
//        Method sub = MyCalculator.class.getMethod("sub", Integer.class, Integer.class);
//        LogUitl.start(sub,a,b);
        Integer result = a - b;
//        LogUitl.stop(sub,result);
        return result;
    }

    @Override
    public Integer mul(Integer a, Integer b) throws NoSuchMethodException {
//        Method mul = MyCalculator.class.getMethod("mul", Integer.class, Integer.class);
//        LogUitl.start(mul,a,b);
        Integer result = a * b;
//        LogUitl.stop(mul,result);
        return result;
    }

    @Override
    public Integer div(Integer a, Integer b) throws NoSuchMethodException {
//        Method div = MyCalculator.class.getMethod("div", Integer.class, Integer.class);
//        LogUitl.start(div,a,b);
        Integer result = a / b;
//        LogUitl.stop(div,result);
        return result ;
    }
}
