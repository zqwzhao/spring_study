package cn.zhaoqw.service;

import cn.zhaoqw.dao.EmployeeDao;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/8 - 08 - 08 - 10:22
 * @Description: cn.zhaoqw.service
 * @version: 1.0
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public void insert() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("插入一条员工数据");
        employeeDao.insert();
    }
}
