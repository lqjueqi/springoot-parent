package com.source.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author: Admin
 * @create: 2020/10/22 19:37
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "insert into tbl_user(username,age) values(?,?)";
        String username = UUID.randomUUID().toString().substring(0,5);
        jdbcTemplate.update(sql, username , 18);
    }
}
