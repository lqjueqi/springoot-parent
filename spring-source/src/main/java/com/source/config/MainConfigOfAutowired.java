package com.source.config;

import com.source.bean.Car;
import com.source.bean.Color;
import com.source.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author: Admin
 * @create: 2020/10/19 17:06
 */
@Configuration
@ComponentScan({"com.source.service", "com.source.dao", "com.source.controller","com.source.bean"})
public class MainConfigOfAutowired {

    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }

    //@Bean标注的方法创建对象的时候，方法参数的值从容器中获取
    @Bean
    public Color color(Car car){
        Color color = new Color();
        color.setCar(car);
        return color;
    }
}
