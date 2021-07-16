package cn.zhaoqw.controller;

import cn.zhaoqw.bean.Student;
import cn.zhaoqw.dao.BaseDao;
import cn.zhaoqw.dao.StudentDao;
import cn.zhaoqw.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/16 - 07 - 16 - 19:57
 * @Description: cn.zhaoqw.controller
 * @version: 1.0
 */
public class BaseController{
//    @Autowired
//    TeacherDao teacherDao;
//    @Autowired
//    StudentDao studentDao;
    @Autowired
    BaseDao baseDao;
    public void save() {
        baseDao.save();
    }


}
