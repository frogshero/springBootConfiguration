package com.example.demoBootCore.condition;

import org.springframework.context.annotation.Conditional;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@EnableScheduling
@Component
@Conditional(TestConditionImpl.class)
@Slf4j
public class TestCondition {

	@Scheduled(fixedDelay = 10000)
	public void doPrt() {
	    log.info("Print Something every 10 seconds------------------");
	}
}
