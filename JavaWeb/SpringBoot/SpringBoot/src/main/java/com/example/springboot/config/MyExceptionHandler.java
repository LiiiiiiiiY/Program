package com.example.springboot.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
//    @ExceptionHandler(value = Exception.class)
//    public String exception(Exception e) {
//        System.out.println("发生了一个异常"+e);
//        return e.getMessage();
//    }
}
