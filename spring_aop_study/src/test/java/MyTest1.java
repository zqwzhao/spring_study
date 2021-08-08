
import cn.zhaoqw.service.EmployeeService;
import cn.zhaoqw.service.MyCalculator;
import cn.zhaoqw.service.SecondCalculator;

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
        /*Calculator calculator = CalculatorProxy.getCalculator(new MyCalculator());
        calculator.add(1,2);
        calculator.sub(5,6);
        calculator.mul(3,3);
        calculator.div(100,20);*/

    }


    @Test
    public void Test02() throws NoSuchMethodException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        MyCalculator myCalculator = context.getBean(MyCalculator.class);
        myCalculator.add(1,2);
        myCalculator.mul(3,3);
        myCalculator.show(2,100.0);
        System.out.println(myCalculator.getClass().getName());
        System.out.println(myCalculator.getClass());

    }

    @Test
    public void Test03() throws NoSuchMethodException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        SecondCalculator secondCalculator = context.getBean("secondCalculator", SecondCalculator.class);
        System.out.println(secondCalculator.add(5,8));
    }


    @Test
    public void Test04() throws NoSuchMethodException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        employeeService.insert();
    }

}
