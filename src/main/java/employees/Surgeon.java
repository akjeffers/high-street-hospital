package employees;

import patient.Patient;

public class Surgeon extends Doctor implements BloodDraw, CareForPatient {

	private boolean mainTaskStatus;
	private int pay;
	private String specialty;
	
	public Surgeon(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.mainTaskStatus = false;
		this.pay = 120000;
		this.specialty = "surgeon";
	}
	
	// Getters

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

	public int getPay() {
		return pay;
	}
	
	public String getSpecialty() {
		return specialty;
	}

	@Override
	public int calculatePay() {
		return 120000;
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealth(i);
		
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(5);
	}
}