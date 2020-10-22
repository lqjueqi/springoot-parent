package com.source.test;

import com.source.bean.Yellow;
import com.source.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.sql.DataSource;

/**
 * @author: Admin
 * @create: 2020/10/19 18:50
 */
public class IOCTest_Profile {

    @Test
    public void test01(){
        //AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("test","dev");
        //注册配置类
        applicationContext.register(MainConfigOfProfile.class);
        //启动刷新容器
        applicationContext.refresh();

        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for(String name : namesForType) {
            System.out.println(name);
        }

        Yellow bean = applicationContext.getBean(Yellow.class);
        System.out.println(bean);
        applicationContext.close();
    }
}
