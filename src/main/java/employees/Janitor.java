package employees;

public class Janitor extends Employee {
	
	private boolean mainTaskStatus;
	private int hospitalCleanliness;
	private int pay;
	
	public Janitor(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.mainTaskStatus = false;
		this.hospitalCleanliness = hospitalCleanliness;
		this.pay = 40000;
	}

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}
	
	public int getHospitalCleanliness() {
		return hospitalCleanliness;
	}
	
	public int getPay() {
		return pay;
	}

	public void cleanHospital() {
		hospitalCleanliness += 10;
	}

	public void toggleWorkStatus() {
		mainTaskStatus = !mainTaskStatus;
	}
	
}