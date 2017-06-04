package com.example;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO write description for class
 *
 * @author Tommy Ludwig
 */
public class SpringJUnit4Test {

	private final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

	@After
	public void restore() {
		this.context.close();
	}

	@Test
	public void contextLoads() {
		this.context.refresh();
	}
}
