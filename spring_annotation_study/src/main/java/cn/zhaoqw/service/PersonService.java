package cn.zhaoqw.service;

import cn.zhaoqw.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 */
@Component
public class PersonService {
    public PersonService(){
        System.out.println("personService");
    }

    @Autowired
    private PersonDao personDao;
    public void save() {
        personDao.save();
    }



    public void update() {
        personDao.update();
    }

}
