package employees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import patient.Patient;


public class DoctorTest {
	
	Doctor underTest;
	@Before
	public void setup() {
		underTest = new Doctor("Bob", "123", "doctor");
	}


}
