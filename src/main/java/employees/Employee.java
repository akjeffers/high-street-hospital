package employees;

public abstract class Employee {
	
	private String name;
	private String idNumber;
	private String position;
	private int pay;
	
	public Employee(String name, String idNumber, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.position = position;
		this.pay = pay;
	}

	public String getName() {
		return name;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	
	public String getPosition() {
		return position;
	}
	
	public int getPay() {
		return pay;
	}

	public String calculatePay() {
		return "$" + pay;
	}
	
//	public String toString() {
//		return position + " " + name;
//		// + " " + idNumber
//	}

}
