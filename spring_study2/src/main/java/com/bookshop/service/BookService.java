package com.bookshop.service;

import com.bookshop.dao.BookDao;
import com.bookshop.dao.BookDaoImpl;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/25 - 07 - 25 - 17:54
 * @Description: com.bookshop.service
 * @version: 1.0
 */
public class BookService {
    private BookDao dao;

    public void purchase() {
        System.out.println("正在执行图书采购业务方法");
        dao.insert();
    }

    public BookDao getDao() {
        return dao;
    }

    public void setDao(BookDao dao) {
        this.dao = dao;
    }
}
