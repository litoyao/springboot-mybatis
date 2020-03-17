package com.example.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSON;
import com.example.entity.Order;
import com.example.entity.User;
import com.example.mapper.OrderMapper;
import com.example.mapper.UserMapper;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lito.yao
 * @create 2019/10/11 14:18
 */
@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/getUser/{id}")
    public String GetUser(@PathVariable int id) {
        User user = userMapper.selectById(id);
        return JSON.toJSONString(user);
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        int i = userMapper.deleteUser(id);

        System.out.println("delete user records:" + i);

        return "删除" + i + "条记录";
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        System.out.println(JSON.toJSON(user));
        userMapper.save(user);

        return user;
    }

    @GetMapping("/getOrders")
    public String getOrders() {
        List<Order> orders = orderMapper.selectAll();

        return JSON.toJSONString(orders);
    }

}
