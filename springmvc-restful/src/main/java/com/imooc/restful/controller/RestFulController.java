package com.imooc.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-03 20:17]
 */
@Controller
@RequestMapping("/restful")
public class RestFulController {
    @GetMapping("/request")
    @ResponseBody
    public String doGetRequest() {
        return "{\"message\":\"返回查询结果\"}";
    }
}
