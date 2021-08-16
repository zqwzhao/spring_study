package cn.zhaoqw.transaction.service;

import cn.zhaoqw.transaction.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/16 - 08 - 16 - 9:26
 * @Description: cn.zhaoqw.transaction.service
 * @version: 1.0
 */
@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    /**
     * 结账：传入哪个用户买了哪本书
     * @param username
     * @param id
     */
    @Transactional(timeout = 3,readOnly = false, noRollbackFor = {NullPointerException.class,
    ArithmeticException.class},propagation = Propagation.REQUIRES_NEW)
    public void checkout(String username,int id){

        bookDao.updateStock(id);

        int price = bookDao.getPrice(id);
        bookDao.updateBalance(username,price);
        int i = 1/0;
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = ArithmeticException.class)
    public void updatePrice(int id,int price){
        bookDao.updatePrice(id,price);
        int i = 1/0;
    }

}
