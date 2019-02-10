package employees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JanitorTest {

	Janitor underTest;
	@Before
	public void setup() {
		underTest = new NormalJanitor("Jorge", "234", "janitor");
	}
	
	//change below test after making interface method...................................
//	@Test 
//	public void shouldCleanHospital() {
//		int cleanlinessBeforeCleaning = underTest.getHospitalCleanliness();
//		underTest.cleanHospital();
//		int cleanlinessAfterCleaning = underTest.getHospitalCleanliness();
//		assertEquals(cleanlinessAfterCleaning, cleanlinessBeforeCleaning + 10);
//	}
	
	@Test
	public void shouldDoMainWorkTask() {
		boolean mainTaskStatusBefore = underTest.getMainTaskStatus();
		underTest.toggleWorkStatus();
		boolean mainTaskStatusAfter = underTest.getMainTaskStatus();
		assertEquals(true, mainTaskStatusAfter);
	}
	
	@Test
	public void shouldStopDoingMainWorkTask() {
		boolean workStatusBeforeStopping = underTest.getMainTaskStatus();
		underTest.toggleWorkStatus();
		underTest.toggleWorkStatus();
		boolean workStatusAfterStopping = underTest.getMainTaskStatus();
		assertEquals(false, workStatusAfterStopping);
	}
}
