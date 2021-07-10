package cn.zhaoqw.service;

import cn.zhaoqw.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * @Auther: zhaoqw
 * @Date: 2021/7/9 - 07 - 09 - 21:07
 * @Description: cn.zhaoqw.service
 * @version: 1.0
 */
@Component
@Scope("prototype")
public class PersonService {
    @Autowired
    private PersonDao personDao;
    public void save() {
        personDao.save();
    }

}
