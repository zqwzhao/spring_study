import cn.zhaoqw.spring.jdbc.dao.DeptDao;
import cn.zhaoqw.spring.jdbc.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/11 - 08 - 11 - 9:16
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class JdbcTemplateTestor2 {
    @Resource
    private DeptDao dao;

    @Test
    public void findByDeptno() {
        Dept byDept = dao.findByDeptNo(20);
        System.out.println(byDept);
    }
}
