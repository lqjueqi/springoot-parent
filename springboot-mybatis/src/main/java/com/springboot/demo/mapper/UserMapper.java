package com.springboot.demo.mapper;

import com.springboot.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Admin
 * @create: 2020/7/8 19:26
 */
@Mapper
public interface UserMapper {
    int insert(User user);
}
