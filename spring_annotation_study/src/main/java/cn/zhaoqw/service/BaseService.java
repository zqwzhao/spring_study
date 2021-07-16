package cn.zhaoqw.service;

import cn.zhaoqw.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/16 - 07 - 16 - 20:19
 * @Description: cn.zhaoqw.service
 * @version: 1.0
 */

public class BaseService<T>{
    @Autowired
    private BaseDao<T> baseDao;

    public void save() {
        baseDao.save();
    }
}
