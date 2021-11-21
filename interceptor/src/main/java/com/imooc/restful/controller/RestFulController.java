package com.imooc.restful.controller;

import com.imooc.restful.entity.Person;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-04 23:27]
 */

@RestController
@RequestMapping("/restful")
@CrossOrigin(origins = {"http://localhost:8080","http://www.imooc.com"})
public class RestFulController {

    @GetMapping("/request/{rid}")
    public String doGetRequest(@PathVariable("rid") int rid) {
        return "{\"message\":\"返回查询结果"+ rid +"\"}";
    }


    @PostMapping("/request/{rid}")
    public String doPostRequest(@PathVariable("rid") int rid ,Person person) {
        System.out.println(person.getName() + person.getAge());
        return "{\"message\":\"数据新建成功"+ rid +"\"}";
    }

    @PutMapping("/request/{rid}")
    public String doPutRequest(@PathVariable("rid") int rid,Person person) {
        System.out.println(person.getName() + person.getAge());
        return "{\"message\":\"数据更新成功"+ rid +"\"}";
    }

    @DeleteMapping("/request/{rid}")
    public String doDeleteRequest(@PathVariable("rid") int rid) {
        return "{\"message\":\"数据删除成功"+ rid +"\"}";
    }

    @GetMapping("/person")
    public Person findByPersonId(Integer id) {
        Person person = new Person();
        if (id==1) {
            person.setName("lily");
            person.setAge(23);
        }else if (id==2) {
            person.setName("smith");
            person.setAge(22);
        }
        return person;
    }


    @GetMapping("/persons")
    public List<Person> findByPersons() {
        List list = new ArrayList();
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("lily");
        p1.setAge(23);
        p1.setBirthday(new Date());
        p2.setName("牛叠为");
        p2.setAge(23);
        p2.setBirthday(new Date());
        list.add(p1);
        list.add(p2);
        return list;
    }
}
