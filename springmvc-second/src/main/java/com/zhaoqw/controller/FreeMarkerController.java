package com.zhaoqw.controller;

import com.zhaoqw.bean.Product;
import com.zhaoqw.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-02 21:59]
 */
@Controller
@RequestMapping("/fm")
public class FreeMarkerController {
    @GetMapping("/test")
    public ModelAndView showTest() {
        ModelAndView mav = new ModelAndView("/test");
        User user = new User();
        user.setUsername("andy");
        mav.addObject("u",user);
        return mav;
    }


    @GetMapping("/list")
    public ModelAndView showList() {
        ModelAndView mav = new ModelAndView("/list");
        List<Product> list = new ArrayList<>();
        list.add(new Product(1001,"华为",2000f,new Date()));
        list.add(new Product(1002,"小米",3000f,new Date()));
        list.add(new Product(1003,"vivo",3000f,new Date()));
        mav.addObject("products",list);
        return mav;
    }
}
