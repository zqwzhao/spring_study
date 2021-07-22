import com.zqwzhao.bean.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/22 - 07 - 22 - 16:58
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog1 = context.getBean("dog1", Dog.class);
        System.out.println(dog1);
        Dog dog2 = context.getBean("dog2", Dog.class);
        System.out.println(dog2);
    }
}
