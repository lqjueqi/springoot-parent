package com.springboot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Admin
 * @create: 2020/7/8 18:25
 */
@SpringBootApplication
//@MapperScan("com.springboot.demo.mapper")
public class SpringbootMybatisApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApp.class,args);
    }
}
