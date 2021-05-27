package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import clase.Grupa;
import clase.Student;

public class TestGrupa {
	
	private Grupa grupa;
	
	@Before
	public void setUp() {
		
		grupa=new Grupa(1077);
		for(int i=0;i<35;i++) {
			Student student=new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		
	}

	@Test
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1005);
		for(int i=0;i<10;i++)
		{
			Student student=new Student();
			student.adaugaNota(i+1);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.6f, grupa.getPromovabilitate(), 0.001f);
		
	}
	
	@Test
	public void testGetPromovabilitateLowerBoundary() {
		assertEquals(0, grupa.getPromovabilitate(),0.05);
	}
	
	@Test
	public void testGetPromovabilitateUpperBoundary() {
		Grupa grupa = new Grupa(1005);
		for(int i=0;i<10;i++)
		{
			Student student=new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(),0.05);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetPromovabilitateError() {
		Grupa grupaNoua=new Grupa(1077);
		grupaNoua.getPromovabilitate();
				
	}
	
	@Test(timeout=500)
	public void testTimeoutPromovabilitate() {
		grupa.getPromovabilitate();
	}
	
	
	
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
