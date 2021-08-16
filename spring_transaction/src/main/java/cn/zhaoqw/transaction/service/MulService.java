package cn.zhaoqw.transaction.service;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/17 - 08 - 17 - 15:33
 * @Description: cn.zhaoqw.transaction.service
 * @version: 1.0
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MulService {

    @Autowired
    private BookService bookService;

    @Transactional
    public void mulTx(){
        bookService.checkout("zhangsan",1);
        bookService.updatePrice(1,1000);
    }
}