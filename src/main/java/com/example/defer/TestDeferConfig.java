package com.example.defer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestDeferConfig {

	@Bean
	public TestDeferBean getDeferBean() {
		return new TestDeferBean();
	}
}
