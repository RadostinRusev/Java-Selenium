package com.java.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestMultiply {

	static Calc calculator;
	@BeforeAll
	public static void setupAll() {		
		 calculator  = new Calc ();
	}
	
	@Test
	@DisplayName("Valid 5 +3 =8")
 public void multiplyCalcTest() {
	
		assertEquals(15,calculator.multiply(5,3));
 }
	@Test
	@DisplayName("Valid 5 +3 =8")
 public void multiplyCalc_FailedTest() {
	
		assertNotEquals(16,calculator.multiply(5,3));
 }
	@Test
	@DisplayName("Valid 5 +3 =8")
 public void negativemultiplyCalc_FailedTest() {
	
		assertEquals(-15,calculator.multiply(5,-3));
 }
}
