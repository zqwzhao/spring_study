import com.annotationtest.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-11-07 15:01]
 */
public class AnnoationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc2.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.hello();
    }
}
