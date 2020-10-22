package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @author: Admin
 * @create: 2020/7/6 22:38
 */
@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!你好啊！";
    }

}
