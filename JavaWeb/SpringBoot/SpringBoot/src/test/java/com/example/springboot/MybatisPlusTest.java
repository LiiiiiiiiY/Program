package com.example.springboot;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testSelectList(){
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.setEmail("zhangsan@qq.com");
        user.setCreateTime(LocalDateTime.now());
        int result = userMapper.insert(user);
        System.out.println("受影响的行数：" + result);
        System.out.println("id的自动获取：" + user.getId());
    }

    @Test
    public void testDeleteById(){
        int result = userMapper.deleteById(1790333683112304641L);
        System.out.println("受影响的行数：" + result);
    }

    @Test
    public void testDeleteBatchIds(){
        List<Long> idList = Arrays.asList(1L, 2L,3L);
        int result = userMapper.deleteBatchIds(idList);
        System.out.println("受影响的行数：" + result);
    }

    @Test
    public void testDeleteByMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("age", 18);
        map.put("name", "张三");
        int result = userMapper.deleteByMap(map);
        System.out.println("受影响的行数：" + result);
    }

    @Test
    public void testUpdateById(){
        User user = new User();
        user.setId(1790336392557162497L);
        user.setName("李四");
        user.setEmail("lisi@qq.com");
        int result = userMapper.updateById(user);
        System.out.println("受影响的行数：" + result);
    }

    @Test
    public void testSelectById(){
        User user = userMapper.selectById(4L);
        System.out.println(user);
    }

    @Test
    public void testSelectBatchIds(){
        List<Long> idList = Arrays.asList(4L, 5L);
        List<User> list = userMapper.selectBatchIds(idList);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectByMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("age", 18);
        map.put("name", "张三");
        List<User> list = userMapper.selectByMap(map);
        list.forEach(System.out::println);
    }

    @Test
    public void testQueryWrapperInsert(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","李")
                .between("age", 20, 30)
                .isNotNull("email");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    @Test
    public void testQueryWrapperOrderBy(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("age").orderByAsc("id");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }


    @Test
    public void testQueryWrapperDelete(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email","");
        int result = userMapper.delete(queryWrapper);
        System.out.println("受影响的行数：" + result);
    }

    @Test
    public void testQueryWrapperFilter(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email","");
        int result = userMapper.delete(queryWrapper);
        System.out.println("受影响的行数：" + result);
    }



}
