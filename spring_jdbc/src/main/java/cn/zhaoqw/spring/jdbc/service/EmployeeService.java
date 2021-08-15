package cn.zhaoqw.spring.jdbc.service;

import cn.zhaoqw.spring.jdbc.dao.EmployeeDao;
import cn.zhaoqw.spring.jdbc.entity.Employee;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;

import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/11 - 08 - 11 - 9:35
 * @Description: cn.zhaoqw.spring.jdbc.service
 * @version: 1.0
 */
public class EmployeeService {
    private EmployeeDao employeeDao;
    private DataSourceTransactionManager transactionManager;

    public void batchImport() {
        //定义了事务默认的管理配置
        TransactionDefinition definition = new DefaultTransactionDefinition();

        //开始一个事务
        TransactionStatus status = transactionManager.getTransaction(definition);

        try{
            for (int i = 1; i <= 10; i++) {
                Employee employee = new Employee();
                employee.setEmpno(8000 + i);
                employee.setEname("yvangong" + i);
                employee.setSal(4000f);
                employee.setDeptno(40);
                employee.setComm(100f);
                employee.setJob("xiaoshou");
                employeeDao.insert(employee);
            }

            //提交事务
            transactionManager.commit(status);
        }catch (Exception e) {
            //产生错误，就回滚
            transactionManager.rollback(status);
            e.printStackTrace();
        }




    }

    public void batchImport2() {
        try{

            for (int i = 1; i <= 10; i++) {
                if (i == 3) {
                    throw new RuntimeException("意料之外的异常");
                }
                Employee employee = new Employee();
                employee.setEmpno(8000 + i);
                employee.setEname("yvangong" + i);
                employee.setSal(4000f);
                employee.setDeptno(40);
                employee.setComm(100f);
                employee.setJob("xiaoshou");
                employeeDao.insert(employee);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public TransactionManager getTransactionManager() {
        return transactionManager;
    }

    public void setTransactionManager(DataSourceTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
}
