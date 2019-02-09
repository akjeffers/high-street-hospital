package employees;

public class Surgeon extends Doctor {

	private boolean mainTaskStatus;
	private int pay;
	
	public Surgeon(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.mainTaskStatus = false;
		this.pay = 120000;
	}
	
	// Getters

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

	public int getPay() {
		return pay;
	}
}