package com.example.demoBootCore.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class TestConditionImpl implements Condition {

	//param arguments: --CCC_ENABLED=true
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String cccEnabled = context.getEnvironment().getProperty("CCC_ENABLED");
		return StringUtils.hasText(cccEnabled) && cccEnabled.equals("true");
	}

}
