package employees;

public class Receptionist {

	private String name;
	private String idNumber;
	private Boolean mainTaskStatus;
	private int pay;

	public Receptionist(String name, String idNumber, boolean workStatus) {
		this.name = name;
		this.idNumber = idNumber;
		this.mainTaskStatus = false;
		this.pay = 45000;

	}

// Getters
	public String getName() {
		return name;

	}

	public String getIdNumber() {
		return idNumber;
	}

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
