package com.source.test;

import com.source.config.MainConfig2;
import com.source.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Admin
 * @create: 2020/10/19 13:56
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01() {
        //创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");

        Object car = applicationContext.getBean("car");
        Object car2 = applicationContext.getBean("car");
        System.out.println(car == car2);
        //关闭容器
        applicationContext.close();
    }
}
