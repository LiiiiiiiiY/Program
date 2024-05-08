package com.example.springboot.demos.web;

public class User {
    private String id;
    private String name;
    private Integer age;
    private String tel;
    public String toString(){
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", tel=" + tel + "]";
    }
}