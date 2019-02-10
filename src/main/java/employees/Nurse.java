package employees;

import patient.Patient;

public class Nurse extends Employee implements BloodDraw, CareForPatient {

	private int pay;
	
	public Nurse(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.pay = 50000;
	}

// Getters
	
	public int getPay() {
		return pay;
	}
	
	

	@Override
	public int calculatePay() {
		return 50000;
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealth(2);
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(1);

		
	}

}
