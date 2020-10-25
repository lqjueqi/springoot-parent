package com.source.test;

import com.source.ext.ExtConfig;
import com.source.tx.TxConfig;
import com.source.tx.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Admin
 * @create: 2020/10/19 13:56
 */
public class IOCTest_Ext {

    @Test
    public void test01() {
        //创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);

        applicationContext.publishEvent(new ApplicationEvent(new String("我要发布事件")) {
        });
        applicationContext.close();
    }
}
