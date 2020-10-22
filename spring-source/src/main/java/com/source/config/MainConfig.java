package com.source.config;

import com.source.bean.Person;
import com.source.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author: Admin
 * @create: 2020/10/18 18:47
 */
@Configuration
@ComponentScans(value = {
        @ComponentScan(value = "com.source", includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
        }, useDefaultFilters = false)
})
public class MainConfig {

    @Bean("person")
    public Person person01() {
        return new Person("lisi", 20);
    }
}
