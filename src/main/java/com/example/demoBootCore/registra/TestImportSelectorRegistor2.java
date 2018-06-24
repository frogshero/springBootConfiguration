package com.example.demoBootCore.registra;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

public class TestImportSelectorRegistor2 implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
	    AnnotationAttributes annoAttrs = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(TestImportSelector.class.getName()));
	    //ClassPathMapperScanner scanner = new ClassPathMapperScanner(registry);
		System.out.println(this.getClass().getName() + ":" + StringUtils.arrayToCommaDelimitedString(annoAttrs.getStringArray("value")));
		//registry.registerBeanDefinition(beanName, beanDefinition); !!!
	}
	

}
