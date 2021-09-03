package com.zhaoqw.controller;

import com.zhaoqw.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-08-31 21:45]
 */
@Controller

public class ViewController {

        @GetMapping("/helloworld")
        @ResponseBody
        public String hello() {
            return "helloworld";
        }

        @GetMapping("/view")
        public ModelAndView showView(Integer userId) {
            //ModelAndView mav = new ModelAndView("redirect:/view.jsp");
            ModelAndView mav = new ModelAndView();
            mav.setViewName("/um/view.jsp");
            User user = new User();
            user.setUserid(userId);
            if (userId == 1) {
                user.setUsername("lily");
            }else if (userId==2){
                user.setUsername("smith");
            }else if (userId == 3) {
                user.setUsername("lina");
            }
            mav.addObject("user",user);
            return mav;
        }




}
