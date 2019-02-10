package employees;

import patient.Patient;

public class Doctor extends Employee implements BloodDraw, CareForPatient {
	
	private String specialty;
	private int pay;
	
	public Doctor(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.specialty = specialty;
		this.pay = 90000;
	}
	
	public String toString() {
		return getPosition() + " " + getName() + " " + getIdNumber() + " " + specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	//add specialty area thing...........................................

	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealth(3);
		
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
