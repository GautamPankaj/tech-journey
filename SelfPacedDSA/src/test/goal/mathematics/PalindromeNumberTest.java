package test.goal.mathematics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.goal.mathematics.PalindromeNumber;

class PalindromeNumberTest {

	@Test
	void testIfNumberPalindrome() {
		assertEquals(true,PalindromeNumber.checkIfPalindrome(78987));
		
		assertEquals(false,PalindromeNumber.checkIfPalindrome(78907));
	}

}
