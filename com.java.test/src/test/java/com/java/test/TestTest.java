package com.java.test;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestTest {
	
	@Test
 public void isevenCaclTest() {
	 assertTrue(iseven(4),"Number is not even");
 }
	@Test
	public void isevenCaclTest_notEvenNumber() {
		 assertFalse(iseven(3),"Number is even");
	 }
	
	public boolean iseven(int number) {
		return number % 2==0;
	}
	@ParameterizedTest(name= "Test is tested")
	@ValueSource(ints = {1,2,3,4,5,5})
	 public void isevenCaclTesta(int number) {
		 assertTrue(iseven(number),"Number is not even");
	 }
}
