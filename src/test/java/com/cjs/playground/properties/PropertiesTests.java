package com.cjs.playground.properties;

import com.cjs.playground.beanscope.Proto;
import com.cjs.playground.beanscope.Single;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootTest
class PropertiesTests {

	@Autowired
	private ApplicationContext ctx;


	@Test
	public void printProperties() {
		Environment environment = ctx.getEnvironment();
		System.out.println(environment.getProperty("name1"));
		System.out.println(environment.getProperty("name2"));
	}
}
