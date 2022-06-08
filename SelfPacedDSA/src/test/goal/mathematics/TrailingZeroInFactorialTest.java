package test.goal.mathematics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.goal.mathematics.PalindromeNumber;
import main.goal.mathematics.TrailingZeroInFactorial;

class TrailingZeroInFactorialTest {

	@Test
	void testTrailingZeroInFactorial() {
		assertEquals(0,TrailingZeroInFactorial.calTrailZeroFact(4));
		
		assertEquals(62,TrailingZeroInFactorial.calTrailZeroFact(251));
	}

}
