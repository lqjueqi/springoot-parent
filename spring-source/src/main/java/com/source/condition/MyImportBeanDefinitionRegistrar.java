package com.source.condition;

import com.source.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: Admin
 * @create: 2020/10/19 12:04
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * AnnotationMetadata: 当前类的注解信息
     * BeanDefinitionRegistry: BeanDefinition注册类
     *      把所有需要添加到容器中的bean;调用
     *      BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean definition = registry.containsBeanDefinition("com.source.bean.Red");
        boolean definition2 = registry.containsBeanDefinition("com.source.bean.Blue");
        if (definition && definition2) {
            //指定Bean的定义信息；（Bean的类型，Bean...）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //注册一个Bean,指定bean名
            registry.registerBeanDefinition("rainBow", beanDefinition);
        }
    }
}
