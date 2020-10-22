package com.springboot.demo.controller;

import com.springboot.demo.pojo.User;
import com.springboot.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Admin
 * @create: 2020/7/8 19:22
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

//    @PostMapping("/addUser")
//    public String addUser(User user){
//        try{
//            usersService.addUser(user);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "error";
//        }
//        return "redirect:/ok";
//    }
    @RequestMapping("/addUser")
    public String addUser(@Validated User user, BindingResult result){
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for(ObjectError err:list){
                FieldError fieldError = (FieldError) err;
                String FieldName = fieldError.getField();
                String msg = fieldError.getDefaultMessage();
                System.out.println(FieldName+ "\t" +msg);
            }
            return "addUser";
        }
        System.out.println(user);

        return "ok";
    }

    @RequestMapping("/showinfo")
    public String showinfo(){
        String str=null;
        str.length();
        return "ok";
    }
    @RequestMapping("/showinfo1")
    public String showinfo1(){
        int i=10/0;
        return "ok";
    }

}
