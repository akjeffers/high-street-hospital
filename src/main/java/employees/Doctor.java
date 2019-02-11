package employees;

import patient.Patient;

public class Doctor extends Employee implements BloodDraw, CareForPatient {
	
	private String specialty;
	
	public Doctor(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.specialty = specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public String toString() {
		return getPosition() + " " + getName() + " " + getIdNumber() + " " + specialty;
	}
	
	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealth(3);	
		patient.increaseBlood(2);
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(2);	
	}

	@Override
	public int calculatePay() {
		return 90000;
	}

}
