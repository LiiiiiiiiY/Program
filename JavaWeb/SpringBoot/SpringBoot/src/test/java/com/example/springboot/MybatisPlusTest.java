package com.example.springboot;

import com.example.Mapper.UserMapper;
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
