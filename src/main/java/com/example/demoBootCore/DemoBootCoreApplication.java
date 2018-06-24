package com.example.demoBootCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.defer.TestDeferBean;
import com.example.defer.TestDeferSelector;
import com.example.demoBootCore.registra.TestBean;
import com.example.demoBootCore.registra.TestImportBeanDefinitionRegistrar;
import com.example.demoBootCore.registra.TestImportSelector;

@SpringBootApplication
@TestImportBeanDefinitionRegistrar(value="111111111111111111")
@TestImportSelector("2222222222222")
@TestDeferSelector("33333333333")
@RestController
//@ComponentScan("com.example.defer")
public class DemoBootCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBootCoreApplication.class, args);
	}

	@Autowired
	private TestBean testBean;
	
	@RequestMapping("aa")
	public String getStr() {
		return testBean.getStr();
	}
	
	//Field testDeferBean in com.example.demoBootCore.DemoBootCoreApplication required a bean of type 'com.example.defer.TestDeferBean' that could not be found.
	@Autowired
	private TestDeferBean testDeferBean;
	
	@RequestMapping("bb")
	public String getStr2() {
		return testDeferBean.getStr();
	}
}
