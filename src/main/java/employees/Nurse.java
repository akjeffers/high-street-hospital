package employees;

public class Nurse extends Employee {

	private int pay;
	
	public Nurse(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.pay = 50000;
	}

// Getters
	
	public int getPay() {
		return pay;
	}

}
