package test.goal.mathematics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.goal.mathematics.CountDigit;

class CountDigitTest {
	
	@Test
	void testCountDigit() {
		
		assertEquals(3,CountDigit.countDigit(923));
	}
	
	@Test
	void testCountDigitForZero() {
		
		assertEquals(0,CountDigit.countDigit(0));
	}

}
