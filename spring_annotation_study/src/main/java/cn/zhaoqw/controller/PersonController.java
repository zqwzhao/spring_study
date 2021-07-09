package cn.zhaoqw.controller;

import cn.zhaoqw.service.PersonService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/9 - 07 - 09 - 21:07
 * @Description: cn.zhaoqw.controller
 * @version: 1.0
 */

@Component("personController02")
@Scope("singleton")
public class PersonController {
    private PersonService personService;

    public void save() {
    }
}
