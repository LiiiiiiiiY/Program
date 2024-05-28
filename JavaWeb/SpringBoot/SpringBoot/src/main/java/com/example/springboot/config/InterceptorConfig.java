package com.example.springboot.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //拦截所有路径
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
//        //不拦截/test/getMsg请求
//        //.excludePathPatterns("/test/getMsg");
//        //不拦截/test下的所有请求
//        //.excludePathPatterns("/**/test/**");
//    }
}
