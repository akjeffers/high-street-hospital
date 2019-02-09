package employees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReceptionistTest {
	Receptionist underTest;
	
	@Before 
	public void setup() {
		underTest = new Receptionist("Jason", "777", "receptionist");
	}
	
	@Test
	public void answerTheDamnPhone() {
		Boolean phoneStatusBeforeAnswering = underTest.getMainTaskStatus();
		underTest.togglePhoneStatus();
		Boolean phoneStatusAfterAnswering = underTest.getMainTaskStatus();
		assertEquals(true, phoneStatusAfterAnswering);
	}
	
	@Test
	public void hangUpTheDamnPhone() {
		Boolean phoneStatusBeforeHangingUp = underTest.getMainTaskStatus();
		underTest.togglePhoneStatus();
		underTest.togglePhoneStatus();
		Boolean phoneStatusAfterHangingUp = underTest.getMainTaskStatus();
		assertEquals(false, phoneStatusAfterHangingUp);
	}

}
