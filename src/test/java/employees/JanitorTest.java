package employees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JanitorTest {

	Janitor underTest;
	


	@Before
	public void setup() {
		underTest = new Janitor("");
		
	}
	
	@Test
	public void shouldHaveName() {
		assertEquals(underTest.getName(), "");
	}

	@Test 
	public void shouldCleanHospital() {
		Boolean hospitalIsDirty
		underTest.cleanHospital();
		
	}
	
}
