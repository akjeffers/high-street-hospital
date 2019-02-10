package employees;

import patient.Patient;

public class VampireJanitor extends Janitor implements BloodDraw {

	public VampireJanitor(String name, String idNumber, String position) {
		super(name, idNumber, position);

	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(2);
		
	}

	@Override
	public int calculatePay() {
		
		return 40000;
	}

}