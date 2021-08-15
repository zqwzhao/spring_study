package cn.zhaoqw.spring.jdbc;

import cn.zhaoqw.spring.jdbc.dao.EmployeeDao;
import cn.zhaoqw.spring.jdbc.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/10 - 08 - 10 - 20:04
 * @Description: cn.zhaoqw.spring.jdbc
 * @version: 1.0
 */
public class SpringApplication {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        EmployeeDao employee = context.getBean("employeeDao", EmployeeDao.class);
        employee.findById(7499);
        DataSource dataSource2 = context.getBean("dataSource2", DataSource.class);
        System.out.println(dataSource2);
        System.out.println(dataSource2.getConnection());
    }
}
