package employees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Hospital;

public class JanitorTest {

	Janitor underTest;
	Hospital hospitalTest;
	@Before
	public void setup() {
		underTest = new NormalJanitor("Jorge", "234", "janitor");
		hospitalTest = new Hospital();
	}
	
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
