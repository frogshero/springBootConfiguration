package com.example.demoBootCore.registra;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(TestImportSelectorImpl.class)
public @interface TestImportSelector {

	//一个注解的参数可以驱动多个ImportBeanDefinitionRegistrar，所以叫Selector
	
	/**
	 * 
	 * ImportSelector: ConfigurationClassPostProcessor.processConfigBeanDefinitions里parser.parse(candidates);
	 * 而ImportBeanDefinitionRegistrar:在同一方法的里this.reader.loadBeanDefinitions(configClasses);
	 */	
	String[] value() default {};
}
