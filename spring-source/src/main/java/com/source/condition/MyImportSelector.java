package com.source.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: Admin
 * @create: 2020/10/19 11:51
 */
//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {

    //返回值就是到导入到容器中的组件全类名
    //AnnotationMetadata：当前标注@Import注解的类的所有注解信息
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.source.bean.Blue", "com.source.bean.Yellow"};
    }
}
