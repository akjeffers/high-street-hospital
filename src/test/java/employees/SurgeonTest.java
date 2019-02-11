package employees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import patient.Patient;

public class SurgeonTest {
	Surgeon underTest;
	Patient patientTest;

	@Before
	public void setup() {
		underTest = new Surgeon("Jen", "999", "surgeon");
		patientTest = new Patient("Fancy", "45", 20, 10);
	}

	@Test
	public void shouldCareForPatient() {
		int healthBeforeCare = patientTest.getHealthLevel();
		underTest.careForPatient(patientTest);
		int healthAfterCare = patientTest.getHealthLevel();
		assertEquals(healthAfterCare, healthBeforeCare + 5);
	}

	@Test
	public void shouldDrawnBloodFromPatient() {
		int bloodLevelBeforeDrawn = patientTest.getBloodLevel();
		underTest.drawBlood(patientTest);
		int bloodLevelAfterDrawn = patientTest.getBloodLevel();
		assertEquals(bloodLevelAfterDrawn, bloodLevelBeforeDrawn - 4);
	}
	
}
