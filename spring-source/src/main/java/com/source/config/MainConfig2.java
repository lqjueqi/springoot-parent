package com.source.config;

import com.source.bean.Color;
import com.source.bean.ColorFactoryBean;
import com.source.bean.Person;
import com.source.bean.Red;
import com.source.condition.LinuxCondition;
import com.source.condition.MyImportBeanDefinitionRegistrar;
import com.source.condition.MyImportSelector;
import com.source.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @author: Admin
 * @create: 2020/10/18 23:53
 */
@Conditional({WindowsCondition.class})
@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    //@Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加person");
        return new Person("张三", 25);
    }

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01() {
        return new Person("Bill Gates", 60);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02() {
        return new Person("linus", 50);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
