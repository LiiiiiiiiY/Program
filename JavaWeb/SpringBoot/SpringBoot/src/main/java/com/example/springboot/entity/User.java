package com.example.springboot.entity;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;

    public User(){}

    public User(String name, Integer age, String gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }
}
