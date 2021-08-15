import cn.zhaoqw.spring.jdbc.dao.EmployeeDao;
import cn.zhaoqw.spring.jdbc.entity.Employee;
import cn.zhaoqw.spring.jdbc.service.EmployeeService;
import com.alibaba.druid.support.ibatis.SpringIbatisBeanTypeAutoProxyCreator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/10 - 08 - 10 - 20:10
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class JdbcTemplateTestor {
    @Resource
    private EmployeeDao employeeDao;

    @Resource
    private EmployeeService employeeService;

    @Test
    public void findById() {
        Employee byId = employeeDao.findById(7499);
        System.out.println(byId);

    }

    @Test
    public void findByDeptNo() {
        List<Employee> byDeptNo = employeeDao.findByDeptNo(30);


    }

    @Test
    public void findMap(){
        employeeDao.findMapByDeptNo(30);
    }

    @Test
    public void testBatchImport() {
        employeeService.batchImport();
        System.out.println("导入成功");
    }
}
