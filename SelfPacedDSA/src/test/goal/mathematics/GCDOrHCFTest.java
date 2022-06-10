package test.goal.mathematics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.goal.mathematics.GCDorHCF;

class GCDOrHCFTest {

	@Test
	void testCalOptGCDEuclid() {
		assertEquals(5,GCDorHCF.calOptGCDEuclid(5,15));
	}
	
	@Test
	void testCalGCDEuclid() {
		assertEquals(1,GCDorHCF.calGCDEuclid(4,3));
	}
	
	@Test
	void testCalGCDNaive() {
		assertEquals(2,GCDorHCF.calGCDNaive(4,6));
	}


}
