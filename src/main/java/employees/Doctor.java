package employees;

public abstract class Doctor extends Employee {
	
	private String specialty;
	private int pay;
	
	public Doctor(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.specialty = specialty;
		this.pay = 90000;
	}
	
	public String toString() {
		return getPosition() + " " + getName() + " " + getIdNumber() + " " + specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	//add specialty area thing...........................................

}
