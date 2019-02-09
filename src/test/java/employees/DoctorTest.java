package employees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import patient.Patient;


public class DoctorTest {
	
	Doctor underTest;
	@Before
	public void setup() {
		underTest = new Surgeon("Bob", "123", "surgeon");
	}
	
	@Test
	public void shouldPrintString() {
		underTest.toString();
		System.out.println(underTest.toString());
	}

	@Test
	public void shouldGetName() {
		underTest.getName();
		System.out.println(underTest.getName());
	}

}
