import cn.zhaoqw.service.EmployeeService;
import cn.zhaoqw.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/8 - 08 - 08 - 16:33
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class AopAnnotationTest {

    @Test
    public void Test01() {
        ApplicationContext context = new  ClassPathXmlApplicationContext("ApplicationContext.xml");
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        employeeService.entry();

        UserService userService = context.getBean("userService", UserService.class);
        userService.createUser();
    }


}
