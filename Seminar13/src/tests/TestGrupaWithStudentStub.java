package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaWithStudentStub {

	
	@Test
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitate() {
		Grupa grupa1=new Grupa(1077);
		IStudent studentStub=new StudentStub(); 
		grupa1.adaugaStudent(studentStub);
		assertEquals(1, grupa1.getPromovabilitate(), 0.01);
	}

}
