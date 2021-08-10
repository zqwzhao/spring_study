import cn.zhaoqw.exer01.BookShop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/8 - 08 - 08 - 16:58
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookShop bookShop = context.getBean("bookShop", BookShop.class);
        bookShop.sellingBooks("数据结构 Java语言描述");
    }
}
