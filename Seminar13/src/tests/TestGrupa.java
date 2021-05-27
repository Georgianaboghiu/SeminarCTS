package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import clase.Grupa;

public class TestGrupa {

	@Test
	public void TestConstructorRight() {
		Grupa grupa=new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
}
	@Test
	public void testLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorError() {
		Grupa grupa=new Grupa(100);
	}
	
	@Test(timeout=500)
	public void testPerformance() {
		Grupa grupa=new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa=new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
	
}
