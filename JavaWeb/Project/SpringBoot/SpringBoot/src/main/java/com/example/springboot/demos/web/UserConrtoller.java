package com.example.springboot.demos.web;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserConrtoller {

    @RequestMapping("/getUser")
    public String getUser(String id){
        return "getUser id:" + id;
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        return user.toString();
    }
}
