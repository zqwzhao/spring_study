package com.zhaoqw.springmvc.controller;

import com.zhaoqw.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/17 - 08 - 17 - 19:05
 * @Description: com.zhaoqw.springmvc.controller
 * @version: 1.0
 */
@Controller
public class ForwardController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user) {
        return      "<fieldset><legend>登陆成功</legend>用户名：" +user.getUsername()+
                "<br>密码："+user.getPassword()+"</fieldset>";
    }

    public String forward(@RequestParam("username") String name, @RequestParam("password") Long pass) {
        return "forward:/Welcome.html";
    }
}
