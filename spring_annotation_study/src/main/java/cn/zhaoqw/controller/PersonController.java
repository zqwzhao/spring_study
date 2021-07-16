package cn.zhaoqw.controller;

import cn.zhaoqw.dao.PersonDao;
import cn.zhaoqw.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Scope("singleton")
public class PersonController {

    public PersonController() {
        System.out.println("创建对象");
    }

    /**
     * 通过@Autowired完成自动注入功能
     * 是按照什么方式进行注入的呢？
     *  默认情况下是用type
     *  如果有多个type的时候，可以
     */
    @Autowired
    //@Qualifier("PersonService2")
    private PersonService personService22;
    public void save() {
        personService22.save();
    }

    @Autowired
    public void test(PersonDao dao) {
        System.out.println("test:" );

    }
}
