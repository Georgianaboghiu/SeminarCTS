package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.TestGrupa;
import tests.TestGrupaWithStudentFake;
import tests.TestGrupaWithStudentStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupa.class, TestGrupaWithStudentFake.class,
	TestGrupaWithStudentStub.class})
public class AllTests {

}
