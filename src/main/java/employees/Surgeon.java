package employees;

public class Surgeon {

	public Surgeon(String name) {

	}

	private String name;
	private String idNumber;
	private boolean mainTaskStatus;
	private int pay;

	public Surgeon(String name, String idNumber, boolean workStatus) {
		this.name = name;
		this.idNumber = idNumber;
		this.mainTaskStatus = false;
		this.pay = 120000;
	}
	// Getters

	public String getName() {
		return name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

	public int getPay() {
		return pay;
	}
}