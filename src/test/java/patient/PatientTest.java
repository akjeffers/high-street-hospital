package patient;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PatientTest {
	Patient underTest;
@Before
public void setup() {
	underTest = new Patient("John", "555", 50, 50);
	
}

@Test
public void shouldHaveName() {
	underTest.getName();
	assertEquals("John", underTest.getName());
}

}
