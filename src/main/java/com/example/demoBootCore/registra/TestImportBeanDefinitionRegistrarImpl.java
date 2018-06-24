package com.example.demoBootCore.registra;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

public class TestImportBeanDefinitionRegistrarImpl implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
	    AnnotationAttributes annoAttrs = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(TestImportBeanDefinitionRegistrar.class.getName()));
		System.out.println(this.getClass().getName() + ":" + StringUtils.arrayToCommaDelimitedString(annoAttrs.getStringArray("value")));
		registry.registerBeanDefinition("testBean", new RootBeanDefinition(TestBean.class));
	}
	
	//call stack:
//	TestImportBeanDefinitionRegistrarImpl.registerBeanDefinitions(AnnotationMetadata, BeanDefinitionRegistry) line: 15	
//	ConfigurationClassBeanDefinitionReader.lambda$loadBeanDefinitionsFromRegistrars$1(ImportBeanDefinitionRegistrar, AnnotationMetadata) line: 358	
//	819245704.accept(Object, Object) line: not available	
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
//	DemoBootCoreApplication.main(String[]) line: 15	


}
