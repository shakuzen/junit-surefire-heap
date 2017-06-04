package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO write description for class
 *
 * @author Tommy Ludwig
 */
class SpringJUnitJupiterTest {

	private final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

	@AfterEach
	void restore() {
		this.context.close();
	}

	@Test
	void contextLoads() {
		this.context.refresh();
	}
}
