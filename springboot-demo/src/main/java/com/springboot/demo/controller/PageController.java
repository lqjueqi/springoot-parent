package com.springboot.demo.controller;

import com.springboot.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author: Admin
 * @create: 2020/7/7 23:51
 */
@Controller
public class PageController {

    //@RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @GetMapping("/show")
    public String show(Model model, HttpServletRequest request) {
        model.addAttribute("msg", "Hello,Thymeleaf");
        model.addAttribute("date", new Date());
        model.addAttribute("sex", "男");
        model.addAttribute("id", "12");

        List<User> list = new ArrayList<>();
        list.add(new User("1", "admin", 23));
        list.add(new User("2", "kevin", 22));
        list.add(new User("3", "oldlu", 25));
        model.addAttribute("list", list);

        Map<String, User> map = new HashMap<>();
        map.put("user1", new User("1", "admin", 23));
        map.put("user2", new User("2", "kevin", 22));
        map.put("user3", new User("3", "oldlu", 25));
        model.addAttribute("map", map);

        request.setAttribute("req", "httpServletRequest");
        request.getSession().setAttribute("ses", "httpSession");
        request.getSession().getServletContext().setAttribute("app", "application");

        model.addAttribute("id","100");
        model.addAttribute("name","oldlu");
        return "index";
    }

    @GetMapping("/show2")
    public String show2(String id, String name) {
        System.out.println(id + "\t" + name);
        return "index2";
    }

    @GetMapping("/show3/{id}/{name}")
    public String show3(@PathVariable String id,@PathVariable String name) {
        System.out.println(id + "\t" + name);
        return "index2";
    }
    @GetMapping("/show4/{id}")
    public String show4(@PathVariable String id, String name) {
        System.out.println(id + "\t" + name);
        return "index2";
    }

    @GetMapping("/show5")
    public String show5(){
        return "index3";
    }
}
