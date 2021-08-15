package cn.zhaoqw.spring.jdbc.dao;

import cn.zhaoqw.spring.jdbc.entity.Dept;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/11 - 08 - 11 - 9:15
 * @Description: cn.zhaoqw.spring.jdbc.dao
 * @version: 1.0
 */
public class DeptDao {

    private JdbcTemplate jdbcTemplate;

    public Dept findByDeptNo(Integer deptno) {
        String sql = "select * from t_dept where deptno = ?";
        Dept dept = jdbcTemplate.queryForObject(sql, new Object[]{deptno}, new BeanPropertyRowMapper<Dept>(Dept.class));
        return dept;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
