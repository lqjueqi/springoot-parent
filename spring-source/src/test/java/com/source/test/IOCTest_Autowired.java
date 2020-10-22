package com.source.test;

import com.source.bean.Boss;
import com.source.bean.Car;
import com.source.bean.Color;
import com.source.config.MainConfigOfAutowired;
import com.source.dao.BookDao;
import com.source.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Admin
 * @create: 2020/10/19 17:11
 */
public class IOCTest_Autowired {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        //BookDao bookDao = applicationContext.getBean(BookDao.class);
        //System.out.println(bookDao);

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);


        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);


        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);

        applicationContext.close();
    }
}
