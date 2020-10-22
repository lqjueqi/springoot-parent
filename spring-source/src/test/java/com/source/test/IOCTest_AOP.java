package com.source.test;

import com.source.aop.MathCalculator;
import com.source.config.MainConfigOfAOP;
import com.source.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Admin
 * @create: 2020/10/19 13:56
 */
public class IOCTest_AOP {

    @Test
    public void test01() {
        //创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        MathCalculator calculator = applicationContext.getBean(MathCalculator.class);
        int result = calculator.div(1, 1);
        System.out.println(calculator.getClass() + "---" + result);
        applicationContext.close();
    }
}
