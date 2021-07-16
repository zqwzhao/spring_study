package cn.zhaoqw.dao;

import cn.zhaoqw.bean.Teacher;
import org.springframework.stereotype.Repository;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/16 - 07 - 16 - 19:54
 * @Description: cn.zhaoqw.dao
 * @version: 1.0
 */
@Repository
public class TeacherDao extends BaseDao<Teacher>{
    @Override
    public void save() {
        System.out.println("保存老师");
    }
}
