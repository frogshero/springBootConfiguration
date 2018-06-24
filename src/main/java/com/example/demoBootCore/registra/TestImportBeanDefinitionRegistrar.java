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
@Import(TestImportBeanDefinitionRegistrarImpl.class)
public @interface TestImportBeanDefinitionRegistrar {
	//类似mybatis的 @MapperScan, 自定义注解，可以添加类定义
	String[] value() default {};
	  
//	TestImportBeanDefinitionRegistrarImpl.registerBeanDefinitions(AnnotationMetadata, BeanDefinitionRegistry) line: 15	
//	ConfigurationClassBeanDefinitionReader.lambda$loadBeanDefinitionsFromRegistrars$1(ImportBeanDefinitionRegistrar, AnnotationMetadata) line: 358	
//	706665172.accept(Object, Object) line: not available	
//	LinkedHashMap<K,V>.forEach(BiConsumer<? super K,? super V>) line: not available	
//	ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsFromRegistrars(Map<ImportBeanDefinitionRegistrar,AnnotationMetadata>) line: 357	
//	ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForConfigurationClass(ConfigurationClass, ConfigurationClassBeanDefinitionReader$TrackedConditionEvaluator) line: 145	
//	ConfigurationClassBeanDefinitionReader.loadBeanDefinitions(Set<ConfigurationClass>) line: 117	
//	ConfigurationClassPostProcessor.processConfigBeanDefinitions(BeanDefinitionRegistry) line: 328	
//	ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry(BeanDefinitionRegistry) line: 233	
//	PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors(Collection<BeanDefinitionRegistryPostProcessor>, BeanDefinitionRegistry) line: 273	
//	PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory, List<BeanFactoryPostProcessor>) line: 93	
//	AnnotationConfigApplicationContext(AbstractApplicationContext).invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory) line: 694	
//	AnnotationConfigApplicationContext(AbstractApplicationContext).refresh() line: 532	
//	SpringApplication.refresh(ApplicationContext) line: 759	
//	SpringApplication.refreshContext(ConfigurableApplicationContext) line: 395	
//	SpringApplication.run(String...) line: 327	
//	SpringApplication.run(Class<?>[], String[]) line: 1255	
//	SpringApplication.run(Class<?>, String...) line: 1243	
//	DemoBootCoreApplication.main(String[]) line: 13	

}
