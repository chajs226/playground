package com.cjs.playground.beanscope;

import com.cjs.playground.PlaygroundApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BeanScopeTests {

	@Autowired
	private ApplicationContext ctx;

	@Test
	public void printBeanScope() {
		System.out.println("proto");
		System.out.println(ctx.getBean(Proto.class));
		System.out.println(ctx.getBean(Proto.class));

		System.out.println("single");
		System.out.println(ctx.getBean(Single.class));
		System.out.println(ctx.getBean(Single.class));

		System.out.println("proto by single");
		System.out.println(ctx.getBean(Single.class).getProto());
		System.out.println(ctx.getBean(Single.class).getProto());


	}
}
