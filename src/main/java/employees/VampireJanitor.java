package employees;

import hospital.Hospital;
import patient.Patient;

public class VampireJanitor extends Janitor implements BloodDraw, Sweeping {
	
	boolean mainTaskStatus;
	boolean bloodSucking;
	

	public VampireJanitor(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.bloodSucking = false;
		this.mainTaskStatus = false;		
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(2);
	}

	@Override
	public int calculatePay() {
		return 40000;
	}

	@Override
	public String toString() {
		return getPosition() + " " + getName() + " " + getIdNumber() + " " + mainTaskStatus;
	}

	@Override
	public void sweepHospital(Hospital hospital) {
		hospital.getCleaner(5);	
	}

}