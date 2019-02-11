package employees;

public class Receptionist extends Employee {

	private Boolean mainTaskStatus;
	
	public Receptionist(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.mainTaskStatus = false;
	}
	
	public Boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

// Start of Methods
	public void togglePhoneStatus() {
		mainTaskStatus = !mainTaskStatus;
	}

	@Override
	public int calculatePay() {
		return 45000;
	}

	@Override
	public String toString() {
		return getPosition() + " " + getName() + " " + getIdNumber() + " " + mainTaskStatus;
	}

}
