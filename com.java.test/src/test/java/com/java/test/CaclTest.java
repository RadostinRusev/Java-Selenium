package com.java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CaclTest {

	static Calc calculator;
	@BeforeAll
	public static void setupAll() {		
		 calculator  = new Calc ();
	}
	
//	@BeforeEach
//	public void setup() {		
//		Calc calculator  = new Calc ();
//	}
//	@AfterEach
//	public void after(){
//		System.out.print("nene");
//	}
	
	//@Nested
//	class SubTest{
//		@Test
//		@DisplayName("invalid substraction 5-3=3")
//	 public void substractCalc_InvalidTesta() {
//			Calc calculator  = new Calc ();
//			assertNotEquals(2,calculator.substract(6,3));
//	}
//	}
	@Test
	@DisplayName("substract 5-3=2")
 public void substractCalcTest() {
	
		assertEquals(2,calculator.substract(5,3));
 }
	@Test
	@DisplayName("invalid substraction 5-3=3")
 public void substractCalc_InvalidTest() {
	
		assertNotEquals(2,calculator.substract(6,3));
}
	@Test
	@DisplayName("invalid substraction 5-3=3")
 public void substractCalc_InvalidTesta() {
	
		assertNotEquals(2,calculator.substract(6,3));
}
	@Test
	@DisplayName("invalid  5-3=3")
 public void substractCalsc_InvalidTesta() {
		assertThrows(ArithmeticException.class, ()-> calculator.divide(2, 0) );
}
}