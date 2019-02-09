package employees;

public class Nurse {

	private String name;
	private String idNumber;
	private int pay;

	public Nurse(String name, String idNumber) {
		this.name = name;
		this.idNumber = idNumber;
		this.pay = 50000;
	}

// Getters
	public String getName() {
		return name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public int getPay() {
		return pay;
	}

}
