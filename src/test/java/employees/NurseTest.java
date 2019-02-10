package employees;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import patient.Patient;

public class NurseTest {
	
	Nurse underTest;
	Patient patientTest;
	@Before
	public void setup() {
		underTest = new Nurse("Nancy", "888", "nurse");
		patientTest = new Patient("Fancy", "45", 20, 10);
	}
	
	@Test
	public void shouldCareForPatient() {
		int healthBeforeCare = patientTest.getHealthLevel();
		underTest.careForPatient(patientTest);
		int healthAfterCare = patientTest.getHealthLevel();
		assertEquals(healthAfterCare, healthBeforeCare + 2);
	}

	
}
