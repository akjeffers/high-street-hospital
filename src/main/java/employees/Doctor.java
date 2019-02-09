package employees;

public class Doctor {
	
	private String name;
	private String idNumber;
	private String specialty;
	private int pay;

	public Doctor(String name, String idNumber, String specialty) {
		this.name = name;
		this.idNumber = idNumber;
		this.specialty = specialty;
		this.pay = 90000;
	}
	
	//add specialty area thing...........................................

	public String getName() {
		return name;
	}

	public String getId() {
		return idNumber;
	}

}
