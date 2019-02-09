package employees;

public class Surgeon extends Doctor {

	private boolean mainTaskStatus;
	private int pay;
	private String specialty;
	
	public Surgeon(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.mainTaskStatus = false;
		this.pay = 120000;
		this.specialty = "surgeon";
	}
	
	// Getters

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

	public int getPay() {
		return pay;
	}
	
	public String getSpecialty() {
		return specialty;
	}
}