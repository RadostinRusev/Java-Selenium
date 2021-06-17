package com.java.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcAddition {

	static Calc calculator;
	@BeforeAll
	public static void setupAll() {		
		 calculator  = new Calc ();
	}
	
	@Test
	@DisplayName("Valid 5 +3 =8")
 public void addCalcTest() {
	
	//	assertEquals(8,calculator.add(5,3));
		Assertions.assertThat(calculator.add(5,3)).isNotNull();
		assertAll("addition asserts failed",() -> assertEquals(8,calculator.add(5,3)),				
				() -> assertEquals(4,calculator.add(5,3))
				);
		}
				 
	@Test
	@DisplayName("Valid 5 +3 =8")
 public void addCalc_NotValid() {
		assertNotEquals(7,calculator.add(5,3));
		
 }
	@Test
	public void TEst() {
		 ArrayList<Integer> NumberList = new ArrayList<Integer>();
		 NumberList.add(1);
		 NumberList.add(1);
		 NumberList.add(1);
		
		 Assertions.assertThat(NumberList).isNotEmpty().size().isEqualTo(3).returnToIterable().anyMatch((number) -> number%2==0);
	}
}
