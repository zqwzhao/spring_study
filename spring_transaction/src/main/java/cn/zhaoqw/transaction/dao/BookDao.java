package cn.zhaoqw.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/15 - 08 - 15 - 10:50
 * @Description: cn.zhaoqw.transaction.dao
 * @version: 1.0
 */
@Repository
public class BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 减去某个用户的余额
     */
    public void updateBalance(String name,int price) {
        String sql = "update account set balance = balance - ? where username = ?";
        jdbcTemplate.update(sql,price,name);
    }

    /**
     * 按照图书的id来获取图书的价格
     * @param id
     * @return
     */
    public int getPrice(int id){
        String sql = "select price from book where id=?";
        return jdbcTemplate.queryForObject(sql,Integer.class,id);
    }

    /**
     * 减库存，减去某本书的库存
     * @param id
     */
    public void updateStock(int id){
        String sql = "update book_stock set stock=stock-1 where id=?";
        jdbcTemplate.update(sql,id);
    }
}