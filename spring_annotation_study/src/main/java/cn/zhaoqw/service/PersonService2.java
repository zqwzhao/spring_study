package cn.zhaoqw.service;

import cn.zhaoqw.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/16 - 07 - 16 - 19:16
 * @Description: cn.zhaoqw.service
 * @version: 1.0
 */
@Component
public class PersonService2 {
    public PersonService2(){
        System.out.println("personService2");
    }

    @Autowired
    private PersonDao personDao2;
    public void save() {
        personDao2.save();
    }
}
