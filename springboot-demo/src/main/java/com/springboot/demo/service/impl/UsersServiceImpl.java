package com.springboot.demo.service.impl;

import com.springboot.demo.pojo.Users;
import com.springboot.demo.service.UsersService;
import com.springboot.demo.service.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Admin
 * @create: 2020/7/8 16:22
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    @Transactional
    public void addUser(Users users) {
        this.usersDao.insertUsers(users);
    }
}
