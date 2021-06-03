package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import clase.Grupa;
import clase.Student;

public class TesteGrupaCuFixture {
	
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
	@Category({TesteGetPromovabilitate.class, TesteNormale.class})
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
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitateLowerBoundary() {
		assertEquals(0, grupa.getPromovabilitate(),0.05);
	}
	
	@Test(timeout=500)
	@Category({TesteGetPromovabilitate.class})
	public void testTimeoutPromovabilitate() {
		grupa.getPromovabilitate();
	}
	

}
