package cn.zhaoqw.dao;

import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public class PersonDao {
    public void save() {
        System.out.println("保存成功");
    }
}
