package com.zhaoqw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-08-31 21:27]
 */
@Controller
public class HelloController2 {

    @RequestMapping("/helloworld")
    public String  hello(Map<String,String> map) {
        map.put("hello","hello springmvc");
        return "hello";
    }
}
