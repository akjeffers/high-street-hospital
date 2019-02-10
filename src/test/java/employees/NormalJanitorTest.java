package employees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Hospital;

public class NormalJanitorTest {
	
	NormalJanitor underTest;
	Hospital hospitalTest;
	
	@Before
	public void setup() {
		underTest = new NormalJanitor("Joe", "989", "janitor");
		hospitalTest = new Hospital();
	}
	
	@Test
	public void shouldSweepHospital() {
		int cleanlinessBeforeCleaning = hospitalTest.getCleanliness();
		underTest.toggleWorkStatus();
		underTest.sweepHospital(hospitalTest);
		int cleanlinessAfterCleaning = hospitalTest.getCleanliness();
		assertEquals(cleanlinessAfterCleaning, cleanlinessBeforeCleaning + 10);
	}

}
