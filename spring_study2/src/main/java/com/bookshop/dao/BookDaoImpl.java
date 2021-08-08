package com.bookshop.dao;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/25 - 07 - 25 - 17:54
 * @Description: com.bookshop.dao
 * @version: 1.0
 */
public class BookDaoImpl implements BookDao{
    @Override
    public void insert() {
        System.out.println("向bookdao中插入一条数据");
    }
}
