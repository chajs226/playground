package com.cjs.playground.ApplicationEventPublisher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootTest
@EnableAsync
class ApplicationEventPublisherTests {

	@Autowired
	private ApplicationEventPublisher eventPublisher;


	@Test
	public void startEvent() {
		Event event = new Event("event data");
		eventPublisher.publishEvent(event);
	}
}
