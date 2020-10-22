package com.springboot.demo.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @author: Admin
 * @create: 2020/7/8 20:40
 */
//@Configuration
public class GlobalException2 {

//    @Bean
//    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
//        SimpleMappingExceptionResolver resolver=new SimpleMappingExceptionResolver();
//        Properties properties=new Properties();
//        properties.put("java.lang.NullPointerException","error2");
//        properties.put("java.lang.ArithmeticException","error3");
//        resolver.setExceptionMappings(properties);
//        return resolver;
//    }
}
