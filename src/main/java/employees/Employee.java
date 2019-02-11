package employees;

import java.util.HashMap;

public abstract class Employee {
	
	private String name;
	private String idNumber;
	private String position;
	
	public Employee(String name, String idNumber, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.position = position;
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
	
	public abstract int calculatePay();
	
	public abstract String toString();

}
