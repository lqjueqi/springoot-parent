package com.springboot.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: Admin
 * @create: 2020/7/8 20:28
 * 全局异常处理
 */
//@ControllerAdvice
public class GlobalException {

//    @ExceptionHandler(value = {java.lang.NullPointerException.class})
//    public ModelAndView nullpointExceptionHandler(Exception e){
//        ModelAndView mv =new ModelAndView();
//        mv.addObject("err",e.toString());
//        mv.setViewName("error1");
//        return mv;
//    }
}
