package com.example.demoBootCore.registra;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;



public class TestImportSelectorImpl implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//AnnotationConfigApplicationContext(AbstractApplicationContext).invokeBeanFactoryPostProcessors里调用
		//ConfigurationClassParser.parse
		String[] ret = {TestImportSelectorRegistor.class.getName(), TestImportSelectorRegistor2.class.getName()};
		return ret;
	}

//	TestImportSelectorImpl.selectImports(AnnotationMetadata) line: 11	
//	ConfigurationClassParser.processImports(ConfigurationClass, SourceClass, Collection<SourceClass>, boolean) line: 618	
//	ConfigurationClassParser.doProcessConfigurationClass(ConfigurationClass, ConfigurationClassParser$SourceClass) line: 303	
//	ConfigurationClassParser.processConfigurationClass(ConfigurationClass) line: 245	
//	ConfigurationClassParser.parse(AnnotationMetadata, String) line: 202	
//	ConfigurationClassParser.parse(Set<BeanDefinitionHolder>) line: 170	
//	ConfigurationClassPostProcessor.processConfigBeanDefinitions(BeanDefinitionRegistry) line: 316	
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
