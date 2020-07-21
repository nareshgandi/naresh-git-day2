package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {

	CalculatorService calculatorService = new CalculatorService();

	@Test
	public void testSum() {
		
		Assertions.assertEquals(30, calculatorService.sum());
	
	}
	
	@Test
	public void testMultiply() {
		
		Assertions.assertEquals(200, calculatorService.multiply());
	}
	
	@Test
	public void testMinus() {
		
		Assertions.assertEquals(-10, calculatorService.minus());
	}
	
	@Test
	public void testDivide() {
		
		Assertions.assertEquals(0, calculatorService.divide());
	}
	@Test
	public void testnull() {
		
		String messageSupplier = null;
		Assertions.assertNotSame(calculatorService.sum(), calculatorService.multiply(), messageSupplier);
	}
}
