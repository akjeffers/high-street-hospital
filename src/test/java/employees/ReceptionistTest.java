package employees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReceptionistTest {
	Receptionist underTest;
	
	@Before 
	public void setup() {
		underTest = new Receptionist("");
	}
	@Test
	public void answerTheDamnPhone() {
		Boolean phoneStatusBeforeAnswering = underTest.getAnswerTheDamnPhone();
		underTest.togglePhoneStatus();
		Boolean phoneStatusAfterAnswering = underTest.getAnswerTheDamnPhone();
		assertEquals(false, phoneStatusBeforeAnswering);

	}

}
