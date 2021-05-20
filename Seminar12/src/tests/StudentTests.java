package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTests {
	
	Student student=null;
	
	@Before
	public void setUp() {
		student=new Student();
	}

	
	
	@Test
	public void testApelCorectConstructorCuParametru() {
		String nume="Ion";
		Student student1=new Student(nume);
		assertEquals(nume, student1.getNume());
	}
	
	@Test
	public void testApelConstructorFaraParametru() {
		String nume="Student";
		Student student1=new Student();
		assertEquals(nume, student1.getNume());
	}
	
	@Test
	public void testInitializareConstructorFaraParametri() {
		//Student student=new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNotaInLista() {
		//Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testMarimeListaCorecta() {
		//Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testSetareNume() {
		//Student student=new Student();
		String nume="Popescu";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testCalculeazaMedia() {
		
		int nota1=8;
		int nota2=7;
		
		float medie=(nota1+nota2)/2.0f;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertEquals(medie,  student.calculeazaMedie(),0.01);
		
	}
	
	@Test
	public void testCalculMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculeazaMediePentruONota() {
		int nota=9;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testVerificareRestante() {
		int nota=4;
		int nota1= 10;
		student.adaugaNota(nota);
		student.adaugaNota(nota1);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificareNuAreRestante() {
		int nota=5;
		int nota1= 10;
		student.adaugaNota(nota);
		student.adaugaNota(nota1);
		
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testVerificareRestanteFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testCalculeazaGetNota() {
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(-1));
	}
	
	
	@Test
	public void testCalculeazaGetNotaJu3() {
		int nota=10;
		student.adaugaNota(nota);
		try {
		assertEquals(nota, student.getNota(-1));
		fail("");
		}catch(IndexOutOfBoundsException err){
			
		}
		
	}
	

}
