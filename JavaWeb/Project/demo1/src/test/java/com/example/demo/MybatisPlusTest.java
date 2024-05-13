package com.example.demo;

import com.example.demo.demos.web.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper usermapper;

    @Test
    public void testSelectList(){
        usermapper.selectList(null).forEach(System.out::println);
    }
}
