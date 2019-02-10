package employees;

import hospital.Hospital;

public class NormalJanitor extends Janitor implements Sweeping {
	
	private boolean mainTaskStatus;

	public NormalJanitor(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.mainTaskStatus = false;
	}
	
	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}
	
	public void toggleMainTaskStatus() {
		mainTaskStatus = !mainTaskStatus;
	}

	@Override
	public int calculatePay() {
		return 40000;
	}

	@Override
	public String toString() {
		return getPosition() + " " + getName() + " " + getIdNumber() + mainTaskStatus;
	}

	@Override
	public void sweepHospital(Hospital hospital) {
		hospital.getCleaner(10);
	}
}
