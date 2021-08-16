package com.zhaoqw.springmvc.controller;

import com.zhaoqw.springmvc.entity.Form;
import com.zhaoqw.springmvc.entity.IdCard;
import com.zhaoqw.springmvc.entity.User;
import com.zhaoqw.springmvc.entity.User2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/17 - 08 - 17 - 19:28
 * @Description: com.zhaoqw.springmvc.controller
 * @version: 1.0
 */
@Controller
public class FormController {

    @RequestMapping("/apply1")
    @ResponseBody
    public String apply(@RequestParam(value = "name",defaultValue = "zhaoqw") String name, String cource, Integer[] purpose) {
        System.out.println(name);
        System.out.println(cource);
        for (Integer integer : purpose) {
            System.out.println(integer);
        }
        return "Success";
    }

    @RequestMapping("/apply2")
    @ResponseBody
    public String apply(@RequestParam(value = "name",defaultValue = "zhaoqw") String name, String cource,@RequestParam List<Integer> purpose) {
        System.out.println(name);
        System.out.println(cource);
        for (Integer integer : purpose) {
            System.out.println(integer);
        }
        return "Success";
    }

    @RequestMapping("/apply")
    @ResponseBody
    public String apply(Form form) {
        System.out.println(form);
        return "Success";
    }

    @RequestMapping("/apply3")
    @ResponseBody
    public String apply(@RequestParam Map map) {
        System.out.println(map);
        return "Success";
    }

    @RequestMapping("/applyforform2")
    @ResponseBody
    public String apply(User2 user2) {
        System.out.println(user2);
        return "Success";
    }




}
