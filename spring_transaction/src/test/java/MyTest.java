
import cn.zhaoqw.transaction.service.BookService;
import cn.zhaoqw.transaction.service.MulService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.SQLException;
/**
 * @Auther: zhaoqw
 * @Date: 2021/8/16 - 08 - 16 - 9:27
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        MulService mulService = context.getBean("mulService", MulService.class);
        mulService.mulTx();
    }
}
