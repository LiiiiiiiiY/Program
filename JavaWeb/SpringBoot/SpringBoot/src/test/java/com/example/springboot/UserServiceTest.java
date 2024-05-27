package com.example.springboot;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void test() {
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }

    @Test
    public void testPage() {
        Page<User> page = userService.page(new Page<>(1, 4));
        List<User> list = page.getRecords();
        list.forEach(System.out::println);
        System.out.println("当前页：" + page.getCurrent());
        System.out.println("每页显示的条数：：" + page.getSize());
        System.out.println("总记录数：:" + page.getTotal());
        System.out.println("总页数：：" + page.getPages());
        System.out.println("是否有上一页：:" + page.hasPrevious());
        System.out.println("是否有下一页：" + page.hasNext());
    }
}
