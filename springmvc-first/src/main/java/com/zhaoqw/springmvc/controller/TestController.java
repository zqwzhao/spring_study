package com.zhaoqw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/16 - 08 - 16 - 17:24
 * @Description: com.zhaoqw.springmvc.controller
 * @version: 1.0
 */
@Controller
public class TestController {
    @GetMapping("/t")
    @ResponseBody //直接向相应输出字符串数据，不跳转页面
    public String test() {
        return "Hello Spring mvc";
    }
}
