package com.springboot.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author: Admin
 * @create: 2020/7/8 14:29
 * 配置类
 */
//@Configuration
//@PropertySource("classpath:/jdbc.properties") //加载指定的配置文件
//@EnableConfigurationProperties(JdbcProperties.class) //指定加载哪个配置属性类
public class JdbcConfiguration {

//    //@Autowired  //属性注入
//    private JdbcProperties jdbcProperties;
//
//    //构造注入
//    public JdbcConfiguration(JdbcProperties jdbcProperties) {
//        this.jdbcProperties = jdbcProperties;
//    }

    //    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//
//    @Value("${jdbc.url}")
//    private String url;
//
//    @Value("${jdbc.username}")
//    private String username;
//
//    @Value("${jdbc.password}")
//    private String password;

//    @Bean
//    public DataSource getDataSource(JdbcProperties jdbcProperties){//方法入参注入
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        dataSource.setUrl(jdbcProperties.getUrl());
//        dataSource.setUsername(jdbcProperties.getUsername());
//        dataSource.setPassword(jdbcProperties.getPassword());
//        return dataSource;
//    }


    @Bean
    @ConfigurationProperties(prefix = "jdbc") //优雅使用@ConfigurationProperties
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
