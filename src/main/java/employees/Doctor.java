package employees;

public abstract class Doctor extends Employee {
	
	private String specialty;
	private int pay;
	
	public Doctor(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.specialty = specialty;
		this.pay = 90000;
	}
	
	//add specialty area thing...........................................

}
