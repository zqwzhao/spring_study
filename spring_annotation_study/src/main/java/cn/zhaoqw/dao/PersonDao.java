package cn.zhaoqw.dao;

import org.springframework.stereotype.Component;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/9 - 07 - 09 - 21:07
 * @Description: cn.zhaoqw.dao
 * @version: 1.0
 */
@Component
public class PersonDao {
    public void save() {
        System.out.println("保存成功");
    }
}
