package com.zhaoqw.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-08-31 17:06]
 */
public class HelloController implements Controller {

    public void hello() {

    }


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println(this.getClass().getName() + "-------------");

        ModelAndView mv = new ModelAndView();

        //添加视图名称
        mv.setViewName("hello");
        //向前端页面添加的属性值
        mv.addObject("hello","hello springmvc");
        return mv;
    }
}
