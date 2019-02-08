package employees;

public class Doctor {
	
	private String name;
	private String idNumber;
	private String specialty;

	public Doctor(String name, String idNumber, String specialty) {
		this.name = name;
		this.idNumber = idNumber;
		this.specialty = specialty;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return idNumber;
	}

}
