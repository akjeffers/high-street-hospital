package employees;

import patient.Patient;

public class Surgeon extends Doctor implements BloodDraw, CareForPatient {

	private boolean mainTaskStatus;
	private String specialty;
	
	public Surgeon(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.mainTaskStatus = false;
		this.specialty = "surgeon";
	}
	
	// Getters

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
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
		patient.increaseHealth(5);	
		patient.increaseBlood(3);
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(4);
	}
	
	@Override
	public String toString() {
		return getPosition() + " " + getName() + " " + getIdNumber() + " " + getMainTaskStatus();	
	}
	
}