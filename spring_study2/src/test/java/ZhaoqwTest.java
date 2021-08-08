import com.bookshop.dao.UserDao;
import com.bookshop.service.BookService;
import com.collectiondemo.entity.Company;
import com.zhaoqw.bean.Apple;
import com.zhaoqw.bean.Child;
import com.zqwzhao.bean.Dog;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/22 - 07 - 22 - 16:58
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class ZhaoqwTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog1 = context.getBean("dog1", Dog.class);
        System.out.println(dog1);
        Dog dog2 = context.getBean("dog2", Dog.class);
        System.out.println(dog2);

        Apple sweetApple = context.getBean("sweetApple", Apple.class);
        System.out.println(sweetApple);
        Apple sourApple = context.getBean("sourApple", Apple.class);
        System.out.println(sourApple);

        Child lily = context.getBean("lily", Child.class);
        System.out.println(lily);

        Child andy = context.getBean("andy", Child.class);
        System.out.println(andy);

        Apple appleSF = context.getBean("appleSF",Apple.class);
        Apple appleIF = context.getBean("appleIF", Apple.class);
        System.out.println(appleSF);
        System.out.println(appleIF);


    }

    @Test
    public void bookShopTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.purchase();
        Company company = context.getBean("company", Company.class);
        System.out.println(company);

        String[] beanNames = context.getBeanDefinitionNames();
        for (int i = 0; i < beanNames.length; i++) {
            System.out.println(beanNames[i]);
        }


        UserDao userDao = context.getBean("userDao", UserDao.class);
        UserDao userDao2 = context.getBean("userDao", UserDao.class);
        System.out.println(userDao2 == userDao);
    }
}
