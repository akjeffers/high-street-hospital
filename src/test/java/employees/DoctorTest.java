package employees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import patient.Patient;

public class DoctorTest {

	Doctor underTest;
	Patient patientTest;

	@Before
	public void setup() {
		underTest = new Doctor("Bob", "123", "Doctor");
		patientTest = new Patient("Fancy", "45", 20, 10);
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

	@Test
	public void shouldCareForPatient() {
		int healthBeforeCare = patientTest.getHealthLevel();
		underTest.careForPatient(patientTest);
		int healthAfterCare = patientTest.getHealthLevel();
		assertEquals(healthAfterCare, healthBeforeCare + 3);
	}
	
	@Test 
	public void shouldDrawBloodFromPatient() {
		int bloodLevelBeforeDrawn = patientTest.getBloodLevel();
		underTest.drawBlood(patientTest);
		int bloodLevelAfterDrawn = patientTest.getBloodLevel();
		assertEquals(bloodLevelAfterDrawn, bloodLevelBeforeDrawn - 2);
	}
}