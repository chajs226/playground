package com.cjs.playground.resourceloader;

import com.cjs.playground.ApplicationEventPublisher.Event;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.scheduling.annotation.EnableAsync;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootTest
@EnableAsync
class ResourceLoaderTests {

	@Autowired
	private ResourceLoader resourceLoader;


	@Test
	public void startEvent() throws IOException {
		Resource resource = resourceLoader.getResource("classpath:test.txt");
		System.out.println(resource.exists());
		System.out.println(Files.readString(Path.of(resource.getURI())));
	}
}
