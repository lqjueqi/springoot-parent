package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

/**
 * @author: Admin
 * @create: 2020/7/7 18:35
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model, HttpServletRequest request, HttpSession httpSession, ServletContext servletContext){
        model.addAttribute("msg","model,thymeleaf");
        model.addAttribute("ok","okok");
        return "index";
    }
    @GetMapping("/index1")
    public String index1(ModelMap modelMap){
        modelMap.addAttribute("msg","modelMap,thymeleaf");
        modelMap.put("msg1","modelmap");
        return "index";
    }
    @GetMapping("/index2")
    public String index2(Map<String,Object> map){
        map.put("msg","map,thymeleaf");
        return "index";
    }

    @GetMapping("/index3")
    public ModelAndView index3(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","ModelAndView,thymeleaf");
        mv.setViewName("index");
        return mv;
    }
}
