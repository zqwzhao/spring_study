import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.zqwzhao.bean.Address;
import com.zqwzhao.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/9 - 07 - 09 - 15:52
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        //通过静态工厂创建
        Person person8 = context.getBean("person8", Person.class);
        System.out.println(person8);

        //利用实例工厂创建bean
        Person person9 = context.getBean("person9", Person.class);
        System.out.println(person9);

        //利用FactoryBean
        Person myFactoryBean = context.getBean("myFactoryBean", Person.class);
        System.out.println(myFactoryBean);


        Address address23 = context.getBean("address23", Address.class);
        System.out.println(address23);

        //第三饭的Bean
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        try {
            DruidPooledConnection connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        DruidDataSource dataSource2 = context.getBean("dataSource2", DruidDataSource.class);
        System.out.println(dataSource2);


    }
}
