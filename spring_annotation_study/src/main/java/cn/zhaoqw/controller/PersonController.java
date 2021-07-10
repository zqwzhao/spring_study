package cn.zhaoqw.controller;

import cn.zhaoqw.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/9 - 07 - 09 - 21:07
 * @Description: cn.zhaoqw.controller
 * @version: 1.0
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
     */
    @Autowired
    private PersonService personService;
    public void save() {
        personService.save();
    }
}
