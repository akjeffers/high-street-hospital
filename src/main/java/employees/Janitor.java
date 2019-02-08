package employees;

public class Janitor {
	
	private String name;
	private String idNumber;
	private boolean mainTaskStatus;
	private int hospitalCleanliness;
	private int pay;
	
	public Janitor(String name, String idNumber, boolean workStatus) {
		this.name = name;
		this.idNumber = idNumber;
		this.mainTaskStatus = false;
		this.pay = 40000;
	}

	public String getName() {
		return name;
	}
	
	public String getIdNumber() {
		return idNumber;
	}

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}
	
	public int getHospitalCleanliness() {
		return hospitalCleanliness;
	}
	
	public int getPay() {
		return pay;
	}

	public void cleanHospital() {
		hospitalCleanliness += 10;
	}

	public void toggleWorkStatus() {
		mainTaskStatus = !mainTaskStatus;
	}
	
}