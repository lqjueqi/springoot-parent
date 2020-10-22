package com.source.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: Admin
 * @create: 2020/10/19 15:44
 */
@Component
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Dog() {
        System.out.println("dog...constructor...");
    }

    //对象创建并赋值之后调用
    @PostConstruct
    public void init() {
        System.out.println("dog...@PostConstruct...");
    }

    //容器移除对象之前
    @PreDestroy
    public void destroy() {
        System.out.println("dog...@PreDestroy...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}