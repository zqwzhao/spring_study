package com.zhaoqw.springmvc.controller;

import com.zhaoqw.springmvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @Auther: zhaoqwdalao
 * @Date: 2021/8/16 - 08 - 16 - 17:40
 * @Description: com.zhaoqw.springmvc.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/um")
public class UrlMappingController {

    //@GetMapping("/g")
    @RequestMapping(value = "/g", method = RequestMethod.GET) //等价于上面的@GetMapping("/g")
    @ResponseBody
    public String getMapping(@RequestParam("manager_name") String managerName) {
        System.out.println(managerName);
        return "this is a get method  ";
    }

    @GetMapping("/g1")
    @ResponseBody
    public String getMapping(User user,Date createDate) {
        System.out.println(user);
        System.out.println(createDate);
        return "this is a get method  中文";
    }

    @PostMapping("/p")
    @ResponseBody
    public String postMapping(String username, String password) {
        System.out.println("username:" + username +"   password:" +password);
        return "this is a post Method";
    }


    @PostMapping("/p1")
    @ResponseBody
    public String postMapping1(User user, String username,@DateTimeFormat(pattern = "yyyy-MM-dd") Date createDate) {
        System.out.println(user.getUsername() + ":" + user.getPassword());

        return "this is a post Method";
    }


    @GetMapping("/view")
    public ModelAndView showView() {
        ModelAndView modelAndView = new ModelAndView("view.jsp");
        modelAndView.setViewName("output");
        modelAndView.addObject("msg","hello.ModelAndView");
        return modelAndView;
    }
}

