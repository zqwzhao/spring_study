import cn.zhaoqw.proxy.CalculatorProxy;
import cn.zhaoqw.service.Calculator;
import cn.zhaoqw.service.MyCalculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/16 - 07 - 16 - 21:04
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest1 {


    @Test
    public void Test01() throws NoSuchMethodException {
        Calculator calculator = CalculatorProxy.getCalculator(new MyCalculator());
        calculator.add(1,2);
        calculator.sub(5,6);
        calculator.mul(3,3);
        calculator.div(100,20);

    }


    @Test
    public void Test02() throws NoSuchMethodException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        Calculator myCalculator = context.getBean("myCalculator", Calculator.class);
        myCalculator.add(1,2);


    }
}
