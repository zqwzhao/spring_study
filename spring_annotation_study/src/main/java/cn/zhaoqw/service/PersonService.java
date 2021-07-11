package cn.zhaoqw.service;

import cn.zhaoqw.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
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
