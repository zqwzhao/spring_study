package cn.zhaoqw.spring.jdbc.dao;

import cn.zhaoqw.spring.jdbc.entity.Employee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/10 - 08 - 10 - 19:47
 * @Description: cn.zhaoqw.spring.jdbc.dao
 * @version: 1.0
 */
public class EmployeeDao {
    //利用jdbcTemplate实现一些操作
    private JdbcTemplate jdbcTemplate;


    /**
     * 数据的查询
     * @param eno
     * @return
     */
    public Employee findById(Integer eno) {
        String sql = "select * from t_emp where empno = ?";
        Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{eno}, new BeanPropertyRowMapper<Employee>(Employee.class));
        System.out.println(employee);
        return employee;
    }


    //查询符合类型，用集合存储
    public List<Employee> findByDeptNo(Integer deptno) {
        String sql = "select * from t_emp where deptno = ?";
        List<Employee> query = jdbcTemplate.query(sql, new Object[]{deptno}, new BeanPropertyRowMapper<Employee>(Employee.class));
        for (Employee employee : query) {
            System.out.println(employee);
        }

        return query;
    }

    //查询复合类型，同时结果不是完整的bean对象
    public  List<Map<String, Object>>  findMapByDeptNo(Integer deptno) {
        String sql = "select empno,ename,job from t_emp where deptno = ?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, new Object[] {deptno});
        Iterator<Map<String, Object>> iterator = maps.iterator();
        while (iterator.hasNext()) {
            Map<String, Object> next = iterator.next();
            Set<Map.Entry<String, Object>> entries = next.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
            }
            System.out.println("========================");
        }
        return maps;
    }


    public int insert(Employee employee) {
        String sql = "insert into t_emp values(?,?,?,?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, new Object[]{employee.getEmpno(), employee.getEname(),
                employee.getJob(), employee.getMgr(), employee.getHiredate(),
                employee.getSal(), employee.getComm(), employee.getDeptno()});
        System.out.println("本次更新" + update + "条数据");

        return update;
    }


    public int delete(Integer empno) {
        String sql = "delete from t_emp where empno = ?";
        int update = jdbcTemplate.update(sql, new Object[]{empno});

        System.out.println("本次删除" + update + "条数据");

        return update;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
