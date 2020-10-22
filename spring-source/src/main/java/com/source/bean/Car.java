package com.source.bean;

import org.springframework.stereotype.Component;

/**
 * @author: Admin
 * @create: 2020/10/19 13:40
 */
@Component
public class Car {

    public Car() {
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car init...");
    }

    public void destroy(){
        System.out.println("car destroy...");
    }
}
