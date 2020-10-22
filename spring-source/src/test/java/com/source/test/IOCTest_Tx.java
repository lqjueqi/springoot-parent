package com.source.test;

import com.source.aop.MathCalculator;
import com.source.config.MainConfigOfAOP;
import com.source.tx.TxConfig;
import com.source.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Admin
 * @create: 2020/10/19 13:56
 */
public class IOCTest_Tx {

    @Test
    public void test01() {
        //创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService= applicationContext.getBean(UserService.class);
        userService.insertUser();
        applicationContext.close();
    }
}
