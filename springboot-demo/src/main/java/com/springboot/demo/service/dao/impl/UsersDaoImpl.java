package com.springboot.demo.service.dao.impl;

import com.springboot.demo.pojo.Users;
import com.springboot.demo.service.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author: Admin
 * @create: 2020/7/8 16:24
 */
@Repository
public class UsersDaoImpl implements UsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertUsers(Users users) {
        String sql = "insert into users(username,usersex) values(?,?)";
        this.jdbcTemplate.update(sql, users.getUsername(), users.getUsersex());
    }
}
