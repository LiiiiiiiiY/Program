package com.example.springboot.controller;


import com.example.springboot.config.Result;
import com.example.springboot.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    @RequestMapping("/testResult")
    public Result<?> testResult(){
        return Result.ok();
    }

    @RequestMapping("/testResult1")
    public Result<?> testResult1(){
        return Result.ok("testResult1");
    }

    @RequestMapping("/testResult2")
    public Result<?> testResult2(){
        return Result.ok(100.0);
    }

    @RequestMapping("/testResult3")
    public Result<?> testResult3(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("tom",18,"male","tom@163.com"));
        userList.add(new User("bob",19,"male","bob@163.com"));
        userList.add(new User("alice",18,"female","bob@163.com"));
        return Result.ok(userList);
    }
}
