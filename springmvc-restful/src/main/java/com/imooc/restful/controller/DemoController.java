package com.imooc.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-03 20:36]
 */
@Controller
public class DemoController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {

        System.out.println("hello");
        return "hellol";
    }
}
