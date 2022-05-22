package test.goal.mathematics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.goal.mathematics.FactorialNumber;

class FactorialNumberTest {

	@Test
	void testFactorialNumber() {
		assertEquals(120,FactorialNumber.calFactorial(5));
	}
	
	@Test
	void testFactorialNumberRec() {
		assertEquals(120,FactorialNumber.calFactorialRec(5));
	}

}
