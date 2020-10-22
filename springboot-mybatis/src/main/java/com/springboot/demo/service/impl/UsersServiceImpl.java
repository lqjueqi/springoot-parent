package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.UserMapper;
import com.springboot.demo.pojo.User;
import com.springboot.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Admin
 * @create: 2020/7/8 19:28
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void addUser(User user) {
        this.userMapper.insert(user);
    }
}
