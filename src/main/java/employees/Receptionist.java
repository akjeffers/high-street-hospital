package employees;

public class Receptionist extends Employee {

	private Boolean mainTaskStatus;
	private int pay;
	
	public Receptionist(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.mainTaskStatus = false;
		this.pay = 45000;
	}

// Getters
	
	public Boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

	public int getPay() {
		return pay;
	}

// Start of Methods
	public void togglePhoneStatus() {
		mainTaskStatus = !mainTaskStatus;
	}

}
