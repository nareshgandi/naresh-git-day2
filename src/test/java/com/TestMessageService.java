package com;

import java.util.function.Supplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	
	@Test
	public void testMessage2() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertNotEquals("bye", ms.sayHello());
	}
	
	@Test
	public void testMessage3() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertSame("hello", "hello");
	
	}
	@Test
	public void testMessage4() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Supplier<String> message = null;
		Assertions.assertTrue(true, message);
	
	}
	@Test
	public void testMessage5() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertNotNull("hello","It is Null");
	
	}
	
	
}