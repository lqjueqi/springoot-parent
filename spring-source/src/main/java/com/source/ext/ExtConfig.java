package com.source.ext;

import com.source.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Admin
 * @create: 2020/10/23 16:03
 */
@Configuration
@ComponentScan("com.source.ext")
public class ExtConfig {

    @Bean
    public Blue blue(){
        return new Blue();
    }
    
}

