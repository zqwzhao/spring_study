package cn.zhaoqw.dao;

import cn.zhaoqw.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/16 - 07 - 16 - 19:56
 * @Description: cn.zhaoqw.dao
 * @version: 1.0
 */

@Repository
public class StudentDao extends BaseDao<Student>{
    @Override
    public void save() {
        System.out.println("保存学生");
    }
}
