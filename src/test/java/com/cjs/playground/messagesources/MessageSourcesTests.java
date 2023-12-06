package com.cjs.playground.messagesources;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.util.ObjectUtils;

import java.util.Locale;

@SpringBootTest
class MessageSourcesTests {

	@Autowired
	private MessageSource messageSource;

	@Test
	public void printProperties() {
		System.out.println(messageSource.getMessage("greeting", new String[] {"Junseong"}, Locale.getDefault()));
		System.out.println(messageSource.getMessage("greeting", new String[] {"Junseong"}, Locale.KOREA));
	}
}
