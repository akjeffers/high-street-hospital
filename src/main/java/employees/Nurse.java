package employees;

import patient.Patient;

public class Nurse extends Employee implements BloodDraw, CareForPatient {

	public Nurse(String name, String idNumber, String position) {
		super(name, idNumber, position);
	}
	
	//add collection of patients?...............................................

	@Override
	public int calculatePay() {
		return 50000;
	}

	@Override
	public void careForPatient(Patient patientName) {
		patientName.increaseHealth(2);
		patientName.increaseBlood(2);
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(1);
	}

	@Override
	public String toString() {
		return getPosition() + " " + getName() + " " + getIdNumber();
		//add printing of collection of patients, or as separate method?.............
	}

}
